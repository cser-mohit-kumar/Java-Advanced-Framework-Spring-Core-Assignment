package java_adv.framework_spring.core.java_based.many_to_one.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java_adv.framework_spring.core.java_based.many_to_one.configuration.JavaConfigurationFile;
import java_adv.framework_spring.core.java_based.many_to_one.entity.Student;

public class JavaApp {

    public static void execution() {

        ConfigurableApplicationContext context =
                new AnnotationConfigApplicationContext(JavaConfigurationFile.class);

        Student s1 = context.getBean("student1", Student.class);
        Student s2 = context.getBean("student2", Student.class);
        Student s3 = context.getBean("student3", Student.class);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        context.close();
    }
}