package mx.spring.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long USER_ID;
	
	@NotEmpty
	private String USER_NAME;
	private String USER_EMAIL;
	private String USER_PASSWORD;
	//private int USER_PHONE;
	//private String USER_TYPE;

}
