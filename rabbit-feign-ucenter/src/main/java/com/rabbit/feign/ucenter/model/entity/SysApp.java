package com.rabbit.feign.ucenter.model.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.rabbit.feign.ucenter.model.enums.Status;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName SysApp
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/17 17:14
 **/
public class SysApp implements Serializable {

    private static final long serialVersionUID = -6836959430228135889L;
    private String id;
    private String name;
    private Status status;
    private String code;
    private String url;
    private String iconFile;
    private String secret;
    private int sort;
    private Date createTime;
    private Date updateTime;

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

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSort() {
        return this.sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIconFile() {
        return this.iconFile;
    }

    public void setIconFile(String iconFile) {
        this.iconFile = iconFile;
    }

    public String getSecret() {
        return this.secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }
}
