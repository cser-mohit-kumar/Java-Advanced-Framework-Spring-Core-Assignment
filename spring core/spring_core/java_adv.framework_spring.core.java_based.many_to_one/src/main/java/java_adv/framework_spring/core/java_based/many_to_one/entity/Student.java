
package java_adv.framework_spring.core.java_based.many_to_one.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
	private Integer id;
	private String name;
	private String mailId;
	private Long contactNumber;
	private Project project;
}
