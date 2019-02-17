package com.rabbit.feign.ucenter.server;

import com.rabbit.feign.ucenter.model.R;
import com.rabbit.feign.ucenter.server.fallback.SysUserServerFallbackImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/2/17 16:42
 **/
@FeignClient(name = "rabbit-ucenter-server",fallback = SysUserServerFallbackImpl.class)
public interface SysUserServer {

    @GetMapping(value = {"/ucenter/user/getSysUserVoByLogin"})
    R getSysUserVoByLogin(@RequestParam("loginName")String loginName,@RequestParam("password") String password);

}
