package com.corsair.connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class SqlServerConfiguration {

	@Bean(name = "sqlServerDB")
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource dataSource() {
	    return DataSourceBuilder.create().build();
	}
	
	@Bean(name = "sqlServerJdbcTemplate")
	public JdbcTemplate sqlServerJdbcTemplate(@Qualifier("sqlServerDB") 
                                              DataSource dataSourceSqlServer) {
		return new JdbcTemplate(dataSourceSqlServer);
	}

}
