package com.aop.demo.WorkingWithAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AthenticationAspect {
	
	@Pointcut("within(com.aop.demo.WorkingWithAOP.Inmakes)")
	public void authorizationPointCut() {
		System.out.println("Demo All Courses  =");
	}
	
	@Pointcut("within(com.aop.demo.WorkingWithAOP..*)")
	public void authenticationPointCut() {
		
	}
	
	@Before("authorizationPointCut() && authenticationPointCut()")
	public void authorization(JoinPoint js) {
		System.out.println("\n"+js.getSignature());
		
		System.out.println("Length Of Argumetnts : "+js.getArgs().length);
		System.out.println("Argument Values are:");
		if(js.getArgs().length != 0) {
			for(int i=0;i<js.getArgs().length;i++) {
				System.out.println(js.getArgs()[i]);
			}
		}
		
		System.out.println("Authenticaation Request");
	}
}
