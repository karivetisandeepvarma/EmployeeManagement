package com.flm.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.hibernate.HibernateTransactionManager;
import org.springframework.orm.jpa.hibernate.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages ="com.flm")
@EnableTransactionManagement
@EnableWebMvc
public class Configs {
	
	
	@Bean
	public HibernateTransactionManager transactionManager(
	        SessionFactory sessionFactory) {

	    return new HibernateTransactionManager(sessionFactory);
	}
	
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver()
	{
		InternalResourceViewResolver irvr = new InternalResourceViewResolver();
		
		irvr.setPrefix("/WEB-INF/views/");
		irvr.setSuffix(".jsp");
		return irvr;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory()
	{
		LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
		DataSource ds = dataSource();
		
		sf.setDataSource(ds);
		sf.setPackagesToScan("com.flm");
		sf.setHibernateProperties(properties());
		
		return sf;
	}
	
	@Bean
	public DataSource dataSource()
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/projects");
		dataSource.setUsername("root");
		dataSource.setPassword("Sandeep@2003");
		return dataSource;
	}
	
	@Bean
	public Properties properties()
	{
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.hbm2ddl.auto", "update");
		return props;
	}
	
	
	

}
