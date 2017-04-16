/**
 * 
 */
package com.jupiter.test.user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jupiter.model.JUser;
import com.jupiter.service.UserService;
import com.jupiter.service.config.Configure;
import com.jupiter.test.BaseTestCase;

/**
 * @author zheng.zhang
 * 
 *         2017年4月12日
 */
public class UserTest extends BaseTestCase {

	//@Autowired
	//private Configure configure;
	@Autowired
	private UserService userService;

	@Test
	public void testConfigure() {
		/*configure.getfooNames().forEach(word -> {
			System.err.println(word);
		});*/
	}
	
	@Test
	public void testSave(){
		JUser user=new JUser();
		//user.setId(1l);
		user.setName("first");
		user.setPasswd("1111");
		user.setGender(1);
		userService.save(user);
	}
}
