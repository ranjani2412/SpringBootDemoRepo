package com.sample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/*
* SpringBoot auto-configures beans if dependencies are present in the classpath
* eg. if springmvc jar is present on the classpath, dispatcher servlet is autoconfigured.
* if hibernate.jar is present on the classpath, datasource is auto-configured
* Auto-configuration can be enabled by adding @SpringBootApplication/@EnableAutoConfiguration. It indicates that it is a SpringContext file
* WHAT IS A DISPATCHER SERVLET -> All request go to the DispatcherServlet which forwards the requests to other components of the application.
*
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		for ( String name : context.getBeanDefinitionNames()) {
			System.out.println("BEANS => " + name);
		}
	}

}
