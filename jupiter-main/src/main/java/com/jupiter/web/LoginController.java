/**
 * 
 */
package com.jupiter.web;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jupiter.BaseResult;
import com.jupiter.service.BizException;
import com.jupiter.service.UserService;
import com.jupiter.vo.JUserVO;
import com.jupiter.vo.LoginResult;
import com.jupiter.vo.MenuVo;

/**
 * @author zheng.zhang
 * 
 *         2017年4月19日
 */
@Controller
@RequestMapping("/login")
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

	@RequestMapping("/menu")
	@ResponseBody
	public List<MenuVo> fakeMenuList() {
		List<MenuVo> menu = new ArrayList<>();
		menu.add(new MenuVo("menu1", ""));
		menu.add(new MenuVo("menu2", ""));
		menu.add(new MenuVo("menu3", ""));
		return menu;
	}
}
