package com.wang.web.controller;

import com.heepay.codec.Md5;
import com.wang.module.entity.SysUser;
import com.wang.module.service.SysUserService;
import com.wang.web.utils.MD5;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
@RequestMapping("/login/user")
public class LoginController {

    private static final Logger logger = LogManager.getLogger();

    @Autowired
    private SysUserService sysUserService;


    /**
     * @方法说明：用户登录
     * @时间： 2017-04-14 11:40 AM
     * @创建人：wangl
     */
    @RequestMapping(value = "/login")
    public String login(SysUser sysUser, Model model,
                        HttpServletRequest request) {

        if(null == sysUser.getPassword()){
            return "bootstrap/login/login";
        }
        logger.info("用户登录--->{首页}");
        HttpSession session = request.getSession();
        //查询数据库
        sysUser.setPassword(MD5.getMd5Str(sysUser.getPassword()));
        SysUser entity = sysUserService.getEntityByLogin(sysUser);
        if(null != entity) {
            session.setAttribute("loginSysUser", entity);
            //登录成功
            return "bootstrap/index/index";
        }

        //没有用户重新登陆
        model.addAttribute("loginMessage", "用户名密码错误");
        return "bootstrap/login/login";
    }
    /**
     * @方法说明：用户退出
     * @时间： 2017-04-14 11:40 AM
     * @创建人：wangl
     */
    @RequestMapping(value = "/loginOut")
    public String loginOut(HttpServletRequest request) {

        logger.info("用户用户退出");
        HttpSession session = request.getSession();
        session.removeAttribute("loginSysUser");
        return "bootstrap/login/login";
    }

    /**
     * @方法说明：用户找回密码
     * @时间： 2017-04-14 11:40 AM
     * @创建人：wangl
     */
    @RequestMapping(value = "/forgot")
    public String forgot(SysUser user, Model model) {
        logger.info("用户找回密码跳转--->{}");
        model.addAttribute("user", user);
        return "bootstrap/login/forgot";
    }

    /**
     * @方法说明：用户注册跳转
     * @时间： 2017-04-14 11:40 AM
     * @创建人：wangl
     */
    @RequestMapping(value = "/register")
    public String register(SysUser user, Model model) {
        logger.info("用户注册跳转--->{}");

        model.addAttribute("user", user);
        return "bootstrap/login/register";
    }

    /**
     * @方法说明：用户注册
     * @时间： 2017-04-14 11:40 AM
     * @创建人：wangl
     */
    @RequestMapping(value = "/save")
    public String save(SysUser user, Model model) {
        try {
            logger.info("用户注册--->{开始}");
            user.setPassword(Md5.encode(user.getPassword()));
            user.setName(user.getUsercode());//设置名称
            sysUserService.saveEntity(user);
        } catch (Exception e) {
            logger.error("用户注册--->{异常}" + e);
        }
        return "redirect:/";
    }


    /**
     * @方法说明：验证邮箱或者手机号是否存在验证
     * @时间： 2017-04-14 11:40 AM
     * @创建人：wangl
     */
    @ResponseBody
    @RequestMapping(value = "/validation")
    public int validation(@RequestParam(value = "value") String value, SysUser user) {

        logger.info("邮箱或者手机号是否存在验证--->{}", value);
        try {
            Double.parseDouble(value);
            logger.info("手机号是否存在验证--->{}", value);
            user.setPhone(value);
        } catch (NumberFormatException e) {
            logger.info("邮箱是否存在验证--->{}", value);
            user.setEmail(value);
        }

        int num = sysUserService.countNum(user);
        return num;
    }

}
