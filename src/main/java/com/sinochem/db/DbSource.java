package com.sinochem.db;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

public interface DbSource {
	public DataSource getDataSource();
	
	public PlatformTransactionManager getPlatformTransactionManager();
	
	public SqlSessionFactory getSqlSessionFactory(DataSource dataSource) throws Exception;
}
