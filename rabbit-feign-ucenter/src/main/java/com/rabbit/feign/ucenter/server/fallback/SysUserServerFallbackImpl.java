package com.rabbit.feign.ucenter.server.fallback;

import com.rabbit.feign.ucenter.model.R;
import com.rabbit.feign.ucenter.model.vo.SysUserVo;
import com.rabbit.feign.ucenter.server.SysUserServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @ClassName SysUserServerFallbackImpl
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/17 16:44
 **/
@Service
public class SysUserServerFallbackImpl implements SysUserServer {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public R<SysUserVo> getSysUserVoByLogin(String loginName, String password) {
        this.logger.error("调用{}异常{}", new Object[] { "getSysUserVoByLogin", loginName, password });
        return null;
    }
}
