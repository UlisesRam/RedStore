package mx.spring.dao;

import mx.spring.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryDAO extends JpaRepository<Category, Long>{

}
