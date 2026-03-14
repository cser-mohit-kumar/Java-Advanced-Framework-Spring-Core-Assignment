package java_adv.framework_spring.core.java_based.many_to_one.entity;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class Project implements Serializable {
	private Integer id;
	private String name;
	private String description;
	private Student[]  student;
	
}
