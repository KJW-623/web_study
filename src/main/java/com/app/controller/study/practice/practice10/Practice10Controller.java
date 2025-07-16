package com.app.controller.study.practice.practice10;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Practice10Controller {

	@GetMapping("/practice10/A")
	public String A(Model model) {
		System.out.println("/practice10/A");

		model.addAttribute("FromA", "FromA");
		model.addAttribute("OriginalA", "OriginalA");
		
		return "practice/practice10/req";
	}

	@GetMapping("/practice10/B")
	public String B(Model model, HttpServletRequest request) {
		System.out.println("/practice10/B");

		HttpSession session = request.getSession();
		session.setAttribute("FromB", "FromB");
		model.addAttribute("OriginalB", "OriginalB");
		
		return "practice/practice10/req";
	}

}


//-------- 선생님 버전

//@Controller
//public class Practice10Controller {
//	
//	@GetMapping("/practice10/A")
//	public String a(Model model) {
//		
//		model.addAttribute("fromA", "fromA");
//		// ...
//		
//		return "practice/practice10/a";
//	}
//	
//	@GetMapping("/practice10/B")
//	public String b(HttpSession session) {
//	//public String b(HttpServletRequest request) {
//		//HttpSession session = request.getSession();
//		
//		// request / session 			/ application
//		
//		//request : 각 요청별 독립
//		//session : 브라우저(사용자) 별로 구분 사용
//		
//		session.setAttribute("fromBMsg", "fromB");
//		
//		
//		return "practice/practice10/b";
//	}
//}