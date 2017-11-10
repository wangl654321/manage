package com.wang.module.entity;

/***
 *
 *
 * 描    述：角色资源关联表
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
public class SysRolePermission {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 角色id
     */
    private String sysRoleId;

    /**
     * 权限id
     */
    private String sysPermissionId;

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

    /**
     * 权限id
     * @return sys_permission_id 权限id
     */
    public String getSysPermissionId() {
        return sysPermissionId;
    }

    /**
     * 权限id
     * @param sysPermissionId 权限id
     */
    public void setSysPermissionId(String sysPermissionId) {
        this.sysPermissionId = sysPermissionId == null ? null : sysPermissionId.trim();
    }
}