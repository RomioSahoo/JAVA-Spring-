package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {

	@Before("execution(* com.aop.ProductServicesImpl.multiply(..))")
	public void LogBefore(JoinPoint jp)
	{
		System.out.println("Before calling the method");
	}
	@After("execution(* com.aop.ProductServicesImpl.multiply(..))")
	public void LogAfter(JoinPoint jp)
	{
		System.out.println("After method invocation");
	}
}
