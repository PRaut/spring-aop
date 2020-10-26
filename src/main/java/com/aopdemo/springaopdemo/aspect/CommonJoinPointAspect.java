package com.aopdemo.springaopdemo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointAspect
{
	@Pointcut("execution(* com.aopdemo.springaopdemo.business.*.*(..))")
	public void businessLayerExecution() {}
	
	@Pointcut("execution(* com.aopdemo.springaopdemo.data.*.*(..))")
	public void dataLayerExecution() {}

	// Combining multiple Pointcuts
	@Pointcut("execution(* com.aopdemo.springaopdemo.business.*.*(..)) && execution(* com.aopdemo.springaopdemo.data.*.*(..))")
	public void allLayersExecution() {}
	
	//For bean name Pointcut - Matched Bean name contains Dao
	@Pointcut("bean(*Dao*)")
	public void beanContainingDao() {}
}
