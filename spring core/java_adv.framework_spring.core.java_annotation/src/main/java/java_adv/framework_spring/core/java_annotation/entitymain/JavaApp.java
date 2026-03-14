package java_adv.framework_spring.core.java_annotation.entitymain;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java_adv.framework_spring.core.java_annotation.Configuration.JavaConfigurationfile;
import java_adv.framework_spring.core.java_annotation.entity.*;

public class JavaApp {
	public static void execution() {
		
		ConfigurableApplicationContext configurableApplicationContext;
		configurableApplicationContext = new AnnotationConfigApplicationContext(JavaConfigurationfile.class);
		Student student = configurableApplicationContext.getBean(Student.class);
		System.out.println(student);
		Project project =student.getProject();
		System.out.println(project);
		
		configurableApplicationContext.close();
	}
}