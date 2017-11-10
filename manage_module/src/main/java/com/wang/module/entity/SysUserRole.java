package com.wang.module.entity;

/***
 * 
* 
* 描    述：用户
*
* 创 建 者： wangl
* 创建时间： 2017-11-09 15:34
* 创建描述：
* 
* 修 改 者：  
* 修改时间： 
* 修改描述： 
* 
* 审 核 者：
* 审核时间：
* 审核描述：
*
 */
public class SysUserRole {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 用户id
     */
    private String sysUserId;

    /**
     * 角色id
     */
    private String sysRoleId;

    /**
     * 主键
     * @return id 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 用户id
     * @return sys_user_id 用户id
     */
    public String getSysUserId() {
        return sysUserId;
    }

    /**
     * 用户id
     * @param sysUserId 用户id
     */
    public void setSysUserId(String sysUserId) {
        this.sysUserId = sysUserId == null ? null : sysUserId.trim();
    }

    /**
     * 角色id
     * @return sys_role_id 角色id
     */
    public String getSysRoleId() {
        return sysRoleId;
    }

    /**
     * 角色id
     * @param sysRoleId 角色id
     */
    public void setSysRoleId(String sysRoleId) {
        this.sysRoleId = sysRoleId == null ? null : sysRoleId.trim();
    }
}