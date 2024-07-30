package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //스프링 컨테이너는 new를 하지 않는다.
        //모든 객체는 프레임워크에서 관리한다. 
/*         Student student = new Student(); //
        System.out.println(student.getStudentId());
        System.out.println(student.getStudentName());
        student.setStudentId("1");
        student.setStudentName("Jeong");
   */
    // ApplicationContext context = 
    //     new ClassPathXmlApplicationContext("Beans.xml");
    // //ApplicationContext context = 
    // //    new ClassPathXmlApplicationContext("Beans.xml");

    // Student student = 
    //     context.getBean("student",Student.class);
    //     student.setStudentId("2");
    //     student.setStudentName("정영훈");
    //     System.out.println(student.getStudentName());

    // }
    // Address address = new Address();
    // address.setLocation("서울");
    // Employee employee = new Employee();
    // employee.setAddress(address);
    // employee.setName("정영훈");
    // employee.displayInfo();
    ApplicationContext context = 
         new ClassPathXmlApplicationContext("Beans.xml");

    Employee employee = 
        context.getBean("employee",Employee.class);
    Address address =
        context.getBean("address",Address.class);
        address.setLocation("서울");
        employee.setAddress(address);
        employee.setName("정영훈");
    employee.displayInfo();

    }
}