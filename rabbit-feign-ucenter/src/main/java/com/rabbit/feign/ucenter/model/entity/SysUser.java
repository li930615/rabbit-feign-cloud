package com.rabbit.feign.ucenter.model.entity;

import java.io.Serializable;

/**
 * @ClassName SysUser
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/17 16:41
 **/
public class SysUser implements Serializable {

    private String id;
    private String loginName;
    private String name;
    private String no;
    private String officeId;
    private String officeName;

    public String getNo()
    {
        return this.no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLoginName() {
        return this.loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getOfficeId() {
        return this.officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    public String getOfficeName() {
        return this.officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
