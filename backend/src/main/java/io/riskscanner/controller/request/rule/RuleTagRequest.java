package io.riskscanner.controller.request.rule;


import io.riskscanner.base.domain.RuleTag;

import java.util.Map;

/**
 * @author maguohao
 */
public class RuleTagRequest extends RuleTag {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Map<String, Object> combine;

    public Map<String, Object> getCombine() {
        return combine;
    }

    public void setCombine(Map<String, Object> combine) {
        this.combine = combine;
    }
}
