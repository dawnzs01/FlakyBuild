package io.riskscanner.base.rs;

import java.io.Serializable;
import java.util.List;

/**
 * @Author maguohao
 **/
public class ConfigEntity implements Serializable {


    private List<EndpointNode> endpointNodes;

    private String iamPoint;

    public List<EndpointNode> getEndpointNodes() {
        return endpointNodes;
    }

    public void setEndpointNodes(List<EndpointNode> endpointNodes) {
        this.endpointNodes = endpointNodes;
    }

    public String getIamPoint() {
        return iamPoint;
    }

    public void setIamPoint(String iamPoint) {
        this.iamPoint = iamPoint;
    }
}
