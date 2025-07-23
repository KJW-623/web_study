package com.app.dao.user;

import java.util.List;
import com.app.dto.user.User;

public interface UserDAO {

	List<User> findUserList();

	int saveUser(User user);
	
	public User findUserById(String id);
}
