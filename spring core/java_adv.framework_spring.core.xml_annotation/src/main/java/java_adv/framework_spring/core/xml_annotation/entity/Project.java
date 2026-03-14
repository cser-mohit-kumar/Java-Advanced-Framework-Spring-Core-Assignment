package java_adv.framework_spring.core.xml_annotation.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Project {
	@Value("1")
	private Integer id;
	@Value("Bus Reservation System")
	private String name;
	@Value("Java AI Based project")
	private String description;
}
