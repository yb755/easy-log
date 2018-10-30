package com.vbgps.config;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class EasyLogNamespaceHandler extends NamespaceHandlerSupport {

	public void init() {
		registerBeanDefinitionParser("annotation-driven", new AnnotationDrivenBeanDefinitionParser());
	}

}
