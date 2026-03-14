package java_adv.framework_spring.core.xml_annotation.entity;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Component
public class Product implements Serializable{
	
		@Value("1")
		private Integer id;
		@Value("Apsara")
		private String brand;
		@Value("Pen")
		private String name;
		@Value("29.99")
		private Double price;
}
