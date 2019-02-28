package com.rabbit.feign.ucenter.server.fallback;

import com.rabbit.feign.ucenter.model.entity.SysPermission;
import com.rabbit.feign.ucenter.server.SysPermissionServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName SysPermissionServerFallbackImpl
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/17 17:43
 **/
@Service
public class SysPermissionServerFallbackImpl implements SysPermissionServer {

    private Logger logger = LoggerFactory.getLogger(SysPermissionServerFallbackImpl.class);

    @Override
    public List<SysPermission> listByUserId(String userId) {
        this.logger.error("调用{}异常{}", "listByUserId", userId);
        return null;
    }

    @Override
    public List<SysPermission> listByAppCodeAndUserId(String appCode, String userId) {
        this.logger.error("调用{}异常{}", "listByAppCodeAndUserId");
        return null;
    }
}
