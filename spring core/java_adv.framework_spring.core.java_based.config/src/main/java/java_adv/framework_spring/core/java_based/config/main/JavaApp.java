package java_adv.framework_spring.core.java_based.config.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java_adv.framework_spring.core.java_based.config.configuration.JavaConfigurationFile;
import java_adv.framework_spring.core.java_based.config.entity.Project;
import java_adv.framework_spring.core.java_based.config.entity.Student;


public class JavaApp {
	public static void execution() {
	ConfigurableApplicationContext configurableApplicationContext;
	configurableApplicationContext = new AnnotationConfigApplicationContext(JavaConfigurationFile.class);
	Student student = configurableApplicationContext.getBean("student",Student.class);
	System.out.println(student);
	Project project = configurableApplicationContext.getBean("project" , Project.class);
	System.out.println(project);
	configurableApplicationContext.close();
	}

}
