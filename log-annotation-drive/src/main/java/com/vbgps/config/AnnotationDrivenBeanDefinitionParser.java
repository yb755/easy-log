package com.vbgps.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.parsing.BeanComponentDefinition;
import org.springframework.beans.factory.parsing.CompositeComponentDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

public class AnnotationDrivenBeanDefinitionParser implements BeanDefinitionParser {

	public BeanDefinition parse(Element element, ParserContext parserContext) {
		Object source = parserContext.extractSource(element);
		CompositeComponentDefinition compDefinition = new CompositeComponentDefinition(element.getTagName(), source);
		parserContext.pushContainingComponent(compDefinition);

		RootBeanDefinition loggerDef = new RootBeanDefinition(AnnotationServletServiceLoggerFactoryBean.class);

		String serviceLoggerId = element.getAttribute("id");
		if (StringUtils.hasText(serviceLoggerId)) {
			parserContext.getRegistry().registerBeanDefinition(serviceLoggerId, loggerDef);
		} else {
			serviceLoggerId = parserContext.getReaderContext().registerWithGeneratedName(loggerDef);
		}
		parserContext.registerComponent(new BeanComponentDefinition(loggerDef, serviceLoggerId));

		return null;
	}

}
