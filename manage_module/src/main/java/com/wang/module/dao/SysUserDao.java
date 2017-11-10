package com.wang.module.dao;

import com.wang.module.entity.ActiveUser;
import com.wang.module.entity.SysUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserDao {


    /**
     * @方法说明：
     * @时间： 2017-11-09 15:13
     * @创建人：wangl
     */
    int delete(Integer id);



    /**
     * @方法说明：
     * @时间： 2017-11-09 15:13
     * @创建人：wangl
     */
    int saveEntity(SysUser record);



    /**
     * @方法说明：
     * @时间： 2017-11-09 15:13
     * @创建人：wangl
     */
    SysUser getEntity(Integer id);



    /**
     * @方法说明：
     * @时间： 2017-11-09 15:13
     * @创建人：wangl
     */
    int updateEntity(SysUser record);

    SysUser getEntityByLogin(SysUser sysUser);

    ActiveUser authenticat(SysUser sysUser);
}