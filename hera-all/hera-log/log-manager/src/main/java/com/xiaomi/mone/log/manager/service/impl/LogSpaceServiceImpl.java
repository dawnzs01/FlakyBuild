package com.xiaomi.mone.log.manager.service.impl;

import com.xiaomi.mone.log.api.enums.LogStructureEnum;
import com.xiaomi.mone.log.api.enums.MachineRegionEnum;
import com.xiaomi.mone.log.api.enums.OperateEnum;
import com.xiaomi.mone.log.api.enums.ProjectSourceEnum;
import com.xiaomi.mone.log.common.Result;
import com.xiaomi.mone.log.exception.CommonError;
import com.xiaomi.mone.log.manager.common.context.MoneUserContext;
import com.xiaomi.mone.log.manager.dao.MilogLogstoreDao;
import com.xiaomi.mone.log.manager.dao.MilogSpaceDao;
import com.xiaomi.mone.log.manager.domain.Tpc;
import com.xiaomi.mone.log.manager.model.MilogSpaceParam;
import com.xiaomi.mone.log.manager.model.convert.MilogSpaceConvert;
import com.xiaomi.mone.log.manager.model.dto.MapDTO;
import com.xiaomi.mone.log.manager.model.dto.MilogSpaceDTO;
import com.xiaomi.mone.log.manager.model.page.PageInfo;
import com.xiaomi.mone.log.manager.model.pojo.MilogLogStoreDO;
import com.xiaomi.mone.log.manager.model.pojo.MilogSpaceDO;
import com.xiaomi.mone.log.manager.service.BaseService;
import com.xiaomi.mone.log.manager.service.LogSpaceService;
import com.xiaomi.mone.tpc.common.vo.NodeVo;
import com.xiaomi.mone.tpc.common.vo.PageDataVo;
import com.xiaomi.youpin.docean.anno.Service;
import com.xiaomi.youpin.docean.common.StringUtils;
import com.xiaomi.youpin.docean.plugin.db.Transactional;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class LogSpaceServiceImpl extends BaseService implements LogSpaceService {

    @Resource
    private MilogSpaceDao milogSpaceDao;

    @Resource
    private MilogLogstoreDao milogLogstoreDao;

    @Resource
    private TpcSpaceAuthService spaceAuthService;

    @Resource
    private LogTailServiceImpl logTailService;

    @Resource
    private Tpc tpc;

    /**
     * 新建
     *
     * @param param
     * @return
     */
    @Override
    public Result<String> newMilogSpace(MilogSpaceParam param) {
        if (Objects.isNull(param) || StringUtils.isBlank(param.getSpaceName())) {
            return Result.failParam("参数错误");
        }

        String spaceName = param.getSpaceName();
        if (milogSpaceDao.verifyExistByName(spaceName)) {
            return Result.failParam("存在同名spaceName");
        }

        MilogSpaceDO milogSpaceDO = wrapMilogSpaceDO(param);
        wrapBaseCommon(milogSpaceDO, OperateEnum.ADD_OPERATE);

        MilogSpaceDO dbDO = milogSpaceDao.newMilogSpace(milogSpaceDO);
        if (Objects.isNull(dbDO.getId())) {
            return Result.failParam("space未保存成功，请重试");
        }

        com.xiaomi.youpin.infra.rpc.Result tpcResult = spaceAuthService.saveSpacePerm(dbDO, MoneUserContext.getCurrentUser().getUser());
        if (tpcResult == null || tpcResult.getCode() != 0) {
            milogSpaceDao.deleteMilogSpace(dbDO.getId());
            log.error("新建space未关联权限系统,space:[{}], tpcResult:[{}]", dbDO, tpcResult);
            return Result.failParam("space未关联权限系统");
        }

        return Result.success();
    }

    private MilogSpaceDO wrapMilogSpaceDO(MilogSpaceParam param) {
        MilogSpaceDO milogSpaceDO = new MilogSpaceDO();
        milogSpaceDO.setSpaceName(param.getSpaceName());
        milogSpaceDO.setDescription(param.getDescription());
        return milogSpaceDO;
    }

    /**
     * getById
     *
     * @param id
     * @return
     */
    public Result<MilogSpaceDTO> getMilogSpaceById(Long id) {
        if (null == id) {
            return new Result<>(CommonError.ParamsError.getCode(), "id不能为空");
        }
        MilogSpaceDO milogSpace = milogSpaceDao.getMilogSpaceById(id);
        if (null != milogSpace) {
            MilogSpaceDTO milogSpaceDTO = new MilogSpaceDTO();
            milogSpaceDTO.setCreator(milogSpace.getCreator());
            milogSpaceDTO.setCtime(milogSpace.getCtime());
            milogSpaceDTO.setDescription(milogSpace.getDescription());
            milogSpaceDTO.setId(milogSpace.getId());
            milogSpaceDTO.setTenantId(milogSpace.getTenantId());
            milogSpaceDTO.setTenantName("todo");
            milogSpaceDTO.setUtime(milogSpace.getUtime());
            milogSpaceDTO.setSpaceName(milogSpace.getSpaceName());
            return new Result<>(CommonError.Success.getCode(), CommonError.Success.getMessage(), milogSpaceDTO);
        }
        return new Result<>(CommonError.NOT_EXISTS_DATA.getCode(), CommonError.NOT_EXISTS_DATA.getMessage());
    }

    /**
     * 分页查询
     *
     * @param spaceName
     * @param page
     * @param pagesize
     * @return
     */
    public Result<PageInfo<MilogSpaceDTO>> getMilogSpaceByPage(String spaceName, Integer page, Integer pagesize) {
        com.xiaomi.youpin.infra.rpc.Result<PageDataVo<NodeVo>> userPermSpacePage = spaceAuthService.getUserPermSpace(spaceName, page, pagesize);
        PageInfo<MilogSpaceDTO> spaceDTOPageInfo = MilogSpaceConvert.INSTANCE.fromTpcPage(userPermSpacePage.getData());
        return Result.success(spaceDTOPageInfo);
    }

    public Result<List<MapDTO<String, Long>>> getMilogSpaces() {
        com.xiaomi.youpin.infra.rpc.Result<PageDataVo<NodeVo>> tpcRes = spaceAuthService.getUserPermSpace("", 1, Integer.MAX_VALUE);
        if (tpcRes.getCode() != 0) {
            return Result.fail(CommonError.UNAUTHORIZED);
        }
        List<MapDTO<String, Long>> ret = new ArrayList<>();
        if (tpcRes.getData() == null || tpcRes.getData().getList() == null || tpcRes.getData().getList().isEmpty()) {
            return Result.success(ret);
        }
        List<NodeVo> list = tpcRes.getData().getList();
        for (NodeVo s : list) {
            ret.add(new MapDTO<>(s.getNodeName(), s.getOutId()));
        }
        return new Result<>(CommonError.Success.getCode(), CommonError.Success.getMessage(), ret);
    }

    /**
     * 更新
     *
     * @param param
     * @return
     */
    @Transactional
    public Result<String> updateMilogSpace(MilogSpaceParam param) {
        if (null == param || StringUtils.isBlank(param.getSpaceName())) {
            return new Result<>(CommonError.ParamsError.getCode(), "参数错误", "");
        }
        if (!tpc.hasPerm(MoneUserContext.getCurrentUser(), param.getId())) {
            return Result.fail(CommonError.UNAUTHORIZED);
        }
        if (milogSpaceDao.verifyExistByName(param.getSpaceName(), param.getId())) {
            return new Result<>(CommonError.UnknownError.getCode(), "存在同名spaceName", "");
        }
        MilogSpaceDO milogSpace = milogSpaceDao.queryById(param.getId());
        if (null == milogSpace) {
            return new Result<>(CommonError.ParamsError.getCode(), "logSpace 不存在", "");
        }
        wrapMilogSpace(milogSpace, param);
        wrapBaseCommon(milogSpace, OperateEnum.UPDATE_OPERATE);
        if (milogSpaceDao.update(milogSpace)) {
            com.xiaomi.youpin.infra.rpc.Result tpcResult = spaceAuthService.updateSpaceTpc(param, MoneUserContext.getCurrentUser().getUser());
            if (tpcResult == null || tpcResult.getCode() != 0) {
                log.error("修改space未关联权限系统,space:[{}], tpcResult:[{}]", milogSpace, tpcResult);
                return Result.success("修改space未关联权限系统，请联系服务端效能组");
            }
            return Result.success();
        } else {
            log.warn("[MilogSpaceService.updateMilogSpace] update MilogSpace err,spaceName:{},spaceId:{}", param.getSpaceName(), param.getId());
            return new Result<>(CommonError.UnknownError.getCode(), CommonError.UnknownError.getMessage(), "");
        }
    }

    @Transactional
    public Result<String> deleteMilogSpace(Long id) {
        if (null == id) {
            return new Result<>(CommonError.ParamsError.getCode(), "id不能为空", "");
        }
        if (!tpc.hasPerm(MoneUserContext.getCurrentUser(), id)) {
            return Result.fail(CommonError.UNAUTHORIZED);
        }
        MilogSpaceDO milogSpace = milogSpaceDao.getMilogSpaceById(id);
        if (null == milogSpace) {
            return new Result<>(CommonError.ParamsError.getCode(), "logSpace 不存在", "");
        }
        List<MilogLogStoreDO> stores = milogLogstoreDao.getMilogLogstoreBySpaceId(id);
        if (stores != null && stores.size() != 0) {
            return new Result<>(CommonError.ParamsError.getCode(), "该space 下存在store，无法删除", "");
        }
        if (milogSpaceDao.deleteMilogSpace(id)) {
            logTailService.deleteConfigRemote(id, id, MachineRegionEnum.CN_MACHINE.getEn(), LogStructureEnum.SPACE);

            com.xiaomi.youpin.infra.rpc.Result tpcResult = spaceAuthService.deleteSpaceTpc(id, MoneUserContext.getCurrentUser().getUser(), MoneUserContext.getCurrentUser().getUserType());
            if (tpcResult == null || tpcResult.getCode() != 0) {
                log.error("删除space未关联权限系统,space:[{}], tpcResult:[{}]", milogSpace, tpcResult);
                return Result.failParam("删除space未关联权限系统，请联系服务端效能组");
            }
            return Result.success();
        } else {
            log.warn("[MilogSpaceService.deleteMilogSpace] delete MilogSpace err,spaceId:{}", id);
            return Result.failParam("space删除失败，请重试");
        }
    }


    public Result<String> setSpacePermission(Long spaceId, String permDeptIds) {
        if (spaceId == null || StringUtils.isEmpty(permDeptIds)) {
            return Result.fail(CommonError.ParamsError);
        }
        MilogSpaceDO space = milogSpaceDao.getMilogSpaceById(spaceId);
        if (!permDeptIds.contains(space.getCreateDeptId())) {
            return Result.fail(CommonError.ParamsError.getCode(), "创建部门权限不可被取消");
        }
        space.setPermDeptId(permDeptIds);
        boolean update = milogSpaceDao.update(space);
        return update ? Result.success() : Result.fail(CommonError.UnknownError);
    }

    public MilogSpaceDO buildMiLogSpace(MilogSpaceParam cmd, String appCreator) {
        MilogSpaceDO ms = new MilogSpaceDO();
        wrapMilogSpace(ms, cmd, ProjectSourceEnum.ONE_SOURCE.getSource());
        wrapBaseCommon(ms, OperateEnum.ADD_OPERATE, appCreator);
        return ms;
    }
}
