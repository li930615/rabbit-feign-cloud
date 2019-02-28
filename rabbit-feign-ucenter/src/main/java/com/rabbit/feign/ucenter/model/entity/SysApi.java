package com.rabbit.feign.ucenter.model.entity;

import java.io.Serializable;

/**
 * @ClassName SysApi
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/17 17:35
 **/
public class SysApi implements Serializable {

    private String id;
    private String name;
    private String uri;
    private String permission;
    private String state;
    private int seq;

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

    public String getUri() {
        return this.uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getPermission() {
        return this.permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
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
}
