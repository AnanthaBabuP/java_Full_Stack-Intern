package com.aop.demo.WorkingWithAOP;

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
       ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
       Inmakes in = context.getBean(Inmakes.class);
       in.displayCourse("Java",12000);
//       in.displaySecurity();
       in.getAmount(65000);
    }
}
