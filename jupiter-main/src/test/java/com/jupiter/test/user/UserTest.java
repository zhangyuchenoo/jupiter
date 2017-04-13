/**
 * 
 */
package com.jupiter.test.user;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jupiter.config.Configure;
import com.jupiter.test.BaseTestCase;

/**
 * @author zheng.zhang
 * 
 *         2017年4月12日
 */
public class UserTest extends BaseTestCase {

	@Autowired
	private Configure configure;

	@Test
	public void testConfigure() {
		configure.getfooNames().forEach(word -> {
			System.err.println(word);
		});
	}
}
