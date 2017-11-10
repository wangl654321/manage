package com.wang.module.entity;

/***
 *
 *
 * 描    述：资源表
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
public class SysPermission {
    /**
     * 主键
     */
    private Long id;

    /**
     * 资源名称
     */
    private String name;

    /**
     * 资源类型：menu,button,
     */
    private String type;

    /**
     * 访问url地址
     */
    private String url;

    /**
     * 权限代码字符串
     */
    private String percode;

    /**
     * 父结点id
     */
    private Long parentid;

    /**
     * 父结点id列表串
     */
    private String parentids;

    /**
     * 排序号
     */
    private String sortstring;

    /**
     * 是否可用,1：可用，0不可用
     */
    private String available;

    /**
     * 主键
     * @return id 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 主键
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 资源名称
     * @return name 资源名称
     */
    public String getName() {
        return name;
    }

    /**
     * 资源名称
     * @param name 资源名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 资源类型：menu,button,
     * @return type 资源类型：menu,button,
     */
    public String getType() {
        return type;
    }

    /**
     * 资源类型：menu,button,
     * @param type 资源类型：menu,button,
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * 访问url地址
     * @return url 访问url地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 访问url地址
     * @param url 访问url地址
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    /**
     * 权限代码字符串
     * @return percode 权限代码字符串
     */
    public String getPercode() {
        return percode;
    }

    /**
     * 权限代码字符串
     * @param percode 权限代码字符串
     */
    public void setPercode(String percode) {
        this.percode = percode == null ? null : percode.trim();
    }

    /**
     * 父结点id
     * @return parentid 父结点id
     */
    public Long getParentid() {
        return parentid;
    }

    /**
     * 父结点id
     * @param parentid 父结点id
     */
    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    /**
     * 父结点id列表串
     * @return parentids 父结点id列表串
     */
    public String getParentids() {
        return parentids;
    }

    /**
     * 父结点id列表串
     * @param parentids 父结点id列表串
     */
    public void setParentids(String parentids) {
        this.parentids = parentids == null ? null : parentids.trim();
    }

    /**
     * 排序号
     * @return sortstring 排序号
     */
    public String getSortstring() {
        return sortstring;
    }

    /**
     * 排序号
     * @param sortstring 排序号
     */
    public void setSortstring(String sortstring) {
        this.sortstring = sortstring == null ? null : sortstring.trim();
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