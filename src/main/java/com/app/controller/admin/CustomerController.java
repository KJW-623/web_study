package com.app.controller.admin;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.app.common.CommonCode;
import com.app.dto.user.User;
import com.app.service.user.UserService;

@Controller("adminCustomerController")
public class CustomerController {

	@Autowired
	UserService userService;

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

	@GetMapping("/customer/signin")
	public String signin() {
		return "customer/signin";
	}

	@PostMapping("/customer/signin")
	public String signinAction(User user, HttpSession session) {

		System.out.println("사용자가 입력한 아이디 비번");
		System.out.println(user); // id pw

		// 사용자가 입력한 id, pw 맞냐! DB에 존재하냐
		// 서비스에서 비교시, userType까지 비교

		user.setUserType(CommonCode.USER_USERTYPE_CUSTOMER);
		User loginUser = userService.checkUserLogin(user);
		
		if (loginUser == null) { // 로그인 실패

			return "customer/signin";
		} else { // 로그인 성공

			// 현재 로그인 성공한 사용자 아이디 >> session 영역에 저장
			session.setAttribute("loginUserId", loginUser.getId());

			return "redirect:/customer/mypage";
		}

	}

	@GetMapping("/customer/mypage")
	public String mypage(Model model, HttpSession session) {

		// 로그인을 했으면, 로그인 한 사용자의 정보를 보여주는 마이페이지
		if(session.getAttribute("loginUserId") != null) {//로그인이 된 상태
			
			String loginUserId = (String)session.getAttribute("loginUserId");
		
			//로그인 된 사용자 ID (세션에 저장되어있음)
			User user = userService.findUserById(null);
			
			//그 ID에 해당되는 사용자 정보 >> view 전달
//			model.addAttribute("user", user);
			return "customer/mypage";
		}

		return "redirect:/customer/signin";
	}
	
	@GetMapping("/customer/logout")
	public String logout(HttpSession session) {

		session.invalidate();
		
		return "redirect:/main";
	}

}
