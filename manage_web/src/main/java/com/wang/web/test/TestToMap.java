package com.wang.web.test;

import com.utils.JsonUtils;
import com.wang.module.entity.User;
import com.wang.module.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;
import java.util.*;

public class TestToMap {

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
                String phone1 = user.getPhone();
                if (!phone1.equals("") && phone1 != null){
                    TreeMap<String,String> treeMap = JsonUtils.toObject(phone, TreeMap.class);
                    TreeMap<String,String> treeMap1 = JsonUtils.toObject(phone1, TreeMap.class);
                    if(treeMap1.size() >= treeMap.size()){
                        /*Iterator<Map.Entry<String, String>> iterator = treeMap.entrySet().iterator();
                        while (iterator.hasNext()){
                            Map.Entry<String, String> entry = iterator.next();
                            System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
                        }*/

                        Iterator<Map.Entry<String, String>> iterator1 = treeMap1.entrySet().iterator();
                        while (iterator1.hasNext()){
                            Map.Entry<String, String> entry2 = iterator1.next();

                            System.out.println("key= " + entry2.getKey() + ",value= " + entry2.getValue());
                            boolean flag = treeMap.containsKey(entry2.getKey());

                            if(flag){
                                if(treeMap.get(entry2.getKey()).equals(treeMap1.get(entry2.getKey()))){
                                    System.out.println("key 和 value 相等");
                                }else {
                                    System.out.println("key相等, value 不相等");
                                }
                            }
                        }



                    }

                }
            }

        }

        //System.out.println(list);
        logger.info("启动结束--->{}");
    }
}
