/**
 * 
 */
package com.jupiter.service.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zheng.zhang
 * 
 *         2017年4月12日
 */
// @Configuration
// @EnableTransactionManagement
public class MybatisConfig {

	@Autowired
	private DataSource dataSource;

	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	// @Bean
	public SqlSessionFactory sqlSessionFactoryBean() {
		return null;
	}
}
