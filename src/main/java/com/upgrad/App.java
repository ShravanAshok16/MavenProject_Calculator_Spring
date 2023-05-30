package com.upgrad;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.upgrad");
        Calculator calculator = (Calculator) context.getBean("calculator");
        calculator.compute("mul",12,4);
    }
}
