package com.app.service.user;

import java.util.List;

import com.app.dto.user.User;

public interface UserService {

	List<User> findUserList();

	int saveUser(User user);
	
	public int saveAdminUser(User user);
	public int saveCustomerUser(User user);
	
	public User findUserById(String id);
	
	public User checkUserLogin(User user);
	
	public int modifyUserPw(User user);
	
	public int modifyUser(User user);
}
