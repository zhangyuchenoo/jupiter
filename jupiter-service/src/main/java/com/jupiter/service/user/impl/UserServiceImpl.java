package com.jupiter.service.user.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jupiter.model.JUser;
import com.jupiter.repository.UserDao;
import com.jupiter.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Transactional
	public void save(JUser user) {
		userDao.saveAndFlush(user);
	}

	

	@Override
	public void delete(JUser user) {

	}

	@Override
	public void update(JUser user) {

	}

	@Override
	public void list(JUser user) {

	}
}
