package com.service.impl;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
import com.entity.User;
import com.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao=new UserDaoImpl();
	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userDao.getUserByUserNamePass(user);
	}
	@Override
	public int register(User user) {
		// TODO Auto-generated method stub
		return userDao.save(user);
	}

}
