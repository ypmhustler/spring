package springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("springcore/ref/refconfig.xml");
		A obj=(A) context.getBean("a");
		System.out.println(obj.getX());
		System.out.println(obj.getOb().getY());

	}

}
