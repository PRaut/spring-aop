package com.aopdemo.springaopdemo.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aopdemo.springaopdemo.data.Dao2;

@Service
public class Business2
{
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Dao2 dao2;
	
	public String calculateSomething() {
		//Business Logic
				String value = dao2.retrieveSomething();
				logger.info("In Business - {}", value);
				return value;
	}
}
