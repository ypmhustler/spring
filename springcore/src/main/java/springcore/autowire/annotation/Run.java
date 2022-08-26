package springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springcore/autowire/annotation/config.xml");
		Jinchuriki j =(Jinchuriki) context.getBean("jin");
		System.out.println(j);

	}

}
