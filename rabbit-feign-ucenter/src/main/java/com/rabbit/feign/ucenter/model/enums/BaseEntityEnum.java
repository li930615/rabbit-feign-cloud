package com.rabbit.feign.ucenter.model.enums;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/2/17 17:18
 **/
public interface BaseEntityEnum<E extends Enum<E>> {

    int getIntValue();
}
