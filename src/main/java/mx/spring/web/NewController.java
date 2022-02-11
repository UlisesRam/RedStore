package mx.spring.web;

import mx.spring.domain.User;
import mx.spring.service.IUserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class NewController {
	
	@Autowired
	private IUserService userService;
/* USER */	
	@GetMapping("/")  
	public String account() {   
		return "account"; 
	}	
	@PostMapping("/login")  
	public String login() {   
		return "redirect:/home"; 
	}	
	@PostMapping("/save_user")
	public String save_user(User user) {   
		userService.save(user);
		return "account"; 
	}
	
/* ADMIN */	
	@GetMapping("/adminLogin")  
	public String account2() {   
		return "account2"; 
	}	
	@PostMapping("/login2")  
	public String login2() {   
		return "redirect:/admin"; 
	}	
	@PostMapping("/save_admin")
	public String save_admin(User user) {   
		userService.save(user);
		return "redirect:/admin"; 
	}
	
	
	
	
	
}
	
