package com.app.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.dto.signup.Signup;
import com.app.dto.user.User;
import com.app.service.signup.signupService;
import com.app.service.user.UserService;

@Controller("adminCustomerController")
public class CustomerController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	signupService signupService;

	@GetMapping("/customer/signup")
	public String signup() {
		return "customer/signup";
	}

	@PostMapping("/customer/signup")
	public String signupAction(User user) {

		int result = userService.saveCustomerUser(user);
		System.out.println(result);

		if (result > 0) {
			return "redirect:/main";
		} else {
			return "customer/signup";
		}
	}

}
