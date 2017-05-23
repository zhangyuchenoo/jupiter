/**
 * 
 */
package com.jupiter.service.login.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.jupiter.model.JUser;
import com.jupiter.repository.UserDao;
import com.jupiter.service.BizException;
import com.jupiter.service.login.LoginService;
import com.jupiter.service.util.EncDecUtil;
import com.jupiter.vo.JUserVO;

/**
 * @author zheng.zhang
 * 
 *         2017年5月23日
 */
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserDao userDao;

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
