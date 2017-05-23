/**
 * 
 */
package com.jupiter.service.mongo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.jupiter.model.MongoObj;
import com.jupiter.service.mongo.MongoService;

/**
 * @author zheng.zhang
 * 
 *         2017年5月2日
 */
@Service
public class MongoServiceImpl implements MongoService {

	@Autowired
	private MongoTemplate mongoTemplate;

	public void save(MongoObj objectToSave) {
		mongoTemplate.save(objectToSave);
	}
}
