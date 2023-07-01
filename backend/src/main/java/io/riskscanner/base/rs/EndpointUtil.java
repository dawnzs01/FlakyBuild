package io.riskscanner.base.rs;

import com.google.gson.Gson;
import io.riskscanner.commons.exception.RSException;
import io.riskscanner.commons.utils.ReadFileUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * @Author maguohao
 **/
public class EndpointUtil {
    protected static Logger log = LoggerFactory.getLogger(EndpointUtil.class);

    private static final String private_config_dir = "/support/credential/";

    private static ConfigEntity publicConfigEntity = null;
    private static ConfigEntity privateConfigEntity = null;

    public static String endpoint(String region, String type , boolean isPub) throws RSException {

        String endPoint = null;
        ConfigEntity config = isPub ? getPublicCloudConfig() : getPrivateCloudConfig();
        for (EndpointNode endpointNode : config.getEndpointNodes()) {
            if (StringUtils.equals(region, endpointNode.getRegion())
                    && StringUtils.equals(type, endpointNode.getType())){
                endPoint = endpointNode.getEndpoint();
                break;
            }
        }
        if (null == endPoint){
            RSException.throwException("没有对应的endpoint");
        }
        return endPoint;
    }
    public static ConfigEntity getPublicCloudConfig() throws RSException {
        if (null == publicConfigEntity){
            publicConfigEntity = readConfigFile(true);
        }
        return publicConfigEntity;
    }

    public static ConfigEntity getPrivateCloudConfig() throws RSException {
        if (null == privateConfigEntity){
            privateConfigEntity = readConfigFile(false);
        }
        return privateConfigEntity;
    }
    private static ConfigEntity readConfigFile(boolean isPublic) throws RSException {
        if (isPublic) return readConfigFile("support/credential/", "huawei-conf", ".json");
        String config_dir = private_config_dir;
        String resultStr = null;
        String fileName = "huawei-conf.json";
        InputStream is = null;
        BufferedReader br = null;
        try {
            String path = (StringUtils.endsWith(config_dir, "/") ? config_dir : (config_dir + "/")) + fileName;
            File file = new File(path);
            is = new FileInputStream(file);
            br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            StringBuffer sb = new StringBuffer();
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line.trim());
            }
            resultStr = sb.toString();
            ConfigEntity configEntity = new Gson().fromJson(resultStr, ConfigEntity.class);
            return configEntity;
        } catch (Exception e) {
            throw new RSException("The plugin does not yet support this operation.!「」" + e.getMessage());
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                }
                is = null;
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }
                br = null;
            }
        }
    }

    private static ConfigEntity readConfigFile(String baseDic, String fileName, String extension) throws RSException {
        try {
            String resultStr = ReadFileUtils.readConfigFile(baseDic, fileName, extension);
            ConfigEntity configEntity = new Gson().fromJson(resultStr, ConfigEntity.class);
            return configEntity;
        } catch (Exception e) {
            throw new RSException("Failed to load json file [huawei-conf.json].!");
        }
    }
}
