/**
 * 
 */
package com.jupiter.test.user;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jupiter.model.JUser;
import com.jupiter.service.user.UserService;
import com.jupiter.test.BaseTestCase;

/**
 * @author zheng.zhang
 * 
 *         2017年4月12日
 */
public class UserTest extends BaseTestCase {

	// @Autowired
	// private Configure configure;
	@Autowired
	private UserService userService;

	private Random random = new Random();

	@Before
	public void init() {
		random = new Random();
	}

	@Test
	public void testConfigure() {
		/*
		 * configure.getfooNames().forEach(word -> { System.err.println(word);
		 * });
		 */
	}

	@Test
	public void testSave() {
		JUser user = new JUser();
		user.setName("user");
		user.setPasswd("passwd");
		user.setGender(random.nextInt(1));
		userService.save(user);
	}
}
