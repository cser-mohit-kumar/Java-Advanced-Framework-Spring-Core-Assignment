package com.capgemini.software_devlopment_testing.java_adv.framework_spring.core.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.capgemini.software_devlopment_testing.java_adv.framework_spring.core.entity.Student;

public class JavaApp {
	public static void execution() {
		String xmlConfigurationfile = "applicationContext.xml";
		ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext(xmlConfigurationfile);
		Student student = configurableApplicationContext.getBean("student1", Student.class);
		System.out.println(student);
		configurableApplicationContext.close();
		
	}
}
