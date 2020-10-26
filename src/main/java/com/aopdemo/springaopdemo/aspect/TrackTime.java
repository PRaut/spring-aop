package com.aopdemo.springaopdemo.aspect;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Making this Annotation only runs for Method now and available at Runtime 
@Retention(value=RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TrackTime
{

}
