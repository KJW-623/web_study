package com.app.dao.signup.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.dao.signup.signupDAO;
import com.app.dto.signup.Signup;

@Repository 
public class signupDAOImpl implements signupDAO {
	
	@Autowired
	SqlSessionTemplate sqlSessionTemplate;

	@Override
	public List<Signup> findSignupList() {

		System.out.println("[DAO] 호출 findSignupList");

		List<Signup> signupList = sqlSessionTemplate.selectList("signup_mapper.findSignupList");

		return signupList;

	}

	@Override
	public int saveSignup(Signup signup) {

		int result = sqlSessionTemplate.insert("signup_mapper.saveSignup", signup);

		return result;
	}

//		@Override
//		public  Room findRoomByRoomId(int roomId) {
//			
//			Room room = sqlSessionTemplate.selectOne("room_mapper.findRoomByRoomId", roomId);
//			
//			return room;
//		}
//		
//		@Override
//		public int removeRoom(int roomId) {
//			
//			int result = sqlSessionTemplate.delete("room_mapper.removeRoom", roomId);
//			//delete 적용된 행의 수
//			
//			return result;
//		}

}
