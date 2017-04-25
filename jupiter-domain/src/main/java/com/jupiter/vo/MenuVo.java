/**
 * 
 */
package com.jupiter.vo;

/**
 * @author zheng.zhang
 * 
 *         2017年4月25日
 */
public class MenuVo {
	private String name;
	private String path;
	private int level;

	public MenuVo() {

	}

	public MenuVo(String name, String path) {
		this.name = name;
		this.path = path;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
}
