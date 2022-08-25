package springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Info {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("springcore/collection/colectionconfig.xml");
		Anime a=(Anime) context.getBean("anime");
		System.out.println(a.getName());
		System.out.println(a.getAkatsuki());
		System.out.println(a.getHokage());
		System.out.println(a.getVillage());

	}

}
