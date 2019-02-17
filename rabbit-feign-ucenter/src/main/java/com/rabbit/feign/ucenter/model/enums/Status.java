package com.rabbit.feign.ucenter.model.enums;

/**
 * 〈一句话功能简述〉
 *
 * @author 我的姓名
 * @date 2019/2/17 17:20
 **/
public enum Status implements BaseEntityEnum<Status> {

    ENABLE(0, "启用"), DISABLE(1, "禁用");

    private int code;
    private String description;

    private Status(int code, String description) { this.code = new Integer(code).intValue();
        this.description = description;
    }

    public int getCode()
    {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }

    public int getIntValue()
    {
        return this.code;
    }
}
