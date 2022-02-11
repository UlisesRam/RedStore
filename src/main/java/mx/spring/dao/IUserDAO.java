package mx.spring.dao;

import mx.spring.domain.*;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserDAO extends JpaRepository<User, Long> {
		
}
