package io.metersphere.base.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class EnterpriseTestReportSendRecordWithBLOBs extends EnterpriseTestReportSendRecord implements Serializable {
    private String reportContent;

    private String addressee;

    private String duplicated;

    private static final long serialVersionUID = 1L;
}