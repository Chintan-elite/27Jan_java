package com.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

@Transactional
@Repository
public class UserDaoImpl implements Userdao {

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void addOrUpdateUser(User user) {
		
		Session s = sessionFactory.getCurrentSession();
		s.saveOrUpdate(user);

	}

	@Override
	public ArrayList<User> getallUser() {
		
		Session s = sessionFactory.getCurrentSession();
		return (ArrayList<User>) s.createQuery("from User").list();
	}

	@Override
	public User getUserById(int id) {
		Session s = sessionFactory.getCurrentSession();
		return s.load(User.class, id);
	}

	@Override
	public void deleteUser(int id) {
		
		Session s = sessionFactory.getCurrentSession();
		User u =  s.load(User.class, id);
		s.delete(u);

	}

}
