package com.wang.web.controller;

import com.wang.module.entity.SysUser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
 * 创建时间：  2017/8/2319:54
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
@RequestMapping("/bootstrap")
public class ShopCard {
    private static final Logger logger = LogManager.getLogger();


    /**
     * @方法说明：用户信息跳转
     * @时间： 2017-04-14 11:40 AM
     * @创建人：wangl
     */
    @RequestMapping(value = "/shopCard")
    public String shopCard(SysUser sysUser, HttpServletRequest request, Model model) {

        return "bootstrap/invoice";
    }
}
