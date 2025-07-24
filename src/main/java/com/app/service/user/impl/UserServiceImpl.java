package com.app.service.user.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.common.CommonCode;
import com.app.dao.user.UserDAO;
import com.app.dto.room.Room;
import com.app.dto.user.User;
import com.app.dto.user.UserSearchCondition;
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
		// 관리자 계정 추가 할때 필요한 체크 로직....

		user.setUserType("ADM");
		int result = userDAO.saveUser(user);

		return result;
	}

	@Override
	public int saveCustomerUser(User user) {
		// 사용자 계정 추가 할때 필요한 체크 로직....

		// user.setUserType("CUS");
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
		//매개변수로 들어온 User 객체에 id, pw, userType 로그인을 처리할 수 있는 정상적인 값을 가지고 있는지 여부 체크
		//메소드 주요 로직 >> 로그인 처리 성공? 실패?
		
		//id pw 일치하는가?
		
		//케이스 1) DB에서 정보를 조회 한 후 >> Service Layer 상태에서 비교하는 로직을 수행
//		User loginUser = userDAO.findUserById(user.getId());
//
//		if(loginUser != null && loginUser.getPw().equals(user.getPw())
//				&& loginUser.getUserType().equals(user.getUserType())) {
//			return loginUser;
//		}
		//checkUserLogin 메소드 호출 >> return null? id, pw 틀렸다
		// return user 객체? >> 맞다! 
//		return null;
		
		
		// 케이스 2) DB에서 쿼리를 통해, 정상여부 체크 로직 수행
		User loginUser = userDAO.checkUserLogin(user);
		
		if (loginUser != null) {
	        return loginUser;
	    } else {
	        return null;
	    }
		
		
		
	}

	@Override
	public int modifyUserPw(User user) {
		int result = userDAO.modifyUserPw(user);
		
		return result;
	}

	@Override
	public int modifyUser(User user) {
		int result = userDAO.modifyUser(user);
		return result;
	}

	@Override
	public List<User> findUserListBysearchCondition(UserSearchCondition userSearchCondition) {
		List<User> userList = userDAO.findUserListBysearchCondition(userSearchCondition);
		
		return userList;
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
