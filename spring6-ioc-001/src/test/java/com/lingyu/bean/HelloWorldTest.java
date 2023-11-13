package com.lingyu.bean;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldTest {
    private Logger logger = LoggerFactory.getLogger(HelloWorldTest.class);

    @Test  //方式一：根据id获取
    public void testHelloWorld(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld helloworld = (HelloWorld) ac.getBean("helloWorld");
        helloworld.sayHello();
    }

    @Test  //方式二：根据类型获取
    public void testHelloWorld1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld bean = ac.getBean(HelloWorld.class);
        bean.sayHello();
    }

    @Test //根据id和类型
    public void testHelloWorld2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorld bean = ac.getBean("helloWorld", HelloWorld.class);
        bean.sayHello();
    }


    @Test
    public void testDIBySet(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student studentOne = ac.getBean("studentOne", Student.class);
        System.out.println(studentOne);
    }


    @Test
    public void testDIByConstructor(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student studentOne = ac.getBean("studentTwo", Student.class);
        System.out.println(studentOne);
    }

    //为对象类型属性赋值
    //引用外部bean
    @Test
    public void testRef(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student studentFour = ac.getBean("studentFour", Student.class);
        System.out.println(studentFour);
    }

    //为对象类型属性赋值
    //引用内部bean
    @Test
    public void testRef1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student studentFour = ac.getBean("studentFour1", Student.class);
        System.out.println(studentFour);
    }

    //为对象类型属性赋值
    //级联属性赋值
    @Test
    public void testRef2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student studentFour = ac.getBean("studentFour2", Student.class);
        System.out.println(studentFour);
    }

    //为数组类型属性赋值
    @Test
    public void testArray(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student studentFive = ac.getBean("studentFive", Student.class);
        System.out.println(studentFive);
    }

    //为集合类型属性赋值
    @Test
    public void testListOrSet(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Clazz Clazz = ac.getBean("clazzTwo", Clazz.class);
        System.out.println(Clazz);
    }



}
