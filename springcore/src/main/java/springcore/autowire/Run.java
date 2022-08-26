package springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springcore/autowire/autoconfig.xml");
		Jinchuriki j=(Jinchuriki) context.getBean("jinchuriki");
		System.out.println(j);

	}

}
