package java_adv.framework_spring.core.java_based.config.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java_adv.framework_spring.core.java_based.config.entity.Project;
import java_adv.framework_spring.core.java_based.config.entity.Student;

@Configuration
public class JavaConfigurationFile {
	
	@Bean
	public Project project() {
		return new Project(1, "Flight Reservation System" , "Java AI Based Web App");
	}
	@Bean
	public Student student() {
		Student student =new Student();
		student.setId(1);
		student.setName("Aarya");
		student.setMailId("Aarya@gmail.com");
		student.setContactNumber(9530068726L);
		student.setProject(project());
		return student;
	}
}
