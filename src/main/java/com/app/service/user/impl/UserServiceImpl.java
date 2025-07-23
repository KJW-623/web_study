package com.app.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.common.CommonCode;
import com.app.dao.user.UserDAO;
import com.app.dto.room.Room;
import com.app.dto.user.User;
import com.app.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;

	@Override
	public List<User> findUserList() {

		System.out.println("[Service] 호출 findRoomList");
		List<User> userList = userDAO.findUserList();

		return userList;
	}

	@Override
	public int saveUser(User user) {

		int result = userDAO.saveUser(user);

		return result;
	}
	
	@Override
	public int saveAdminUser(User user) {
		//관리자 계정 추가 할때 필요한 체크 로직....

		user.setUserType("ADM");
		int result = userDAO.saveUser(user);

		return result;
	}

	@Override
	public int saveCustomerUser(User user) {
		//사용자 계정 추가 할때 필요한 체크 로직....

		//user.setUserType("CUS");
		user.setUserType(CommonCode.USER_USERTYPE_CUSTOMER);
		int result = userDAO.saveUser(user);

		return result;
	}
	
	@Override
	public User findUserById(String id) {

		User user = userDAO.findUserById(id);

		return user;
	}
	
	@Override
	public User checkUserLogin(User user) {

		User loginUser = userDAO.findUserById(user.getId());

		if(loginUser != null && loginUser.getPw().equals(user.getPw())
				&& loginUser.getUserType().equals(user.getUserType())) {
			return loginUser;
		}
		//checkUserLogin 메소드 호출 >> return null? id, pw 틀렸다
		// return user 객체? >> 맞다! 
		return null;
	}
	

}

//----------
//	@Override
//	public int saveUser(User user) {
//
//		int result = userDAO.saveUser(user);
//
//		return result;
//	}
//
//	@Override
//	public int saveAdminUser(User user) {
//		// 관리자 계정 추가 할때 필요한 체크 로직....
//
//		user.setUserType("ADM");
//		int result = userDAO.saveUser(user);
//
//		return result;
//	}
//
//@Override
//public int saveCustomerUser(User user) {
//	//사용자 계정 추가 할때 필요한 체크 로직....
//
//	user.setUserType("CUS");
//	int result = userDAO.saveUser(user);
//
//	return result;
//}
