package com.jupiter.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jupiter.model.JUser;
import com.jupiter.repository.UserDao;
import com.jupiter.service.BizException;
import com.jupiter.service.UserService;
import com.jupiter.service.util.EncDecUtil;
import com.jupiter.vo.JUserVO;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Transactional
	public void save(JUser user) {
		userDao.saveAndFlush(user);
	}

	@Override
	public void login(JUserVO userVO) throws BizException {
		JUser target = new JUser();
		BeanUtils.copyProperties(userVO, target);
		target.setPasswd(EncDecUtil.encPassword(target.getPasswd()));
		JUser user = userDao.findByNameNPass(target.getName(), target.getPasswd());
		if (user == null) {
			throw new BizException();
		}
	}
}
