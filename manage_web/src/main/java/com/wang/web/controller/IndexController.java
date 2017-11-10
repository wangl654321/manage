package com.wang.web.controller;

import com.wang.module.entity.SysUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/***
 *
 *
 * 描    述：主页拦截跳转
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
@RequestMapping("/")
public class IndexController {

    private static final Logger logger = LogManager.getLogger();

    /**
     * @方法说明：用户信息跳转
     * @时间： 2017-04-14 11:40 AM
     * @创建人：wangl
     */
    @RequestMapping
    public String bootstrap(HttpServletRequest request) {

        logger.info("主页拦截跳转--->{登录方法}");
        SysUser sysUser = (SysUser) request.getSession().getAttribute("loginUser");

        if (null != sysUser) {
            request.getSession().setAttribute("loginSysUser", sysUser);
            //登录成功
            return "bootstrap/index/index";
        }

        return "bootstrap/login/login";
    }

}
