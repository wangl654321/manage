package com.wang.module.entity;

/***
 *
 *
 * 描    述：用户角色表
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
public class SysUser {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 账号
     */
    private String usercode;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机
     */
    private String phone;

    /**
     * 盐
     */
    private String salt;

    /**
     * 账号是否锁定，1：锁定，0未锁定
     */
    private String locked;

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
     * 账号
     * @return usercode 账号
     */
    public String getUsercode() {
        return usercode;
    }

    /**
     * 账号
     * @param usercode 账号
     */
    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    /**
     * 姓名
     * @return name 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 姓名
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 密码
     * @return password 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 邮箱
     * @return email 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 手机
     * @return phone 手机
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机
     * @param phone 手机
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 盐
     * @return salt 盐
     */
    public String getSalt() {
        return salt;
    }

    /**
     * 盐
     * @param salt 盐
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    /**
     * 账号是否锁定，1：锁定，0未锁定
     * @return locked 账号是否锁定，1：锁定，0未锁定
     */
    public String getLocked() {
        return locked;
    }

    /**
     * 账号是否锁定，1：锁定，0未锁定
     * @param locked 账号是否锁定，1：锁定，0未锁定
     */
    public void setLocked(String locked) {
        this.locked = locked == null ? null : locked.trim();
    }
}