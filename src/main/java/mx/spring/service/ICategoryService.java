package mx.spring.service;

import java.util.List;
import mx.spring.domain.Category;

public interface ICategoryService {

	public List<Category> listCategory();
	
		
	public Category findCategory(Category category);
	
}

