package com.wang.module.dao;

import com.wang.module.entity.SysPermission;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysPermissionDao {

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
    int saveEntity(SysPermission record);

    /**
     * @方法说明：
     * @时间： 2017-11-09 15:13
     * @创建人：wangl
     */
    SysPermission getEntity(Long id);

    /**
     * @方法说明：
     * @时间： 2017-11-09 15:13
     * @创建人：wangl
     */
    int updateEntity(SysPermission record);

    List<SysPermission> findSysPermissionList(String userid);
}