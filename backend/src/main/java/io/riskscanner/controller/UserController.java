package io.riskscanner.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.riskscanner.base.domain.User;
import io.riskscanner.commons.constants.RoleConstants;
import io.riskscanner.commons.user.SessionUser;
import io.riskscanner.commons.utils.PageUtils;
import io.riskscanner.commons.utils.Pager;
import io.riskscanner.commons.utils.SessionUtils;
import io.riskscanner.controller.request.member.AddMemberRequest;
import io.riskscanner.controller.request.member.EditPassWordRequest;
import io.riskscanner.controller.request.member.QueryMemberRequest;
import io.riskscanner.controller.request.member.UserRequest;
import io.riskscanner.controller.request.organization.AddOrgMemberRequest;
import io.riskscanner.controller.request.organization.QueryOrgMemberRequest;
import io.riskscanner.dto.UserDTO;
import io.riskscanner.dto.UserRoleDTO;
import io.riskscanner.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "用户")
@RequestMapping("user")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "添加用户")
    @PostMapping("/special/add")
    @RequiresRoles(RoleConstants.ADMIN)
    public UserDTO insertUser(@RequestBody UserRequest user) throws Exception {
        return userService.insert(user);
    }

    @ApiOperation(value = "用户列表")
    @PostMapping("/special/list/{goPage}/{pageSize}")
    @RequiresRoles(RoleConstants.ADMIN)
    public Pager<List<User>> getUserList(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody io.riskscanner.controller.request.UserRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, userService.getUserListWithRequest(request));
    }

    @ApiOperation(value = "用户角色")
    @GetMapping("/special/user/role/{userId}")
    @RequiresRoles(RoleConstants.ADMIN)
    public UserRoleDTO getUserRole(@PathVariable("userId") String userId) {
        return userService.getUserRole(userId);
    }

    @ApiOperation(value = "删除用户")
    @GetMapping("/special/delete/{userId}")
    @RequiresRoles(RoleConstants.ADMIN)
    public void deleteUser(@PathVariable(value = "userId") String userId) {
        userService.deleteUser(userId);
    }

    @ApiOperation(value = "更新用户")
    @PostMapping("/special/update")
    @RequiresRoles(RoleConstants.ADMIN)
    public void updateUser(@RequestBody UserRequest user) {
        userService.updateUserRole(user);
    }

    @ApiOperation(value = "更新用户状态")
    @PostMapping("/special/update_status")
    @RequiresRoles(RoleConstants.ADMIN)
    public void updateStatus(@RequestBody User user) {
        userService.updateUser(user);
    }

    @ApiIgnore
    @PostMapping("/special/ws/member/list/{goPage}/{pageSize}")
    @RequiresRoles(RoleConstants.ADMIN)
    public Pager<List<User>> getMemberListByAdmin(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody QueryMemberRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, userService.getMemberList(request));
    }

    @ApiIgnore
    @PostMapping("/special/ws/member/list/all")
    @RequiresRoles(RoleConstants.ADMIN)
    public List<User> getMemberListByAdmin(@RequestBody QueryMemberRequest request) {
        return userService.getMemberList(request);
    }

    @ApiIgnore
    @PostMapping("/special/ws/member/add")
    @RequiresRoles(RoleConstants.ADMIN)
    public void addMemberByAdmin(@RequestBody AddMemberRequest request) {
        userService.addMember(request);
    }

    @ApiIgnore
    @GetMapping("/special/ws/member/delete/{workspaceId}/{userId}")
    @RequiresRoles(RoleConstants.ADMIN)
    public void deleteMemberByAdmin(@PathVariable String workspaceId, @PathVariable String userId) {
        userService.deleteMember(workspaceId, userId);
    }

    @ApiIgnore
    @PostMapping("/special/org/member/add")
    @RequiresRoles(RoleConstants.ADMIN)
    public void addOrganizationMemberByAdmin(@RequestBody AddOrgMemberRequest request) {
        userService.addOrganizationMember(request);
    }

    @ApiIgnore
    @GetMapping("/special/org/member/delete/{organizationId}/{userId}")
    @RequiresRoles(RoleConstants.ADMIN)
    public void delOrganizationMemberByAdmin(@PathVariable String organizationId, @PathVariable String userId) {
        userService.delOrganizationMember(organizationId, userId);
    }

    @ApiIgnore
    @PostMapping("/special/org/member/list/{goPage}/{pageSize}")
    @RequiresRoles(RoleConstants.ADMIN)
    public Pager<List<User>> getOrgMemberListByAdmin(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody QueryOrgMemberRequest request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, userService.getOrgMemberList(request));
    }

    @ApiIgnore
    @PostMapping("/special/org/member/list/all")
    @RequiresRoles(RoleConstants.ADMIN)
    public List<User> getOrgMemberListByAdmin(@RequestBody QueryOrgMemberRequest request) {
        return userService.getOrgMemberList(request);
    }

    @ApiOperation(value = "所有用户")
    @GetMapping("/list/all")
    public List<User> getUserList() {
        return userService.getUserList();
    }

    @ApiIgnore
    @PostMapping("/update/current")
    public UserDTO updateCurrentUser(@RequestBody User user) {
        userService.updateUser(user);
        UserDTO userDTO = userService.getUserDTO(user.getId());
        SessionUtils.putUser(SessionUser.fromUser(userDTO));
        return SessionUtils.getUser();
    }

    @ApiOperation(value = "用户信息")
    @GetMapping("/info/{userId}")
    public UserDTO getUserInfo(@PathVariable(value = "userId") String userId) {
        return userService.getUserInfo(userId);
    }

    @ApiIgnore
    @GetMapping("/besideorg/list/{orgId}")
    public List<User> getBesideOrgMemberList(@PathVariable String orgId) {
        return userService.getBesideOrgMemberList(orgId);
    }

    /**
     * 修改当前用户密码
     */
    @ApiOperation(value = "修改用户密码")
    @PostMapping("/update/password")
    public int updateCurrentUserPassword(@RequestBody EditPassWordRequest request) throws Exception {
        return userService.updateCurrentUserPassword(request);
    }

    /**
     * 管理员修改用户密码
     */
    @ApiIgnore
    @PostMapping("/special/password")
    public int updateUserPassword(@RequestBody EditPassWordRequest request) throws Exception {
        return userService.updateUserPassword(request);
    }

    @ApiIgnore
    @GetMapping("/search/{condition}")
    @RequiresRoles(value = {RoleConstants.ADMIN}, logical = Logical.OR)
    public List<User> searchUser(@PathVariable String condition) {
        return userService.searchUser(condition);
    }

}
