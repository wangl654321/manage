package com.wang.module.dao;

import com.wang.module.entity.SysUserRole;
import org.springframework.stereotype.Repository;

@Repository
public interface SysUserRoleDao {


    /**
     * @方法说明：
     * @时间： 2017-11-09 15:13
     * @创建人：wangl
     */
    int delete(Long id);


    /**
     * @方法说明：
     * @时间： 2017-11-09 15:13
     * @创建人：wangl
     */
    int saveEntity(SysUserRole record);

    /**
     * @方法说明：
     * @时间： 2017-11-09 15:13
     * @创建人：wangl
     */
    SysUserRole getEntity(Integer id);

    /**
     * @方法说明：
     * @时间： 2017-11-09 15:13
     * @创建人：wangl
     */
    int updateEntity(SysUserRole record);

}