package mx.spring.service;

import java.util.List;
//import java.util.Optional;
import mx.spring.domain.*;

public interface IUserService {

	public List<User> listUser();
	public void save(User User);
	public void delete(User User);
	public User findUser(User User);


	}
	







