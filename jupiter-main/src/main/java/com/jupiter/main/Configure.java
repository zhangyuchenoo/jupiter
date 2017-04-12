/**
 * 
 */
package com.jupiter.main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zheng.zhang
 * 
 *         2017年4月12日
 */
@ConfigurationProperties("foo")
public class Configure {
	private List<String> fooname = new ArrayList<String>();

	public List<String> getfooNames() {
		return fooname;
	}

}
