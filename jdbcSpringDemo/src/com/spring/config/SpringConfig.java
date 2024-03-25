package com.spring.config;


import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.spring.dao")
public class SpringConfig {
	
	@Bean
	public DataSource bk()
	{
		DriverManagerDataSource source = new DriverManagerDataSource();
		source.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1523:orcl");
		source.setUsername("system");
		source.setPassword("sct2306");
		return source;
	}
	
	@Bean
	public JdbcTemplate template() 
	{
		JdbcTemplate temp = new JdbcTemplate();
		temp.setDataSource(bk());
		return temp;
	}
}
