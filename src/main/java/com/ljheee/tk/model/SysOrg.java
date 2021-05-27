package com.ljheee.tk.model;

import javax.persistence.*;

@Table(name = "sys_org")
public class SysOrg {
    /**
     * ID
     */
    @Column(name = "ORG_ID")
    private String orgId;

    /**
     * 父级id
     */
    @Column(name = "ORG_PARENT_ID")
    private String orgParentId;

    /**
     * 父级名字：冗余字段
     */
    @Column(name = "ORG_PARENT_NAME")
    private String orgParentName;

    /**
     * 组织名字
     */
    @Column(name = "ORG_NAME")
    private String orgName;

    /**
     * 组织描述
     */
    @Column(name = "ORG_DESC")
    private String orgDesc;

    /**
     * 是否有效:1有效，0无效
     */
    @Column(name = "FLAG")
    private String flag;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private String createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private String updateTime;

    /**
     * 获取ID
     *
     * @return ORG_ID - ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置ID
     *
     * @param orgId ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取父级id
     *
     * @return ORG_PARENT_ID - 父级id
     */
    public String getOrgParentId() {
        return orgParentId;
    }

    /**
     * 设置父级id
     *
     * @param orgParentId 父级id
     */
    public void setOrgParentId(String orgParentId) {
        this.orgParentId = orgParentId;
    }

    /**
     * 获取父级名字：冗余字段
     *
     * @return ORG_PARENT_NAME - 父级名字：冗余字段
     */
    public String getOrgParentName() {
        return orgParentName;
    }

    /**
     * 设置父级名字：冗余字段
     *
     * @param orgParentName 父级名字：冗余字段
     */
    public void setOrgParentName(String orgParentName) {
        this.orgParentName = orgParentName;
    }

    /**
     * 获取组织名字
     *
     * @return ORG_NAME - 组织名字
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置组织名字
     *
     * @param orgName 组织名字
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取组织描述
     *
     * @return ORG_DESC - 组织描述
     */
    public String getOrgDesc() {
        return orgDesc;
    }

    /**
     * 设置组织描述
     *
     * @param orgDesc 组织描述
     */
    public void setOrgDesc(String orgDesc) {
        this.orgDesc = orgDesc;
    }

    /**
     * 获取是否有效:1有效，0无效
     *
     * @return FLAG - 是否有效:1有效，0无效
     */
    public String getFlag() {
        return flag;
    }

    /**
     * 设置是否有效:1有效，0无效
     *
     * @param flag 是否有效:1有效，0无效
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}