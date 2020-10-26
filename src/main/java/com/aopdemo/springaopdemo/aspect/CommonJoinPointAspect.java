package com.aopdemo.springaopdemo.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointAspect
{
	@Pointcut("execution(* com.aopdemo.springaopdemo.business.*.*(..))")
	public void businessLayerExecution() {}

}
