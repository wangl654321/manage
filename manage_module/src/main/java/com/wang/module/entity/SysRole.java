package com.wang.module.entity;

/***
 *
 *
 * 描    述：角色
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
public class SysRole {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 名称
     */
    private String name;

    /**
     * 是否可用,1：可用，0不可用
     */
    private String available;

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
     * 名称
     * @return name 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 是否可用,1：可用，0不可用
     * @return available 是否可用,1：可用，0不可用
     */
    public String getAvailable() {
        return available;
    }

    /**
     * 是否可用,1：可用，0不可用
     * @param available 是否可用,1：可用，0不可用
     */
    public void setAvailable(String available) {
        this.available = available == null ? null : available.trim();
    }
}