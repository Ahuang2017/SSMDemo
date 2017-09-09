package org.lanqiao.test;

/**
 * Created by user on 2017/8/30.
 */

import org.lanqiao.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by user on 2017/8/30.
 */
public class springTest01 {
    public static void main(String[] args) {
        //1.读取Spring 的配置文件
        ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.获取bean
        User user=app.getBean("user",User.class);
        //3.输出user
        user.printHello();
    }
}
