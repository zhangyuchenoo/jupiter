/**
 * 
 */
package com.jupiter.vo;

/**
 * @author zheng.zhang
 * 
 *         2017年4月17日
 */
public class JUserVO {
	private Long id;
	private String name;
	private String passwd;
	private Integer gender;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}
}
