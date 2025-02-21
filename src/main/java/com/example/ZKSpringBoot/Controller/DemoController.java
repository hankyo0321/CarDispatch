package com.example.ZKSpringBoot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	@GetMapping("/demo")
	public String demo() {
		return "views/carapplication";
//		return "views/demo";
	}
	
	@GetMapping("/carmanagement")
	public String chart() {
		return "views/carmanagement";
	}

}
