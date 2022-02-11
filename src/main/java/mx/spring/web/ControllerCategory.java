package mx.spring.web;

import java.util.*;
import mx.spring.domain.*;
import mx.spring.service.*;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@Controller
public class ControllerCategory {

	@Autowired
	private ICategoryService categoryService; 
	
	//list
	@GetMapping("/category")
	public String category(Model model) {
		List<Category> category = (List<Category>) categoryService.listCategory();
		model.addAttribute("category", category);
		
		return "category";
	}
	
	
	
	
}

	