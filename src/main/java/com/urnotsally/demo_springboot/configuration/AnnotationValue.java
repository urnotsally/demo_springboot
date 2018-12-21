package com.urnotsally.demo_springboot.configuration;

import lombok.Data;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.Resource;


@Data
@Configuration
@PropertySource("classpath:application.yml")
public class AnnotationValue {
	/*注入其他bean的属性*/
	@Value("${demo.name}")
	private String demoName;
	/*注入普通字符串*/
	@Value("demoAuthor")
	private String demoAuthor;
	/*注入表达式运算结果*/
	@Value("#{ T(java.lang.Math).random()*100.0 }")
	private String randomNumber;
	/*注入其他bean的属性*/
	@Value("#{ demoBean.serviceMethod() }")
	private String serviceMethod;
	/*注入其他bean的方法*/
	@Value("#{ demoBean.serviceMethodParam('hello') }")
	private String serviceMethodParam;
	/*注入其他bean的Map属性*/
	@Value("#{ demoBean.map['MapA']}")
	private String mapValue;
	/*注入其他bean的List属性*/
	@Value("#{demoBean.list[0]}")
	private String listValue;
	@Value("classpath:demo.txt")
	private Resource testFile;

	public void outputResource() throws Exception {

		System.out.println(IOUtils.toString(testFile.getInputStream()));
	}

}
