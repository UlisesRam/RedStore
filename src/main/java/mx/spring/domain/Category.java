package mx.spring.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class Category implements Serializable {

	private static final long serialVersionUID = 1L;

	// chech database structure if some value have @OneToMany relation 

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long CATEGORY_ID;

	@NotEmpty
	private String CNAME;
	
	@NotEmpty
	private String CDESCRIPTION;

}
