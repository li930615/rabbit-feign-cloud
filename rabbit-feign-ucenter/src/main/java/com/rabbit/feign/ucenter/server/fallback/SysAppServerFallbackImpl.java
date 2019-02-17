package com.rabbit.feign.ucenter.server.fallback;

import com.rabbit.feign.ucenter.model.entity.SysApp;
import com.rabbit.feign.ucenter.server.SysAppServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @ClassName SysAppServerFallbackImpl
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/17 17:11
 **/
@Service
public class SysAppServerFallbackImpl implements SysAppServer {

    private Logger logger = LoggerFactory.getLogger(SysAppServerFallbackImpl.class);


    @Override
    public SysApp getByCode(String code) {
        this.logger.error("调用{}异常{}", "getAppByCode", code);
        return null;
    }
}
