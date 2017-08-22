package com.wang.web.test;
import com.wang.module.entity.User;
import com.wang.module.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class AppTest {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) throws SQLException {

        logger.info("启动开始--->{}");
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService bean = application.getBean(UserService.class);
        //User entity = bean.getEntity(2L);

        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setPassword(getRandomString((int) (Math.random() * 10) + 1));
            user.setName(getRandomString((int) (Math.random() * 10) + 1));
            user.setEmail(getRandomString((int) (Math.random() * 10) + 1)+"@qq.com");
            user.setPhone(tojson(i+1));

            bean.insert(user);
        }

        logger.info("运行结束--->{}",bean);
    }


    //获取指定位数的随机字符串(包含小写字母、大写字母、数字,0<length)
    public static String getRandomString(int length) {
        //随机字符串的随机字符库
        String KeyString = "abcdefghijklmnopqrstuvwxyz";
        StringBuffer sb = new StringBuffer();
        int len = KeyString.length();
        for (int i = 0; i < length; i++) {
            sb.append(KeyString.charAt((int) Math.round(Math.random() * (len - 1))));
        }
        return sb.toString();
    }

    public static String tojson(int num) {

        String json = "";
        for (int i = 0; i < num; i++) {
            //"\""+value+"\":\"" + value + "\",}";
            //随机字符串的随机字符库
            String KeyString = "abcdefghijklmnopqrstuvwxyz";
            StringBuffer sb = new StringBuffer();
            int len = KeyString.length();
            int mum  =  (int) (Math.random() * 10) + 1;

            for (int j = 0; j < mum; j++) {
                sb.append(KeyString.charAt((int) Math.round(Math.random() * (len - 1))));
            }

            json +=  "\""+sb.toString()+"\":\"" + sb.toString() + "\",";

        }

        json = json.substring(0, json.lastIndexOf(","));
        return "{"+json+"}";
    }
}
