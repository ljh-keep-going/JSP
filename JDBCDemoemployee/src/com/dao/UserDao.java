package com.dao;

import com.entity.User;

public interface UserDao {
	User getUserByUserNamePass(User user);
	int save(User user);
}
