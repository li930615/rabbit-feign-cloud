package com.rabbit.feign.ucenter.server;

import com.rabbit.feign.ucenter.model.entity.SysPermission;
import com.rabbit.feign.ucenter.server.fallback.SysPermissionServerFallbackImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/2/17 17:42
 **/
@FeignClient(name = "rabbit-ucenter-server", fallback = SysPermissionServerFallbackImpl.class)
public interface SysPermissionServer {

    @GetMapping({"/ucenter/permission/listByUserId/{userId}"})
    public abstract List<SysPermission> listByUserId(@PathVariable("userId") String userId);

    @GetMapping({"/ucenter/permission/listByAppCodeAndUserId"})
    public abstract List<SysPermission> listByAppCodeAndUserId(@RequestParam("appCode") String appCode, @RequestParam("userId") String userId);
}
