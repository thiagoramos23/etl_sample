package com.corsair.repository;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

public class PostgresRepository {

	@Bean
	@ConfigurationProperties(prefix="spring.secondarydatasource")
	public DataSource dataSource() {
	    return DataSourceBuilder.create().build();
	}
}