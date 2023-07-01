package io.riskscanner.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.riskscanner.base.domain.Proxy;
import io.riskscanner.commons.constants.RoleConstants;
import io.riskscanner.commons.utils.PageUtils;
import io.riskscanner.commons.utils.Pager;
import io.riskscanner.service.ProxyService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "代理")
@RequestMapping("proxy")
@RestController
public class ProxyController {

    @Resource
    private ProxyService ProxyService;

    @ApiOperation(value = "添加代理")
    @PostMapping("/add")
    @RequiresRoles(RoleConstants.ADMIN)
    public Proxy insertProxy(@RequestBody Proxy Proxy) throws Exception {
        return ProxyService.insert(Proxy);
    }

    @ApiOperation(value = "代理列表")
    @PostMapping("/list/{goPage}/{pageSize}")
    @RequiresRoles(RoleConstants.ADMIN)
    public Pager<List<Proxy>> getProxyList(@PathVariable int goPage, @PathVariable int pageSize, @RequestBody Proxy request) {
        Page<Object> page = PageHelper.startPage(goPage, pageSize, true);
        return PageUtils.setPageInfo(page, ProxyService.getProxyListWithRequest(request));
    }

    @ApiOperation(value = "删除代理")
    @GetMapping("/delete/{proxyId}")
    @RequiresRoles(RoleConstants.ADMIN)
    public void deleteProxy(@PathVariable(value = "proxyId") int proxyId) {
        ProxyService.deleteProxy(proxyId);
    }

    @ApiOperation(value = "更新代理")
    @PostMapping("/update")
    @RequiresRoles(RoleConstants.ADMIN)
    public void updateProxy(@RequestBody Proxy proxy) {
        ProxyService.updateProxy(proxy);
    }

    @ApiOperation(value = "所有代理")
    @GetMapping("/list/all")
    public List<Proxy> getProxyList() {
        return ProxyService.getProxyList();
    }

}
