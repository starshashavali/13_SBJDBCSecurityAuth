package com.tcs.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {
	@GetMapping("/admin")
	public String getBankEmp() {
		return " Admin Has authority to see all bank emp sal";
	}
	@GetMapping("/user")
	public String getCustomer() {
		return " Customer cannot see Bank emp sals";
	}
	@GetMapping("/welcome")
	public String getWelcome() {
		return " Welcome To Hyd...!";
	}

}
