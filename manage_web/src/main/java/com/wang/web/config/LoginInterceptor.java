package com.wang.web.config;

import com.wang.module.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/***
 *
 *
 * 描    述：登录拦截器
 *
 * 创 建 者： wangl
 * 创建时间：  2017-11-0315:14
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
@Component
public class LoginInterceptor implements HandlerInterceptor {

    private static final Logger logger = LogManager.getLogger();

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        boolean flag = true;
        User user=(User)request.getSession().getAttribute("loginUser");
        logger.info("登录拦截器--->{拦截的地址}" + request.getRequestURL());

        if(null == user){
            logger.info("登录拦截器--->{无法获取到当前登录人请登录后操作!}");
            response.sendRedirect("/");
            flag = false;
        }else{
            logger.info("登录拦截器--->{当前操作人:}" + user.getName());
            flag = true;
        }
        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response,
                           Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response,
                                Object handler, Exception ex) throws Exception {
    }
}
