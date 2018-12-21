package com.urnotsally.demo_springboot;


import com.urnotsally.demo_springboot.configuration.AnnotationValue;
import com.urnotsally.demo_springboot.service.DemoBean;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import sun.nio.ch.IOUtil;

@Component
@Order(10)
@Slf4j
public class ApplicationStartup implements CommandLineRunner {
	@Autowired
	private AnnotationValue annotationValue;
	@Autowired
	private DemoBean demoBean;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(annotationValue.getDemoName());
		System.out.println(annotationValue.getDemoAuthor());
		System.out.println(IOUtils.toString(annotationValue.getTestFile().getInputStream()));
		return;
	}
}