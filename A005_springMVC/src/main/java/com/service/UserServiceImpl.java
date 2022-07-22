package com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.Userdao;
import com.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	Userdao userdao;
	
	@Override
	public void addOrUpdateUser(User user) {
		userdao.addOrUpdateUser(user);

	}

	@Override
	public ArrayList<User> getallUser() {
		
		return userdao.getallUser();
	}

	@Override
	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userdao.getUserById(id);
	}

	@Override
	public void deleteUser(int id) {
		userdao.deleteUser(id);

	}

}
