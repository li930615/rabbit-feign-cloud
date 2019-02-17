package com.rabbit.feign.auth.server.fallback;

import com.rabbit.feign.auth.model.R;
import com.rabbit.feign.auth.server.AuthServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @ClassName AuthServerImpl
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/17 16:34
 **/
@Service
public class AuthServerFallbackImpl implements AuthServer {

    private Logger logger = LoggerFactory.getLogger(getClass());



    @Override
    public R ssoVerify(String Authorization) {
        this.logger.error("调用{}异常{}", "verify", Authorization);
        return new R(new Exception());
    }
}
