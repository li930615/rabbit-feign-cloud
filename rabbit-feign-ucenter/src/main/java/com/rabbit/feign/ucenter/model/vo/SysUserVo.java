package com.rabbit.feign.ucenter.model.vo;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName SysUserVo
 * @Description TODO
 * @Author LZQ
 * @Date 2019/2/17 16:49
 **/
public class SysUserVo implements Serializable {

    private String id;
    private String loginName;
    private String name;
    private String no;
    private String officeId;
    private String officeName;
    private List<Role> roleList;
    private List<App> appList;
    private DataScopes dataScopes;

    public String getNo()
    {
        return this.no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public DataScopes getDataScopes() {
        return this.dataScopes;
    }

    public void setDataScopes(DataScopes dataScopes) {
        this.dataScopes = dataScopes;
    }

    public List<App> getAppList() {
        return this.appList;
    }

    public void setAppList(List<App> appList) {
        this.appList = appList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Role> getRoleList() {
        return this.roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public String getOfficeName() {
        return this.officeName;
    }

    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    public static enum DataScopes
            implements Serializable
    {
        ALL(1, "所有数据"), DEPANDALL(4, "所在部门及以下数据"), DEP(5, "所在部门数据"), SELF(8, "仅本人数据");

        private int code;
        private String description;

        private DataScopes(int code, String description) { this.code = new Integer(code).intValue();
            this.description = description;
        }

        public int getCode()
        {
            return this.code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getDescription() {
            return this.description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    public static class App
            implements Serializable
    {
        private String id;
        private String appName;
        private String code;
        private String url;
        private int sort;

        public String getCode()
        {
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

        public String getId() {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAppName() {
            return this.appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

        public String getUrl() {
            return this.url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class Role
            implements Serializable
    {
        private String id;
        private String roleName;

        public String getId()
        {
            return this.id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getRoleName() {
            return this.roleName;
        }

        public void setRoleName(String roleName) {
            this.roleName = roleName;
        }
    }
}
