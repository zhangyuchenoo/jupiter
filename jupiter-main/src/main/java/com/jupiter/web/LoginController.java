/**
 * 
 */
package com.jupiter.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.jupiter.BaseResult;
import com.jupiter.service.BizException;
import com.jupiter.service.UserService;
import com.jupiter.vo.JUserVO;

/**
 * @author zheng.zhang
 * 
 *         2017年4月19日
 */
public class LoginController {

	private static final Logger log = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	UserService userService;

	public BaseResult login(JUserVO userVO) {
		try {
			userService.login(userVO);
		} catch (BizException e) {
			log.error("用户名或密码错误");
		}

		return new BaseResult();
	}
}
