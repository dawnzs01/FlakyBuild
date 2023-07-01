package io.riskscanner.controller;

import io.riskscanner.base.domain.UserKey;
import io.riskscanner.commons.constants.RoleConstants;
import io.riskscanner.commons.utils.SessionUtils;
import io.riskscanner.security.ApiKeyHandler;
import io.riskscanner.service.UserKeyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import javax.servlet.ServletRequest;
import java.util.List;

@Api(tags = "API Keys")
@RestController
@RequestMapping("user/key")
@RequiresRoles(value = {RoleConstants.ADMIN}, logical = Logical.OR)
public class UserKeysController {

    @Resource
    private UserKeyService userKeyService;

    @ApiOperation(value = "API Keys信息")
    @GetMapping("info")
    public List<UserKey> getUserKeysInfo() {
        String userId = SessionUtils.getUser().getId();
        return userKeyService.getUserKeysInfo(userId);
    }

    @ApiOperation(value = "校验API Keys")
    @GetMapping("validate")
    public String validate(ServletRequest request) throws Exception {
        return ApiKeyHandler.getUser(WebUtils.toHttp(request));
    }

    @ApiOperation(value = "生成API Keys")
    @GetMapping("generate")
    public void generateUserKey() {
        String userId = SessionUtils.getUser().getId();
        userKeyService.generateUserKey(userId);
    }

    @ApiOperation(value = "删除API Keys")
    @GetMapping("delete/{id}")
    public void deleteUserKey(@PathVariable String id) {
        userKeyService.deleteUserKey(id);
    }

    @ApiIgnore
    @GetMapping("active/{id}")
    public void activeUserKey(@PathVariable String id) {
        userKeyService.activeUserKey(id);
    }

    @ApiIgnore
    @GetMapping("disable/{id}")
    public void disabledUserKey(@PathVariable String id) {
        userKeyService.disableUserKey(id);
    }
}
