package com.jupiter.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jupiter.model.JUser;
import com.jupiter.repository.UserDao;
import com.jupiter.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userRepository;

	@Transactional
	public void save(JUser user) {
		userRepository.saveAndFlush(user);
	}
}
