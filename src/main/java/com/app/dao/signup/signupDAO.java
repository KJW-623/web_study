package com.app.dao.signup;

import java.util.List;

import com.app.dto.signup.Signup;

public interface signupDAO {

	List <Signup> findSignupList();
	
	int saveSignup(Signup signup);
	
}
