package com.aopdemo.springaopdemo.data;

import org.springframework.stereotype.Repository;

import com.aopdemo.springaopdemo.aspect.TrackTime;

@Repository
public class Dao1
{
	@TrackTime
	public String retrieveSomething(){
		return "Dao1";
	}
}
