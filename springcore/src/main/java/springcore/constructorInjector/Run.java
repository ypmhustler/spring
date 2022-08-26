package springcore.constructorInjector;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("springcore/constructorInjector/Ciconfig.xml");
		Pirates p=(Pirates) context.getBean("pirates");
		p.info();
		Captain c=(Captain) context.getBean("capt");
		Captain1 c1=(Captain1) context.getBean("capt1");
		System.out.println(c);
		System.out.println(c1);
		context.registerShutdownHook();

	}

}
