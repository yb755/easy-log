package com.vbgps.log.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vbgps.config.AnnotationServletServiceLogger;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-context.xml");
		context.start();
		AnnotationServletServiceLogger logger = (AnnotationServletServiceLogger)context.getBean("easylog");
		System.out.println(logger.getMsg());
		try {
			Thread.sleep(Long.MAX_VALUE);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
