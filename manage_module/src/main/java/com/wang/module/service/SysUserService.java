package com.wang.module.service;

import com.wang.module.dao.SysPermissionDao;
import com.wang.module.dao.SysUserDao;
import com.wang.module.entity.ActiveUser;
import com.wang.module.entity.SysPermission;
import com.wang.module.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-06-2203:59 PM
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
@Service
@Transactional
public class SysUserService{

    @Autowired
    private SysUserDao sysUserDao;

    @Autowired
    private SysPermissionDao sysPermissionDao;

    public SysUser getEntity(Integer id) {
        return sysUserDao.getEntity(id);
    }


    public int saveEntity(SysUser user) {
        return sysUserDao.saveEntity(user);
    }


    public SysUser getEntityByLogin(SysUser sysUser) {
        return sysUserDao.getEntityByLogin(sysUser);
    }

    /**
     * @方法说明：查询是否存在
     * @时间： 2017-11-09 16:14
     * @创建人：wangl
     */
    public int countNum(SysUser sysUser) {
        SysUser user = sysUserDao.getEntityByLogin(sysUser);
        if(null != user){
            return 1;
        }else {
            return 0;
        }
    }

    //根据用户id获取权限
    public List<SysPermission> findSysPermissionList(String userid){
        return sysPermissionDao.findSysPermissionList(userid);
    }

    /**
     *
     * <p>Title: authenticat</p>
     * <p>Description:用户认证 </p>
     * @param usercode 用户账号
     * @param password 用户密码
     * @return ActiveUser 用户身份信息
     * @throws Exception
     */
    public ActiveUser authenticat(String usercode, String password){
        SysUser sysUser =  new SysUser();
        sysUser.setUsercode(usercode);
        sysUser.setPassword(password);
        return sysUserDao.authenticat(sysUser);
    }
}
