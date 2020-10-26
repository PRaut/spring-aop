package com.aopdemo.springaopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect
{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// AfterReturning will get executed when only execution gets completed
		@AfterReturning(value = "execution(* com.aopdemo.springaopdemo.business.*.*(..))", returning = "result")
		public void afterReturning(JoinPoint joinPoint, Object result){
			//Advice
			logger.info("{} returned value {}", joinPoint, result);
		}
		
		@AfterThrowing(value = "execution(* com.aopdemo.springaopdemo.business.*.*(..))", throwing = "exception")
		public void afterReturning(JoinPoint joinPoint, Exception exception){
			//Advice
			logger.info("{} throwned {}", joinPoint, exception);
		}
		
		// @After can be used for @AfterReturning and @AfterThrowing 
		@After("execution(* com.aopdemo.springaopdemo.business.*.*(..))")
		public void after(JoinPoint joinPoint){
			//Advice
			logger.info("after execution of {}", joinPoint);
		}
		
}
