package com.app.service.signup.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.signup.signupDAO;
import com.app.dto.signup.Signup;
import com.app.service.signup.signupService;

@Service
public class signupServiceImpl implements signupService {

	@Autowired
	signupDAO signupDAO;

	@Override
	public List<Signup> findSignupList() {

		System.out.println("[Service] 호출 findRoomList");

		List<Signup> signupList = signupDAO.findSignupList();

		return signupList;
	}

	@Override
	public int saveSignup(Signup signup) {

		int result = signupDAO.saveSignup(signup);

		return result;
	}

}
