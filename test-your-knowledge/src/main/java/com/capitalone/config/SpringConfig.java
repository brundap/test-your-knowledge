package com.capitalone.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Component
public class SpringConfig {

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:9000/postgres?currentSchema=testyourknowledge");
		dataSource.setUsername("skp036");
		dataSource.setPassword("Capital1");
         
        return dataSource;
	}
	
	@Bean
	public JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		
		return new JdbcTemplate(dataSource);
	}
}
