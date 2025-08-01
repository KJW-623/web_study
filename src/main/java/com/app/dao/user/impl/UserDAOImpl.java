package com.app.dao.user.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.dao.user.UserDAO;
import com.app.dto.room.Room;
import com.app.dto.user.User;
import com.app.dto.user.UserSearchCondition;

@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<User> findUserList() {

		System.out.println("[DAO] 호출 findUserList");

		List<User> userList = sqlSessionTemplate.selectList("user_mapper.findUserList");

		return userList;

	}

	@Override
	public int saveUser(User user) {

		int result = sqlSessionTemplate.insert("user_mapper.saveUser", user);

		return result;
	}
	
	@Override
	public User findUserById(String id) {

		User user = sqlSessionTemplate.selectOne("user_mapper.findUserById", id);

		return user;
	}
	
	@Override
	public User checkUserLogin(User user) {

	    User loginUser = sqlSessionTemplate.selectOne("user_mapper.checkUserLogin", user);
	    if (loginUser != null) {
	        return loginUser;
	    } else {
	        return null;
	    }
	}

	@Override
	public int modifyUserPw(User user) {
		int result = sqlSessionTemplate.update("user_mapper.modifyUserPW", user);
		
		return result;
	}

	@Override
	public int modifyUser(User user) {
		int result = sqlSessionTemplate.update("user_mapper.modifyUser", user);
		return result;
	}

	@Override
	public List<User> findUserListBysearchCondition(UserSearchCondition userSearchCondition) {
		
		List<User> userList = sqlSessionTemplate.selectList("user_mapper.findUserListBysearchCondition", userSearchCondition);
		
		return userList;
	}

}
