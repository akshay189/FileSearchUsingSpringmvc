package com.java.springPractice;


import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.logging.Logger;


@Service
public class ServletDemo
{
    public void greet()
    {
        System.out.println("Welcome to spring");
    }

    public static void main(String[] args) {
        ServletDemo servletDemo = Context.context.getBean(ServletDemo.class);
        servletDemo.greet();
        Context.context.close();
    }
}
