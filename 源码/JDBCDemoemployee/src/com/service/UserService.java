package com.service;

import com.entity.User;

public interface UserService {
	User login(User user);
	int register(User user);
}
