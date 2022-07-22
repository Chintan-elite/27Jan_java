package com.dao;

import java.util.ArrayList;

import com.model.User;

public interface Userdao {
	
	public void addOrUpdateUser(User user);

	public ArrayList<User> getallUser();

	public User getUserById(int id);

	public void deleteUser(int id);
}
