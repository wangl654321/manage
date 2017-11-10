package com.wang.module.dao;

import com.wang.module.entity.SysRolePermission;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRolePermissionDao {


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
    int saveEntity(SysRolePermission record);



    /**
     * @方法说明：
     * @时间： 2017-11-09 15:13
     * @创建人：wangl
     */
    SysRolePermission getEntity(Integer id);



    /**
     * @方法说明：
     * @时间： 2017-11-09 15:13
     * @创建人：wangl
     */
    int updateEntity(SysRolePermission record);
}