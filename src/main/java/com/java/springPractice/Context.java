package com.java.springPractice;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Context
{
    static  ConfigurableApplicationContext context = new AnnotationConfigApplicationContext("com.java.springPractice");
}
