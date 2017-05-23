/**
 * 
 */
package com.jupiter.service.login;

import com.jupiter.service.BizException;
import com.jupiter.vo.JUserVO;

/**
 * @author zheng.zhang
 * 
 *         2017年5月23日
 */
public interface LoginService {
	/**
	 * @param userVO
	 * @throws BizException
	 * 
	 */
	void login(JUserVO userVO) throws BizException;
}
