package com.gec.spring.demo;

import com.gec.spring.entity.Employee;
import com.gec.spring.entity.User;
import com.gec.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class springTest {

    @Test
    public void test(){
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        // 得到对象
        User user = (User) applicationContext.getBean("user");
        // 调用方法
        user.add();
        // 使用属性
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
    }

    @Test
    public void test2(){
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        UserService userService = (UserService) applicationContext.getBean("UserService");

        userService.add();
    }

    @Test
    public void test3(){
        // 加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");

        Employee employee = (Employee) applicationContext.getBean("emp");

        System.out.println(employee.toString());
    }

}
