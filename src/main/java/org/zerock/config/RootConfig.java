//package org.zerock.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//import com.zaxxer.hikari.HikariConfig;
//@Configuration
//@ComponentScan(basePackages = {"org.zerock.sample"})
//public class RootConfig {
//	@Bean
//	public DataSource dataSource() {
//		HikariConfig hikariConfig = new HikariConfig();
//		hikariConfig.setDriverClassName("oracle.jdbc.driver.OracleDriver");
//		hikariConfig.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
//		hikariConfig.setUsername("system");
//		hikariConfig.setPassword("1234");
//		return DataSource;
//	}
//}
