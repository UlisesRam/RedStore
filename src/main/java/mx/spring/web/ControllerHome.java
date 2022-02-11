package mx.spring.web;

import org.springframework.ui.Model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import mx.spring.domain.Coupon;
import mx.spring.domain.PromEve;
import mx.spring.service.ICouponService;
import mx.spring.service.IPromEveService;

@Controller
public class ControllerHome {
	
	@Autowired
	private ICouponService couponService; 
	@Autowired
	private IPromEveService promEveService; 
	
	
	//go to home page
	@GetMapping("/home")  
	public String home(Model model) {   
		List<PromEve> promEves = (List<PromEve>) promEveService.listPromEve();
		model.addAttribute("promEves", promEves);
		List<Coupon> coupons = (List<Coupon>) couponService.listCoupon();
		model.addAttribute("coupons", coupons);
		return "home";
	}	
}
