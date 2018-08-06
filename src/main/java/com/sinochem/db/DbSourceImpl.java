package com.sinochem.db;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.sinochem.mapper", sqlSessionFactoryRef = "sqlSessionFactory")
public class DbSourceImpl implements DbSource {

    @Primary
    @Bean(name = "billDataSource")
    @ConfigurationProperties(prefix = "bill")
    @Override
    public DataSource getDataSource() {
        return new DruidDataSource();
    }

    @Primary
    @Bean(name = "billTransactionManager")
    @Override
    public PlatformTransactionManager getPlatformTransactionManager() {
        return new DataSourceTransactionManager(this.getDataSource());
    }

    @Primary
    @Bean(name = "sqlSessionFactory")
    @Override
    public SqlSessionFactory getSqlSessionFactory(DataSource dataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean.getObject();
    }
}
