package com.vbgps.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AnnotationServletServiceLoggerFactoryBean implements FactoryBean<AnnotationServletServiceLogger>, ApplicationContextAware, InitializingBean, DisposableBean {

	private AnnotationServletServiceLogger logger;

	public void destroy() throws Exception {

	}

	public void afterPropertiesSet() throws Exception {
		logger = new AnnotationServletServiceLogger();
	}

	public void setApplicationContext(ApplicationContext arg0) throws BeansException {

	}

	public AnnotationServletServiceLogger getObject() throws Exception {
		return logger;
	}

	public Class<?> getObjectType() {
		return null;
	}

}
