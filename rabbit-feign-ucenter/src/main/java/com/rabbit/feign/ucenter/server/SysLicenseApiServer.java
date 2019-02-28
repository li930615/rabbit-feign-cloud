package com.rabbit.feign.ucenter.server;

import com.rabbit.feign.ucenter.model.entity.SysApi;
import com.rabbit.feign.ucenter.model.entity.SysLicense;
import com.rabbit.feign.ucenter.server.fallback.SysLicenseApiServerFallbackImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/2/17 17:37
 **/
@FeignClient(name = "rabbit-ucenter-server", fallback = SysLicenseApiServerFallbackImpl.class)
public interface SysLicenseApiServer {

    @GetMapping(value = {"/ucenter/sysLicense/getByAppId"})
    public abstract SysLicense getLicenseByAppId(@RequestParam("appId") String appId);

    @GetMapping(value = {"/ucenter/sysApi/listByAppId"})
    public abstract List<SysApi> listApiByAppId(@RequestParam("appId") String appId);
}
