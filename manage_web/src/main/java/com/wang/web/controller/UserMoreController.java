package com.wang.web.controller;

import com.wang.module.entity.SysUser;
import com.wang.module.service.SysUserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/***
 *
 *
 * 描    述：
 *
 * 创 建 者： wangl
 * 创建时间：  2017-06-2202:01 PM
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
@Controller
@RequestMapping("/login")
public class UserMoreController {

    private static final Logger logger = LogManager.getLogger();

    @Autowired
    private SysUserService sysUserService;

    /**
     * @方法说明：登录跳转
     * @时间： 2017-04-14 11:40 AM
     * @创建人：wangl
     */
    @RequestMapping(value = "/user")
    public String login(SysUser sysUser, HttpServletRequest request, Model model) {

        logger.info("方法调用成功--->{}");
        sysUser = sysUserService.getEntity(2);
        logger.info("方法调用成功--->{}",sysUser.getName());

        model.addAttribute("user",sysUser);

        return "welcome";
    }


    /**
     * @方法说明：登录跳转
     * @时间： 2017-04-14 11:40 AM
     * @创建人：wangl
     */
    @RequestMapping(value = "/bootstrap")
    public String bootstrap(SysUser user, HttpServletRequest request, Model model) {


        return "bootstrap/museum";
    }

}
