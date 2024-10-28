package com.aop.demo.WorkingWithAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {
	
//	// Before Advice
//	@Before("execution(public void displayCourse(..))")
//	public void BeforeLogger() {
//		System.out.println(" before Logger Working...");
//	}
//	
//	// After Advice (AnyReturnType PackageWithClass.method())
//	@After("execution(* *..*.*.displayCourse(..))")
//	public void AfterLogger() {
//		System.out.println("After With Path default Logger Working...");
//	}
//	
//	// After Advice (AnyReturnType PackageWithClass.method())
//	@After("execution(* com.aop.demo.WorkingWithAOP.Inmakes.displayCourse())")
//	public void AfterLogger2() {
//		System.out.println("After With fully Qualified  Path default Logger Working...");
//	}
	
	@Pointcut("execution(* com.aop.demo.WorkingWithAOP.Inmakes.getAmount(..))")
	public void afterReturningPointCut() {
		
	}
	
	@AfterReturning(pointcut = "afterReturningPointCut()", returning = "rtnVal")
	public void getValue(int rtnVal) {
		System.out.println("After Return Value is : "+rtnVal);
	}
}
