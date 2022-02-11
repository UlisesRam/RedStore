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
public class ControllerCoupon {

	
	@Autowired
	private ICouponService couponService; 
	@Autowired
	private IPromEveService promEveService; 
	
	//list
	@GetMapping("/coupon")
	public String coupon(Model model) {
		List<Coupon> coupons = (List<Coupon>) couponService.listCoupon();
		model.addAttribute("coupons", coupons);
		
		List<PromEve> promEves = (List<PromEve>) promEveService.listPromEve();
		model.addAttribute("promEves", promEves);

		return "coupon";
	}
	
	
	//add
	@GetMapping("/add_co")
	public String add_co(Coupon coupon) {
		return "coupon";
	}
	//edit	
	
	@GetMapping("edit_co/{COUPONS_ID}")
	public String edit_co(Coupon coupon, Model model) {
	coupon = couponService.findCoupon(coupon);
	model.addAttribute("coupon",coupon);
	return "edit_co";
	}
	//save
	@PostMapping("/save_co")
	public String save_co(Coupon coupon) {   
		couponService.save(coupon);
		return "redirect:/coupon"; 
	}
	//delete
	@GetMapping("/delete_co")
	public String delete_co(Coupon coupon) {
		couponService.delete(coupon);
		log.info("COPUPONS-> " + coupon);
		return "redirect:/coupon"; 
	}
	
	
	
}

	