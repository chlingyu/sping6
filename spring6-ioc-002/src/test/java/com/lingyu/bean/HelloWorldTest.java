package com.lingyu.bean;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    private Logger logger = LoggerFactory.getLogger(HelloWorldTest.class);



    //为数组类型属性赋值
    @Test
    public void testArray(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student student = ac.getBean("student1", Student.class);
        System.out.println(student);
    }

    //为List集合类型属性赋值
    @Test
    public void testListOrSet(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Clazz clazz = ac.getBean("clazz", Clazz.class);
        System.out.println(clazz);
    }

    //为Map集合类型属性赋值
    @Test
    public void testMap(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student student = ac.getBean("student3", Student.class);
        System.out.println(student);
    }


    //引用集合类型的bean  list
    @Test
    public void testlistByUtil(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-list-map.xml");
        Clazz clazz = ac.getBean("clazzTwo", Clazz.class);
        System.out.println(clazz);
    }

    //引用集合类型的bean
    @Test
    public void testMapByUtil(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans-list-map.xml");
        Student student = ac.getBean("students", Student.class);
        System.out.println(student);
    }



}
