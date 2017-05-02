/**
 * 
 */
package com.jupiter.model;

import org.springframework.data.annotation.Id;

/**
 * @author zheng.zhang
 * 
 *         2017年5月2日
 */
public class MongoObj {
	@Id
	private Long id;
	private String var;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVar() {
		return var;
	}

	public void setVar(String var) {
		this.var = var;
	}

}
