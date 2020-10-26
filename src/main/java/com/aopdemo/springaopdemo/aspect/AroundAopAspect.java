package com.aopdemo.springaopdemo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAopAspect
{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
		@Around(value = "execution(* com.aopdemo.springaopdemo.business.*.*(..))")
		public void afterReturning(ProceedingJoinPoint joinPoint) throws Throwable{
			long startTime = System.currentTimeMillis();
			
			joinPoint.proceed();
			
			long timeTaken = System.currentTimeMillis() - startTime;
			
			logger.info("Time taken for {} is {} ", joinPoint, timeTaken);
		}
		
		
		
}
