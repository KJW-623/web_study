package com.app.service.user;

import java.util.List;

import com.app.dto.user.User;
import com.app.dto.user.UserSearchCondition;

public interface UserService {

	List<User> findUserList();

	int saveUser(User user);
	
	public int saveAdminUser(User user);
	public int saveCustomerUser(User user);
	
	public User findUserById(String id);
	
	public User checkUserLogin(User user);
	
	public int modifyUserPw(User user);
	
	public int modifyUser(User user);
	
	public List<User> findUserListBysearchCondition(UserSearchCondition userSearchCondition);
	
	public boolean isDuplicatedId(String id);
}
