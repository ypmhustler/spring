package springcore.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	
	public static void main(String [] args) {
		ApplicationContext  context=new ClassPathXmlApplicationContext("springcore/sterotype/steroconfig.xml");
		Ymir_subjects y=(Ymir_subjects) context.getBean("ymir");
		//Ymir_subjects y=context.getBean("ymir", Ymir_subjects.class);
		System.out.println(y);
		
		
		
		System.out.println("=====verifying the scope of bean of prototype ======");
		Ymir_subjects y1=context.getBean("ymir", Ymir_subjects.class);
		System.out.println(y1.hashCode());
		Ymir_subjects y2=context.getBean("ymir", Ymir_subjects.class);
		System.out.println(y2.hashCode());
		
		
		System.out.println("=====verifying the scope of bean in singleton======");
		System.out.println(y.getTitan().hashCode());
		Ymir_subjects y3=context.getBean("ymir", Ymir_subjects.class);
		System.out.println(y3.getTitan().hashCode());
	
				
	}

}
