package com.microservices.Employee.dbconfig;
import java.util.HashMap;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import jakarta.persistence.EntityManagerFactory;
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "h2EntityManagerFactory", transactionManagerRef = "h2TransactionManager", basePackages = {
		"com.microservices.Employee.h2Repository" })
public class H2DbConfig {
	@Bean
	@ConfigurationProperties("spring.h2db.datasource")
	public DataSourceProperties h2DataSourceProperties() {
		return new DataSourceProperties();
	}
	@Primary
	@Bean(name = "h2DataSource")
	@ConfigurationProperties(prefix = "spring.h2db.datasource")
	public DataSource dataSource() {
		DataSource ds = h2DataSourceProperties().initializeDataSourceBuilder().build();
		return ds;
	}
	@Primary
	@Bean(name = "h2EntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("h2DataSource") DataSource dataSource) {
		HashMap<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", "update");
		return builder.dataSource(dataSource).properties(properties).packages("com.microservices.Employee.h2Model")
				.persistenceUnit("h2").build();
	}
	@Primary
	@Bean(name = "h2TransactionManager")
	public PlatformTransactionManager transactionManager(
			@Qualifier("h2EntityManagerFactory") EntityManagerFactory entityManagerFactory) {
		return new JpaTransactionManager(entityManagerFactory);
	}
}