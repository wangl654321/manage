package com.wang.web.test;

import com.utils.JsonUtils;
import com.wang.module.entity.User;
import com.wang.module.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class TestJson {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws SQLException {

        logger.info("启动开始--->{}");
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService bean = application.getBean(UserService.class);
        //User entity = bean.getEntity(2L);

        List<User> list = bean.getList();
/*
        list.forEach(user ->{
            String phone = user.getPhone();
        });*/

        //List<User> list1 = list.stream().sorted(Comparator.comparing(User::getPhone)).collect(Collectors.toList());

        /*Collections.sort(list,new Comparator<User>(){
            public int compare(User tr, User tr1) {
                if (tr.getPhone() .equals( tr1.getPhone())) {
                    return 1;
                }
                if (tr.getPhone() .equals( tr1.getPhone())) {
                    return -1;
                }
                return 0;
            }

            {"fmqf":"aaa","sbetpy":"sbetpy","eulbclrme":"eulbclrme"}
            {"fmqf":"fmqf","sbetpy":"sbetpy","eulbclrme":"eulbclrme"}

        });*/
        for (User user : list) {
            String phone = user.getPhone();
            if (phone.equals("") && phone != null){
                TreeMap object = JsonUtils.toObject(phone, TreeMap.class);
                String json = JsonUtils.toJson(object);
                System.out.println(json);
                user.setPhone(json);
            }
        }

        System.out.println(list);
        logger.info("启动结束--->{}");
    }
}
