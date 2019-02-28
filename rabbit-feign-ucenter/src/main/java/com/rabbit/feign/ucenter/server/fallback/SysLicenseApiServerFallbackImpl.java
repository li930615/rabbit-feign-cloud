package com.rabbit.feign.ucenter.server.fallback;

import com.rabbit.feign.ucenter.model.entity.SysApi;
import com.rabbit.feign.ucenter.model.entity.SysLicense;
import com.rabbit.feign.ucenter.server.SysLicenseApiServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName SysLicenseApiServerFallbackImpl
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/17 17:37
 **/
@Service
public class SysLicenseApiServerFallbackImpl  implements SysLicenseApiServer {

    private Logger logger = LoggerFactory.getLogger(SysLicenseApiServerFallbackImpl.class);


    @Override
    public SysLicense getLicenseByAppId(String appId) {
        this.logger.error("调用{}异常{}", "getLicenseByAppId", appId);
        return null;
    }

    @Override
    public List<SysApi> listApiByAppId(String appId) {
        this.logger.error("调用{}异常{}", "listApiByAppId", appId);
        return null;
    }
}
