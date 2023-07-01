package io.riskscanner.base.rs;

import com.huaweicloud.sdk.iam.v3.IamClient;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListServicesRequest;
import com.huaweicloud.sdk.iam.v3.model.KeystoneListServicesResponse;
import com.huaweicloud.sdk.iam.v3.model.Service;

import java.util.List;

/**
 * @author maguohao
 */
public class ServiceUtil {

    public static List<Service> listServices(IamClient iamClient ){
        KeystoneListServicesResponse response = iamClient.keystoneListServices(new KeystoneListServicesRequest());
        List<Service> services = response.getServices();
        return services;
    }
}
