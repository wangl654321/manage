package com.wang.web.test;

import com.wang.module.entity.User;
import com.wang.module.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class TestBl {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws SQLException {

        logger.info("启动开始--->{}");
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService bean = application.getBean(UserService.class);

        List<User> list = bean.getList();
        for (int i = 0,length = list.size(); i < length; i++) {

            if(i !=length-1){
                String phone = list.get(i).getPhone();
                User user = list.get(i + 1);
                if(null != user){
                    if("".equals(phone) || phone == null){
                        user.setFlag("2");
                    }

                }
            }

        }

        System.out.println(list);
        logger.info("启动结束--->{}");
    }
}
