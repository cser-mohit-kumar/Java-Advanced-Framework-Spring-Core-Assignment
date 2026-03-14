package java_adv.framework_spring.core.java_based.one_to_many.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java_adv.framework_spring.core.java_based.one_to_many.configuration.JavaConfigurationFile;
import java_adv.framework_spring.core.java_based.one_to_many.entity.Project;
import java_adv.framework_spring.core.java_based.one_to_many.entity.Student;

public class JavaApp {

	public static void execution() {

		ConfigurableApplicationContext configurableApplicationContext =
				new AnnotationConfigApplicationContext(JavaConfigurationFile.class);

		Student student = configurableApplicationContext.getBean("student", Student.class);

		System.out.println("Student Details");
		System.out.println("----------------------");
		System.out.println("ID : " + student.getId());
		System.out.println("Name : " + student.getName());
		System.out.println("Email : " + student.getMailId());
		System.out.println("Contact : " + student.getContactNumber());

		System.out.println("\nProjects Assigned:");

		Project[] projects = student.getProject();

		for (Project project : projects) {
			System.out.println("----------------------");
			System.out.println("Project ID : " + project.getId());
			System.out.println("Project Name : " + project.getName());
			System.out.println("Description : " + project.getDescription());
		}

		configurableApplicationContext.close();
	}
}