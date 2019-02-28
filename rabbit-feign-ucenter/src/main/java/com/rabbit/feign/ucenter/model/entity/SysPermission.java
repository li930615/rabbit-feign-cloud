package com.rabbit.feign.ucenter.model.entity;

import com.rabbit.feign.ucenter.model.enums.Status;

import java.io.Serializable;

/**
 * @ClassName SysPermission
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/17 17:36
 **/
public class SysPermission implements Serializable {

    private static final long serialVersionUID = 5310880992340095131L;
    private String id;
    private String name;
    private String code;
    private String description;
    private String parentId;
    private Status status;
    private String appId;

    public String getId()
    {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }
}
