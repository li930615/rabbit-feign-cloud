package com.rabbit.feign.ucenter.server;

import com.rabbit.feign.ucenter.model.entity.SysApp;
import com.rabbit.feign.ucenter.server.fallback.SysAppServerFallbackImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/2/17 17:11
 **/
@FeignClient(name = "rabbit-ucenter-server", fallback = SysAppServerFallbackImpl.class)
public interface SysAppServer {

    @GetMapping(value = {"/ucenter/app/getByCode"})
    SysApp getByCode(@RequestParam("code") String paramString);
}
