package com.rabbit.feign.ucenter;

/**
 * @ClassName FeignUcenterConst
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/18 21:13
 **/
public class FeignUcenterConst {

    public static final String APPLICATION = "${rabbit.feign.ucenter.application:rabbit-ucenter-server}";
    public static final String CONTEXTPATH = "${rabbit.feign.ucenter.contextPath:/ucenter}";
}
