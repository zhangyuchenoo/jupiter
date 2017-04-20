package com.jupiter.service;

import com.jupiter.model.JUser;
import com.jupiter.vo.JUserVO;

public interface UserService {
	void save(JUser user);

	/**
	 * @param userVO
	 * @throws BizException
	 * 
	 */
	void login(JUserVO userVO) throws BizException;
}
