package com.app.controller.study.react_spring_api;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.study.DrinkItem;

import oracle.jdbc.proxy.annotation.Post;



@RestController
public class ReactSpringAPIController {

	// API 통신용 컨트롤러

	@GetMapping("/api/getMsg")
	public String getMsg() {
		System.out.println("/api/getMsg");

		return "spring rest api msg";
	}

	@GetMapping("/api/getDrinks")
	public List<DrinkItem> getDrinks() {
		System.out.println("/api/getDrinks");
		
			List<DrinkItem> drinkList = new ArrayList<DrinkItem>();
			drinkList.add(new DrinkItem("아메리카노", "커피"));
			drinkList.add(new DrinkItem("카페라떼", "커피"));
			drinkList.add(new DrinkItem("레몬차", "차"));
			
			return drinkList;
	}
	
	@GetMapping("/api/getDrinksDiv")
	public List<DrinkItem> getDrinksDiv(HttpServletRequest reqest) {
		
		String type = reqest.getParameter("type");
		
		List<DrinkItem> drinkList = new ArrayList<DrinkItem>();
		//요청 type에 따라서 각각 다른 데이터 조회
		//where type='커피'	where type='차'
		
		if(type.equals("커피")) {
			drinkList.add(new DrinkItem("카페모카", "커피"));
			drinkList.add(new DrinkItem("에스프레소", "커피"));
			drinkList.add(new DrinkItem("아메리카노", "커피"));
		}
		if(type.equals("차")) {
			drinkList.add(new DrinkItem("얼그레이티", "차"));
			drinkList.add(new DrinkItem("페퍼민트티", "차"));
			drinkList.add(new DrinkItem("허브티", "차"));
		}
		
		return drinkList;
		
	}
	
	@PostMapping("/api/getDrinksNum")
	public List<DrinkItem> getDrinkItems(@RequestBody String num) {
		System.out.println(num);
		
		List<DrinkItem> drinkList = new ArrayList<DrinkItem>();
		drinkList.add(new DrinkItem("name"+num, "type"+num));
		
		
		return drinkList;
	}

}
