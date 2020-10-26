package com.aopdemo.springaopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAspect
{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	//What kind of method calls I would intercept
		//execution(* PACKAGE.*.*(..))
		//Weaving & Weaver
		@Before("execution(* com.aopdemo.springaopdemo.*.*(..))")/** This will access all package and it's 
		classes under com.aopdemo.springaopdemo.all package **/ 
		public void before(JoinPoint joinPoint){
			//Advice
			logger.info(" Check for user access ");
			logger.info(" Allowed execution for {}", joinPoint);
		}
		
//		@Before("execution(* com.aopdemo.springaopdemo.*.*(..))")
//		public void before(JoinPoint joinPoint){
//			//Advice
//			logger.info(" Check for user access ");
//			logger.info(" Allowed execution for {}", joinPoint);
//		}
		
}
