/**
 * 
 */
package com.jupiter.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jupiter.model.JUser;
import com.jupiter.service.user.UserService;
import com.jupiter.vo.JUserVO;

/**
 * @author zheng.zhang
 * 
 *         2017年4月17日
 */
@RestController
@RequestMapping("/user")
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;

	@RequestMapping("/save")
	public String saveUser(JUserVO userVO) {
		JUser user = new JUser();
		BeanUtils.copyProperties(userVO, user);
		try {
			userService.save(user);
		} catch (Exception e) {
			log.error("", e);
		}
		return "OK";
	}
}
