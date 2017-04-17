/**
 * 
 */
package com.jupiter.service.config;

import java.util.Collection;
import java.util.LinkedHashSet;

import com.dangdang.ddframe.rdb.sharding.api.ShardingValue;
import com.dangdang.ddframe.rdb.sharding.api.strategy.table.SingleKeyTableShardingAlgorithm;
import com.google.common.collect.Range;

/**
 * @author zheng.zhang
 * 
 *         2017年4月17日
 */
public class JUserTableShardingStrategy implements SingleKeyTableShardingAlgorithm<Long> {

	private static final Integer DEFAULT_TABLE_SIZE = 50;
	private static final String TABLE_NAME = "j_user";

	private static final String BOUNDRY = "_";

	@Override
	public String doEqualSharding(Collection<String> availableTargetNames, ShardingValue<Long> shardingValue) {
		Long key = shardingValue.getValue();
		return TABLE_NAME + BOUNDRY + (key / DEFAULT_TABLE_SIZE);
	}

	@Override
	public Collection<String> doInSharding(Collection<String> availableTargetNames, ShardingValue<Long> shardingValue) {

		Collection<String> result = new LinkedHashSet<>(availableTargetNames.size());
		for (Long value : shardingValue.getValues()) {
			for (String tableName : availableTargetNames) {
				if (tableName.endsWith(value / DEFAULT_TABLE_SIZE + "")) {
					result.add(tableName);
				}
			}
		}
		return result;
	}

	@Override
	public Collection<String> doBetweenSharding(Collection<String> availableTargetNames,
			ShardingValue<Long> shardingValue) {

		Collection<String> result = new LinkedHashSet<>(availableTargetNames.size());
		Range<Long> range = (Range<Long>) shardingValue.getValueRange();
		for (Long i = range.lowerEndpoint(); i <= range.upperEndpoint(); i++) {
			for (String each : availableTargetNames) {
				if (each.endsWith(i / DEFAULT_TABLE_SIZE + "")) {
					result.add(each);
				}
			}
		}
		return result;
	}

}
