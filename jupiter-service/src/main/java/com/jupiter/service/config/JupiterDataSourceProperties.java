/**
 * 
 */
package com.jupiter.service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zheng.zhang
 * 
 *         2017年4月13日
 */
@ConfigurationProperties("jupiter.datasource")
public class JupiterDataSourceProperties {

	/**
	 * 连接URL
	 */
	private String url;
	/**
	 * 连接驱动
	 */
	private String driverClassName;
	/**
	 * 连接数据库用户
	 */
	private String username;
	/**
	 * 连接数据库密码
	 */
	private String password;
	/**
	 * 连接池初始化连接数
	 */
	private int initialSize = 1;
	/**
	 * 连接池最小空闲连接数
	 */
	private int minIdle;
	/**
	 * 连接池最大连接数
	 */
	private int maxActive;

	/**
	 * druid监控过滤器配置
	 */
	private String filters;
	/**
	 * druid连接属性配置
	 */
	private String connectionProperties;
	/**
	 * 是否开启全局数据状态监控
	 */
	private boolean useGlobalDataSourceStat;
	/**
	 * 用来检测连接是否有效的sql
	 */
	private String validationQuery;
	/**
	 * 归还连接时执行validationQuery检测连接是否有效
	 */
	private boolean testOnReturn;
	/**
	 * 申请连接时执行validationQuery检测连接是否有效
	 */
	private boolean testOnBorrow;
	/**
	 * 有两个含义： 1) Destroy线程会检测连接的间隔时间 2) testWhileIdle的判断依据，详细看testWhileIdle属性的说明
	 */
	private long timeBetweenEvictionRunsMillis = 60000;
	/**
	 * Destory线程中如果检测到当前连接的最后活跃时间和当前时间的差值大于 minEvictableIdleTimeMillis，则关闭当前连接。
	 */
	private long minEvictableIdleTimeMillis = 300000;
	/**
	 * 获取连接时最大等待时间，单位毫秒。配置了maxWait之后， 缺省启用公平锁，并发效率会有所下降，
	 * 如果需要可以通过配置useUnfairLock属性为true使用非公平锁。
	 */
	private long maxWait = 60000;

	/**
	 * hibernate 数据库使用平台类型
	 */
	private String databasePlatform;
	/**
	 * 命名策略类型
	 */
	private String naming_strategy;
	private boolean showSql = false;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getInitialSize() {
		return initialSize;
	}

	public void setInitialSize(int initialSize) {
		this.initialSize = initialSize;
	}

	public int getMinIdle() {
		return minIdle;
	}

	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}

	public int getMaxActive() {
		return maxActive;
	}

	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}

	public String getFilters() {
		return filters;
	}

	public void setFilters(String filters) {
		this.filters = filters;
	}

	public String getConnectionProperties() {
		return connectionProperties;
	}

	public void setConnectionProperties(String connectionProperties) {
		this.connectionProperties = connectionProperties;
	}

	public boolean isUseGlobalDataSourceStat() {
		return useGlobalDataSourceStat;
	}

	public void setUseGlobalDataSourceStat(boolean useGlobalDataSourceStat) {
		this.useGlobalDataSourceStat = useGlobalDataSourceStat;
	}

	public String getValidationQuery() {
		return validationQuery;
	}

	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}

	public boolean isTestOnReturn() {
		return testOnReturn;
	}

	public void setTestOnReturn(boolean testOnReturn) {
		this.testOnReturn = testOnReturn;
	}

	public boolean isTestOnBorrow() {
		return testOnBorrow;
	}

	public void setTestOnBorrow(boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}

	public long getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}

	public void setTimeBetweenEvictionRunsMillis(long timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}

	public long getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}

	public void setMinEvictableIdleTimeMillis(long minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}

	public long getMaxWait() {
		return maxWait;
	}

	public void setMaxWait(long maxWait) {
		this.maxWait = maxWait;
	}

	public String getDatabasePlatform() {
		return databasePlatform;
	}

	public void setDatabasePlatform(String databasePlatform) {
		this.databasePlatform = databasePlatform;
	}

	public String getNaming_strategy() {
		return naming_strategy;
	}

	public void setNaming_strategy(String naming_strategy) {
		this.naming_strategy = naming_strategy;
	}

	public boolean isShowSql() {
		return showSql;
	}

	public void setShowSql(boolean showSql) {
		this.showSql = showSql;
	}

}
