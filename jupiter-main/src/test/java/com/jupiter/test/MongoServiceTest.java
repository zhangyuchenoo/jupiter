/**
 * 
 */
package com.jupiter.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jupiter.model.MongoObj;
import com.jupiter.service.MongoService;

/**
 * @author zheng.zhang
 * 
 *         2017年5月2日
 */
public class MongoServiceTest extends BaseTestCase {

	@Autowired
	MongoService mongoService;

	@Test
	public void testSave() {
		MongoObj obj = new MongoObj();
		obj.setId(1l);
		obj.setVar("hello");
		mongoService.save(obj);
	}
}
