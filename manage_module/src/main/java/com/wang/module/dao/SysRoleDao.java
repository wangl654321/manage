package com.wang.module.dao;

import com.wang.module.entity.SysRole;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRoleDao {

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
    int saveEntity(SysRole record);

    /**
     * @方法说明：
     * @时间： 2017-11-09 15:13
     * @创建人：wangl
     */
    SysRole getEntity(Integer id);

    /**
     * @方法说明：
     * @时间： 2017-11-09 15:13
     * @创建人：wangl
     */
    int updateEntity(SysRole record);
}