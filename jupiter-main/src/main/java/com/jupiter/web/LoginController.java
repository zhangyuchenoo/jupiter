/**
 * 
 */
package com.jupiter.web;

import java.util.LinkedHashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jupiter.BaseResult;
import com.jupiter.service.BizException;
import com.jupiter.service.UserService;
import com.jupiter.vo.JUserVO;
import com.jupiter.vo.LoginResult;

/**
 * @author zheng.zhang
 * 
 *         2017年4月19日
 */
@RestController("/login")
public class LoginController {

	private static final Logger log = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	UserService userService;

	@RequestMapping("/login")
	public BaseResult<LoginResult> login(JUserVO userVO) {
		try {
			userService.login(userVO);
		} catch (BizException e) {
			log.error("用户名或密码错误");
		}
		return new BaseResult();
	}

	public Map<String, String> fakeMenuList() {
		Map<String, String> menu = new LinkedHashMap<>();
		menu.put("menu1", "");
		menu.put("menu2", "");
		menu.put("menu3", "");
		return menu;
	}
}
