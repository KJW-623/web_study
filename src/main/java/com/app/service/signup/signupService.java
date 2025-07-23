package com.app.service.signup;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.dto.signup.Signup;

public interface signupService {

	List<Signup> findSignupList();

	int saveSignup(Signup signup);

}
