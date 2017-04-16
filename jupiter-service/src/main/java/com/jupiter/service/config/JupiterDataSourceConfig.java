/**
 * 
 */
package com.jupiter.service.config;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author zheng.zhang
 * 
 *         2017年4月13日
 */
@Configuration
@EnableTransactionManagement
@EnableAspectJAutoProxy
@EnableConfigurationProperties(JupiterDataSourceProperties.class)
@EnableJpaRepositories(basePackages = "com.jupiter.domain", transactionManagerRef = "transactionManager", entityManagerFactoryRef = "entityManagerFactory", repositoryImplementationPostfix = "Dao")
public class JupiterDataSourceConfig {

	@Autowired
	private JupiterDataSourceProperties properties;
	private static final Logger log = LoggerFactory.getLogger(JupiterDataSourceConfig.class);

	@Bean(name = "druidDatasource")
	public DruidDataSource getDatasource() {
		DruidDataSource dataSource = new DruidDataSource();
		try {
			dataSource.setFilters(properties.getFilters());
		} catch (SQLException e) {
			log.error("", e);
		}
		dataSource.setDriverClassName(properties.getDriverClassName());
		dataSource.setUsername(properties.getUsername());
		dataSource.setPassword(properties.getPassword());
		dataSource.setUrl(properties.getUrl());
		dataSource.setConnectionProperties(properties.getConnectionProperties());
		dataSource.setValidationQuery(properties.getValidationQuery());
		dataSource.setUseGlobalDataSourceStat(properties.isUseGlobalDataSourceStat());
		dataSource.setTestOnBorrow(properties.isTestOnBorrow());
		dataSource.setTestOnReturn(properties.isTestOnReturn());
		dataSource.setMinIdle(properties.getMinIdle());
		dataSource.setMaxActive(properties.getMaxActive());
		dataSource.setInitialSize(properties.getInitialSize());
		dataSource.setMaxWait(properties.getMaxWait());
		dataSource.setTimeBetweenEvictionRunsMillis(properties.getTimeBetweenEvictionRunsMillis());
		dataSource.setMinEvictableIdleTimeMillis(properties.getMinEvictableIdleTimeMillis());
		/**
		 * mysql需要下默认关闭游标
		 */
		dataSource.setPoolPreparedStatements(false);
		dataSource.setMaxPoolPreparedStatementPerConnectionSize(-1);
		dataSource.setMaxOpenPreparedStatements(-1);

		return dataSource;
	}

	@Bean
	public JpaVendorAdapter hibernateJpaVendorAdapter() {
		HibernateJpaVendorAdapter jp = new HibernateJpaVendorAdapter();
		jp.setDatabase(Database.MYSQL);
		jp.setDatabasePlatform(properties.getDatabasePlatform());
		return jp;
	}

	@Bean(name = "entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
			DataSource druidDatasource, JpaVendorAdapter hibernateJpaVendorAdapter) {
		Map<String, Object> property = new HashMap<String, Object>();
		property.put("open-in-view", false);
		property.put("hibernate.naming_strategy", properties.getNaming_strategy());
		property.put("hibernate.show_sql", properties.isShowSql());
		LocalContainerEntityManagerFactoryBean lcemf = builder.dataSource(druidDatasource).properties(property)
				.packages("com.jupiter.model").persistenceUnit("spring-data-jpa").build();
		lcemf.setJpaVendorAdapter(hibernateJpaVendorAdapter);
		return lcemf;
	}

	@Bean(name = "transactionManager")
	public JpaTransactionManager transactionManager(LocalContainerEntityManagerFactoryBean entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory.getObject());
	}
}
