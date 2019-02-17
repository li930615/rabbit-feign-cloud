package com.rabbit.feign.auth.server;

import com.rabbit.feign.auth.model.R;
import com.rabbit.feign.auth.server.fallback.AuthServerFallbackImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/2/17 16:33
 **/
@FeignClient(name = "rabbit-auth-server",fallback = AuthServerFallbackImpl.class)
public interface AuthServer {

    @GetMapping(value = "/auth/sso/verify")
    R ssoVerify(@RequestParam("Authorization") String Authorization);

}
