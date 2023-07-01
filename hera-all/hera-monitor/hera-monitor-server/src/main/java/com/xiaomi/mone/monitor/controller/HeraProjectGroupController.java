package com.xiaomi.mone.monitor.controller;

import com.xiaomi.mone.app.api.model.HeraAppBaseInfoModel;
import com.xiaomi.mone.app.api.model.project.group.HeraProjectGroupDataRequest;
import com.xiaomi.mone.app.api.model.project.group.ProjectGroupTreeNode;
import com.xiaomi.mone.app.api.service.HeraAuthorizationApi;
import com.xiaomi.mone.app.common.Result;
import com.xiaomi.mone.app.enums.CommonError;
import com.xiaomi.mone.monitor.service.model.project.group.ProjectGroupRequest;
import com.xiaomi.mone.monitor.service.project.group.ProjectGroupService;
import com.xiaomi.mone.tpc.login.util.UserUtil;
import com.xiaomi.mone.tpc.login.vo.AuthUserVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author gaoxihui
 * @date 2023/6/7 11:25 上午
 */
@Slf4j
@RestController
public class HeraProjectGroupController {

    @Autowired
    ProjectGroupService projectGroupService;

    @ResponseBody
    @PostMapping("/api/project-group/tree/full")
    public Result<ProjectGroupTreeNode> getFullTree(HttpServletRequest request, @RequestBody ProjectGroupRequest param) {

        AuthUserVo userInfo = UserUtil.getUser();
        if (userInfo == null) {
            Result result = projectGroupService.checkAuthorization(request);
            if(!result.isSuccess()){
                return result;
            }
        }

        log.info("getFullTree param : {}", param);

        if(param.getGroupType() == null){
            log.error("getFullTree request param error! no group type found!");
            return Result.fail(CommonError.ParamsError);
        }

        return projectGroupService.getFullTree(param.getGroupType());
    }

    @ResponseBody
    @PostMapping("/api/project-group/tree")
    public Result<ProjectGroupTreeNode> getTreeByUser(HttpServletRequest request, @RequestBody ProjectGroupRequest param) {

        AuthUserVo userInfo = UserUtil.getUser();
        if (userInfo == null) {
            Result result = projectGroupService.checkAuthorization(request);
            if(!result.isSuccess()){
                return result;
            }
        }else{
            param.setUser(userInfo.genFullAccount());
        }

        if(StringUtils.isBlank(param.getUser())){
            log.error("getTreeByUser request param error! no group type found!");
            return Result.fail(CommonError.ParamsError);
        }

        log.info("getFullTree param : {}", param);

        if(param.getGroupType() == null){
            log.error("getTreeByUser request param error! no group type found!");
            return Result.fail(CommonError.ParamsError);
        }

        return projectGroupService.getTreeByUser(param);
    }

    @ResponseBody
    @PostMapping("/api/project-group/app")
    public Result<List<HeraAppBaseInfoModel>> getGroupApps(HttpServletRequest request, @RequestBody ProjectGroupRequest param) {

        AuthUserVo userInfo = UserUtil.getUser();
        if (userInfo == null) {
            Result result = projectGroupService.checkAuthorization(request);
            if(!result.isSuccess()){
                return result;
            }
        }else{
            param.setUser(userInfo.genFullAccount());
        }

        if(StringUtils.isBlank(param.getUser())){
            log.error("getTreeByUser request param error! no group type found!");
            return Result.fail(CommonError.ParamsError);
        }

        log.info("getGroupApps param : {}", param);

        if(param.getGroupType() == null){
            log.error("getGroupApps request param error! no group type found!");
            return Result.fail(CommonError.ParamsError);
        }

        return projectGroupService.searchGroupApps(param);
    }

    @ResponseBody
    @PostMapping("/api/project-group/create")
    public Result createProjectGroup(HttpServletRequest request, @RequestBody HeraProjectGroupDataRequest param) {

        AuthUserVo userInfo = UserUtil.getUser();
        if (userInfo == null) {
            Result result = projectGroupService.checkAuthorization(request);
            if(!result.isSuccess()){
                return result;
            }
        }

        log.info("createProjectGroup param : {}", param);

        if(param.getType() == null || param.getRelationObjectId() == null || param.getParentGroupId() == null || StringUtils.isBlank(param.getName())){
            log.error("createProjectGroup request param error!param:{}",param);
            return Result.fail(CommonError.ParamsError);
        }

        return projectGroupService.create(param);
    }

    @ResponseBody
    @PostMapping("/api/project-group/update")
    public Result updateProjectGroup(HttpServletRequest request, @RequestBody HeraProjectGroupDataRequest param) {

        AuthUserVo userInfo = UserUtil.getUser();
        if (userInfo == null) {
            Result result = projectGroupService.checkAuthorization(request);
            if(!result.isSuccess()){
                return result;
            }
        }

        log.info("updateProjectGroup param : {}", param);

        if(param.getId() == null){
            log.error("updateProjectGroup request param error!param:{}",param);
            return Result.fail(CommonError.ParamsError);
        }

        return projectGroupService.update(param);
    }

    @ResponseBody
    @DeleteMapping("/api/project-group/delete/{id}")
    public Result deleteProjectGroup(HttpServletRequest request,@PathVariable("id") Integer id) {

        AuthUserVo userInfo = UserUtil.getUser();
        if (userInfo == null) {
            Result result = projectGroupService.checkAuthorization(request);
            if(!result.isSuccess()){
                return result;
            }
        }

        log.info("deleteProjectGroup id : {}", id);

        if(id == null){
            log.error("deleteProjectGroup request param error! id is null!");
            return Result.fail(CommonError.ParamsError);
        }

        return projectGroupService.delete(id);
    }
}
