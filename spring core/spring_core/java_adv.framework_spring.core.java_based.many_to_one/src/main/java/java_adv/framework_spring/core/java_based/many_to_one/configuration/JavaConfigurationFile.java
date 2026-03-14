package java_adv.framework_spring.core.java_based.many_to_one.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java_adv.framework_spring.core.java_based.many_to_one.entity.Project;
import java_adv.framework_spring.core.java_based.many_to_one.entity.Student;

@Configuration
public class JavaConfigurationFile {

    @Bean
    public Project project() {
        Project project = new Project();
        project.setId(101);
        project.setName("Flight Reservation System");
        project.setDescription("Java AI Based Web Application");
        return project;
    }

    @Bean
    public Student student1() {
        Student student = new Student();
        student.setId(1);
        student.setName("Aarya");
        student.setMailId("aarya@gmail.com");
        student.setContactNumber(9530068726L);
        student.setProject(project());
        return student;
    }

    @Bean
    public Student student2() {
        Student student = new Student();
        student.setId(2);
        student.setName("Rohan");
        student.setMailId("rohan@gmail.com");
        student.setContactNumber(9876543210L);
        student.setProject(project());
        return student;
    }

    @Bean
    public Student student3() {
        Student student = new Student();
        student.setId(3);
        student.setName("Neha");
        student.setMailId("neha@gmail.com");
        student.setContactNumber(9123456780L);
        student.setProject(project());
        return student;
    }
}