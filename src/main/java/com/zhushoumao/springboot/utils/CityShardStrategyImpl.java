package com.zhushoumao.springboot.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.code.shardbatis.strategy.ShardStrategy;

public class CityShardStrategyImpl implements ShardStrategy {
	Logger LOG = LoggerFactory.getLogger(getClass());

	@Override
	public String getTargetTableName(String baseTableName, Object params, String mapperId) {
		LOG.debug("baseTableName->" + baseTableName + " \tparams->" + params + "\tmapperId->" + mapperId);
		if (params instanceof Long) {
			int nowIndex = ((Long) params).intValue();
			if (nowIndex == 3 || nowIndex == 4) {
				baseTableName = baseTableName + "_" + 2015;
			} else if (nowIndex == 5 || nowIndex == 6) {
				baseTableName = baseTableName + "_" + 2016;
			}
		}
		LOG.debug("proced baseTableName->" + baseTableName + " \tparams->" + params + "\tmapperId->" + mapperId);
		return baseTableName;
	}

}
