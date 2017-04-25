/**
 * 
 */
package com.jupiter;

import lombok.Data;

/**
 * @author zheng.zhang
 * 
 *         2017年4月19日
 */
@Data
public class BaseResult<T> {
	private Integer code;
	private String msg;
	private T data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
