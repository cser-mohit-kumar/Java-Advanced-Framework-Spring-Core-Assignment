package java_adv.framework_spring.core.xml_annotation.main;



import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java_adv.framework_spring.core.xml_annotation.entity.*;

public class JavaApp {
	public static void execution() {
		String xmlConfigurationFile = "applicationContext.xml";
		ConfigurableApplicationContext configurableApplicationContext;
		configurableApplicationContext = new ClassPathXmlApplicationContext(xmlConfigurationFile);
		Student student = configurableApplicationContext.getBean(Student.class);
		System.out.println(student);
		Project project =student.getProject();
		System.out.println(project);
		
		configurableApplicationContext.close();
	}
}