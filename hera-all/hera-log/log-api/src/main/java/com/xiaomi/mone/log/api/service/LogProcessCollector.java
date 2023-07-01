package com.xiaomi.mone.log.api.service;

import com.xiaomi.mone.log.api.model.vo.AgentLogProcessDTO;
import com.xiaomi.mone.log.api.model.vo.TailLogProcessDTO;
import com.xiaomi.mone.log.api.model.vo.UpdateLogProcessCmd;

import java.util.List;

/**
 * @author wtt
 * @version 1.0
 * @description
 * @date 2022/12/6 14:32
 */
public interface LogProcessCollector {

    /**
     * 更新日志收集进度
     *
     * @param cmd
     */
    void collectLogProcess(UpdateLogProcessCmd cmd);

    /**
     * 查询tail的日志收集进度
     *
     * @param tailId
     * @param tailName
     * @param targetIp
     * @return
     */
    List<TailLogProcessDTO> getTailLogProcess(Long tailId, String tailName, String targetIp);

    /**
     * query by ip
     *
     * @param ip
     * @return
     */
    List<AgentLogProcessDTO> getAgentLogProcess(String ip);

    /**
     * 采集进度小于progressRatio
     *
     * @param progressRation 匹配采集进度
     * @return
     */
    List<UpdateLogProcessCmd.CollectDetail> getColProcessImperfect(Double progressRation);

    /**
     * 获取一个tail下的采集详情
     *
     * @param tailId
     * @return
     */
    List<UpdateLogProcessCmd.FileProgressDetail> getFileProcessDetailByTail(Long tailId);

    /**
     * get all coll detail
     *
     * @return
     */
    List<UpdateLogProcessCmd.CollectDetail> getAllCollectDetail(String ip);
}