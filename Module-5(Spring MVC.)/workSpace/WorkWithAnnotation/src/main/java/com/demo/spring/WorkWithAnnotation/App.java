package com.demo.spring.WorkWithAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext contex = new AnnotationConfigApplicationContext(Config.class);
       Inmakes in = contex.getBean(Inmakes.class);
       in.displayCourse();
    }
}
