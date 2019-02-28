package com.rabbit.feign.ucenter.model.entity;

import java.io.Serializable;

/**
 * @ClassName SysLicense
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/17 17:39
 **/
public class SysLicense implements Serializable {

    private static final long serialVersionUID = 735502960369271054L;
    private String id;
    private String appId;
    private String appSecret;
    private String appName;
    private String checkType;
    private String state;
    private int seq;
    private String description;

    public String getId()
    {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return this.appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getAppName() {
        return this.appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getCheckType() {
        return this.checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getSeq() {
        return this.seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
