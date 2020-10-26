package com.aopdemo.springaopdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.aopdemo.springaopdemo.business.Business1;
import com.aopdemo.springaopdemo.business.Business2;

@EnableAspectJAutoProxy(proxyTargetClass = true)
@SpringBootApplication
public class SpringAopdemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private Business1 business1;

	@Autowired
	private Business2 business2;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		logger.info(business1.calculateSomething());		
		logger.info(business2.calculateSomething());		
		
	}

}
