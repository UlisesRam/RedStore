package mx.spring.service;

import java.util.*;
import mx.spring.dao.*;
import mx.spring.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Service	
public class CategoryServiceImpl implements ICategoryService{

	@Autowired
	private ICategoryDAO categoryDAO;
		
	@Override
	@Transactional(readOnly = true)
	public List<Category> listCategory() {
		return (List<Category>) categoryDAO.findAll();
	}

	
	@Override
	@Transactional(readOnly = true)
	public Category findCategory(Category category) {
		return categoryDAO.findById(category.getCATEGORY_ID()).orElse(null);
	}
	
}
