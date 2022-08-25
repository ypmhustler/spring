package springcore.constructorInjector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springcore/constructorInjector/Ciconfig.xml");
		Pirates p=(Pirates) context.getBean("pirates");
		p.info();

	}

}
