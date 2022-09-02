package springorm.config;

import java.io.IOException;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import springorm.entity.Titan;

@Configuration
@ComponentScan(basePackages = {"springorm.config","springorm.dao","springorm.entity"})
public class HibernateConfig {
	
	

	@Bean(name="ds")
	public DriverManagerDataSource getDatasource() {
		
		DriverManagerDataSource ds1=new DriverManagerDataSource();
		ds1.setDriverClassName("com.mysql.jdbc.Driver");
		ds1.setUrl("jdbc:mysql://localhost:8000/data");
		ds1.setUsername("root");
		ds1.setPassword("Yashu");
		return ds1;
		
	}
	
	public Properties hibernateProperties() {
		Properties p=new Properties();
		p.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL57Dialect");
		p.setProperty("hibernate.show_sql", "true");
		p.setProperty("hibernate.hbm2ddl.auto", "update");
		return p;
	}
	@Bean(name="localSession")
	public SessionFactory sessionBean()  {
		LocalSessionFactoryBean session= new LocalSessionFactoryBean();
		session.setDataSource(getDatasource());
		session.setHibernateProperties(hibernateProperties());
		session.setAnnotatedClasses(Titan.class);
		try {
			session.afterPropertiesSet();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		SessionFactory factory=session.getObject();
		return factory;
	}

	
	@Bean(name="HibernateTemplate")
	public HibernateTemplate hibernateT() {
		HibernateTemplate t= new HibernateTemplate();
		t.setSessionFactory( sessionBean());
		t.afterPropertiesSet();
		return t;
	}
	
	@Bean(name="Transcation")
	public HibernateTransactionManager transcation()  {
		HibernateTransactionManager manger=new HibernateTransactionManager();
		manger.setSessionFactory(sessionBean());
		return manger;
	}
	

}
