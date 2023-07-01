package io.riskscanner.base.mapper.ext;


import io.riskscanner.base.domain.ScanHistory;
import io.riskscanner.base.rs.ChartData;
import io.riskscanner.base.rs.DashboardTarget;
import io.riskscanner.dto.ScanHistoryDTO;

import java.util.List;
import java.util.Map;

/**
 * @author maguohao
 * @date 2020-05-25 16:17
 */
public interface ExtVulnMapper {

    List<ChartData> overall(Map<String, Object> params);

    List<ChartData> ruleGroup(Map<String, Object> params);

    List<ChartData> report(Map<String, Object> params);

    List<ChartData> ruleList(Map<String, Object> params);

    List<ChartData> accountList(Map<String, Object> params);

    List<ChartData> regionsList(Map<String, Object> params);

    List<Map<String, Object>> severityList(Map<String, Object> params);

    List<Map<String, Object>> totalPolicy(Map<String, Object> params);

    List<DashboardTarget> target(Map<String, Object> params);

    List<ScanHistoryDTO> history(Map<String, Object> params);
}
