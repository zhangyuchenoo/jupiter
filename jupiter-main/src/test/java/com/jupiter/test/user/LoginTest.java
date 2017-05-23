/**
 * 
 */
package com.jupiter.test.user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jupiter.service.BizException;
import com.jupiter.service.user.UserService;
import com.jupiter.test.BaseTestCase;
import com.jupiter.vo.JUserVO;

/**
 * @author zheng.zhang
 * 
 *         2017年4月19日
 */
public class LoginTest extends BaseTestCase {

	@Autowired
	private UserService UserService;

	@Test
	public void testLogin() throws BizException {
		JUserVO userVO = new JUserVO();
		userVO.setName("user");
		userVO.setPasswd("passwd");
		UserService.login(userVO);
	}
}
