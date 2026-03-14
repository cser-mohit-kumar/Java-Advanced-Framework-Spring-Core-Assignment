package java_adv.framework_spring.core.java_based.one_to_many.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java_adv.framework_spring.core.java_based.one_to_many.entity.Project;
import java_adv.framework_spring.core.java_based.one_to_many.entity.Student;

@Configuration
public class JavaConfigurationFile {

    @Bean
    public Project project1() {
        return new Project(1, "Flight Reservation System", "Java AI Based Web App");
    }

    @Bean
    public Project project2() {
        return new Project(2, "Hospital Management System", "Spring Boot Application");
    }

    @Bean
    public Project project3() {
        return new Project(3, "Library Management System", "Java Desktop Application");
    }

    @Bean
    public Student student() {

        Student student = new Student();

        student.setId(1);
        student.setName("Aarya");
        student.setMailId("Aarya@gmail.com");
        student.setContactNumber(9530068726L);

        // One to Many → Array of Projects
        Project[] projects = { project1(), project2(), project3() };

        student.setProject(projects);

        return student;
    }
}