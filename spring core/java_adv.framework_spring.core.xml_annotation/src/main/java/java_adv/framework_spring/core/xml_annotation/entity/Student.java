package java_adv.framework_spring.core.xml_annotation.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Student {
	@Value("1")
	private Integer id;
	@Value("Raja")
	private String name;
	@Value("raja@gmail.com")
	private String mailId;
	@Value("9530068726")
	private Long contactNumber;
	@Autowired
	private Project project;
}
