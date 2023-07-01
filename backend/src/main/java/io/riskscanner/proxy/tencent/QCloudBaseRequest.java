package io.riskscanner.proxy.tencent;

import com.google.gson.Gson;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.cvm.v20170312.CvmClient;
import io.riskscanner.base.domain.Proxy;
import io.riskscanner.commons.exception.RSException;
import io.riskscanner.proxy.Request;
import org.apache.commons.lang3.StringUtils;

public class QCloudBaseRequest extends Request {
    private static String DEFAULT_REGION = "ap-guangzhou";

    public QCloudBaseRequest() {
        super("", "");
    }

    public QCloudBaseRequest(Request req) {
        super(req.getCredential(), req.getRegionId());
        setCredential(req.getCredential());
        setRegionId(req.getRegionId());
    }

    public Credential getQCloudCredential() {
        return new Gson().fromJson(getCredential(), Credential.class);
    }

    public CvmClient getCvmClient(Proxy proxy) throws RSException {
        Credential qCloudCredential = getQCloudCredential();
        String region = getRegionId();
        if(StringUtils.isBlank(region)){
            region = DEFAULT_REGION;
        }
        return new CvmClient(qCloudCredential, region, getClientProfile(proxy));
    }

    private ClientProfile getClientProfile(Proxy proxy) {
        ClientProfile clientProfile = new ClientProfile();
        QCloudProxySetting proxySetting = ProxyUtils.getQProxySetting(proxy);
        if(proxySetting != null) {
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setProxyHost(proxySetting.getHost());
            httpProfile.setProxyPort(proxySetting.getPort());
            httpProfile.setProxyUsername(proxySetting.getUserName());
            httpProfile.setProxyPassword(proxySetting.getPassword());
            clientProfile.setHttpProfile(httpProfile);
        }
        return clientProfile;
    }
}
