package springcore.no_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {
	
	public static void main(String [] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext(JavaConfig.class);
		OnePiece p=(OnePiece) context.getBean("Garp");
		System.out.println(p);
		System.out.println(p.getViceCaptain().getName()); // Accessing vicecaptain using onePiece class without using the @bean of viceCaptain class
		ViceCaptain p1=(ViceCaptain) context.getBean("vice");
		System.out.println("==============================");
		System.out.println(p1.getName()); // Accessing viceCpatian variable using @bean annotation
		
	}

}
