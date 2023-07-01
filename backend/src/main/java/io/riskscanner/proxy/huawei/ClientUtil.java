package io.riskscanner.proxy.huawei;

import com.huaweicloud.sdk.ces.v1.CesClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.auth.BasicCredentials;
import com.huaweicloud.sdk.core.auth.GlobalCredentials;
import com.huaweicloud.sdk.core.http.HttpConfig;
import com.huaweicloud.sdk.ecs.v2.EcsClient;
import com.huaweicloud.sdk.evs.v2.EvsClient;
import com.huaweicloud.sdk.iam.v3.IamClient;
import com.huaweicloud.sdk.iam.v3.model.ProjectResult;
import com.huaweicloud.sdk.ims.v2.ImsClient;
import com.huaweicloud.sdk.vpc.v2.VpcClient;
import io.riskscanner.base.domain.Proxy;
import io.riskscanner.base.rs.*;
import io.riskscanner.commons.exception.RSException;
import io.riskscanner.proxy.Request;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;


/**
 * @author maguohao
 */
public class ClientUtil {

    private static ConcurrentHashMap<String, ClientBuilder> clientClassMap  = init();

    private static ConcurrentHashMap<String,ClientBuilder> init(){
        ConcurrentHashMap<String,ClientBuilder> map = new ConcurrentHashMap();
        map.put("ecs", EcsClient.newBuilder());
        map.put("vpc", VpcClient.newBuilder());
        map.put("ces", CesClient.newBuilder());
        map.put("ims", ImsClient.newBuilder());
        map.put("evs", EvsClient.newBuilder());
        return map;
    }

    private static ClientBuilder clientBuilder(String busiType) throws RSException {
        if (clientClassMap == null ){
            RSException.throwException("All client classes are not loaded");
        }
        if (!clientClassMap.containsKey(busiType)){
            RSException.throwException("This business type client does not exist");
        }
        ClientBuilder clientBuilder = clientClassMap.get(busiType);
        return clientBuilder;
    }

    private static HttpConfig httpConfig;

    private static HttpConfig getHttpConfig(Proxy proxy){
        if (proxy != null) {
            httpConfig = HttpConfig.getDefaultHttpConfig()
                    .withProxyHost("http://" + proxy.getProxyIp())
                    .withProxyPort(Integer.valueOf(proxy.getProxyPort()))
                    .withProxyUsername(proxy.getProxyName())
                    .withProxyPassword(proxy.getProxyPassword());
        } else {
            httpConfig = HttpConfig.getDefaultHttpConfig()
                    .withIgnoreSSLVerification(true)
                    .withTimeout(3000);
        }
        return httpConfig;
    }

    /*iamclient相关开始----------------*/
    private static String cloudIamPoint(boolean isPubclic) throws RSException{
        ConfigEntity config = isPubclic ? EndpointUtil.getPublicCloudConfig() : EndpointUtil.getPrivateCloudConfig();
        return config.getIamPoint();
    }
    public static IamClient getIamClient(IamRequest iamRequest, Proxy proxy) throws RSException{

        String endPoint = cloudIamPoint(iamRequest.getHuaweiCloudCredential().getPublic());
        GlobalCredentials globalCredentials = new GlobalCredentials()
                .withAk(iamRequest.getHuaweiCloudCredential().getAk())
                .withSk(iamRequest.getHuaweiCloudCredential().getSk())
                .withDomainId(iamRequest.getHuaweiCloudCredential().getDomainId());
        IamClient iamClient = IamClient.newBuilder()
                .withEndpoint(endPoint)
                .withCredential(globalCredentials)
                .withHttpConfig(getHttpConfig(proxy)).build();
        return iamClient;
    }
    public static IamClient getIamClient(String credential, Proxy proxy) throws RSException{
        try {
            Request request = new Request();
            request.setCredential(credential);
            IamRequest iamRequest = RequestUtil.request2IamRequest(request);
            return getIamClient(iamRequest, proxy);
        } catch (Exception e) {
            return null;
        }

    }
    /*iamclient相关结束----------------*/


    /*busiclient相关开始----------------*/

    public static<T> T getClient(BusiRequest busiRequest) throws RSException{
        Boolean projectIdNull = StringUtils.isEmpty(busiRequest.getHuaweiCloudCredential().getProjectId());
        Boolean regionIdNull =  StringUtils.isEmpty(busiRequest.getRegionId());
        if (projectIdNull && regionIdNull){
            RSException.throwException("Missing required parameters['projectId'||'regionId'] for constructing client");
        }

        if (StringUtils.isNotEmpty(busiRequest.getBusiType())) {
            IamClient iamClient = getIamClient(busiRequest, null);
            if (regionIdNull){
                ProjectResult project = ProjectUtil.project(iamClient, busiRequest.getHuaweiCloudCredential().getProjectId());
                busiRequest.setRegionId(project.getName());
            }
            if (projectIdNull){
                String userId = AuthUtil.validate(iamClient, busiRequest.getHuaweiCloudCredential().getAk()).getUserId();
                List<ProjectResult> projectResults = ProjectUtil.listProjects(iamClient, userId);
                projectResults = ProjectUtil.filterWithRequest(projectResults, busiRequest);
                if (projectResults.size() == 0 ){
                    RSException.throwException("There are no projects in this region["+busiRequest.getRegionId()+"]");
                }
                ProjectResult projectResult = projectResults.get(0);
                busiRequest.getHuaweiCloudCredential().setProjectId(projectResult.getId());
            }
            String busiType = busiRequest.getBusiType();
            String ak = busiRequest.getHuaweiCloudCredential().getAk();
            String sk = busiRequest.getHuaweiCloudCredential().getSk();
            BasicCredentials basicCredentials = new BasicCredentials()
                    .withAk(ak)
                    .withSk(sk)
                    .withProjectId(busiRequest.getHuaweiCloudCredential().getProjectId());
            String ecsPoint = EndpointUtil.endpoint(busiRequest.getRegionId(), busiType, busiRequest.getHuaweiCloudCredential().getPublic());
            ClientBuilder clientBuilder = clientBuilder(busiType);
            Object build = clientBuilder.withCredential(basicCredentials)
                    .withEndpoint(ecsPoint)
                    .withHttpConfig(getHttpConfig(null))
                    .build();
            return (T) build;
        }
        throw new RSException("Missing required parameters['busiType'] for constructing client");
    }


}
