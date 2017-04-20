/**
 * 
 */
package com.jupiter.service.config;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.router.strategy.NoneKeyShardingAlgorithm;
import com.jupiter.model.JUser;

/**
 * @author zheng.zhang
 * 
 *         2017年4月19日
 */
public class JUserTableNonkeyShardingStrategy implements NoneKeyShardingAlgorithm<Comparable<JUser>> {

	@Override
	public String doSharding(Collection<String> availableTargetNames, ShardingValue<Comparable<JUser>> shardingValue) {

		List<String> tableList = new ArrayList<>();
		tableList.add("j_user_0");
		tableList.add("j_user_1");

		return "j_user_0";
	}

	}
