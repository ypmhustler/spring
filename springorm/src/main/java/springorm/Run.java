package springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import springorm.config.HibernateConfig;
import springorm.dao.Titandao;
import springorm.entity.Titan;

public class Run 
{
    public static void main( String[] args ){
      
    	ApplicationContext context=new AnnotationConfigApplicationContext(HibernateConfig.class);
    	Titandao titandao=(Titandao) context.getBean("titandao");
    	//Titan titan1=new Titan(9,"Lady Titan","can hardend skin by using crystal");
    	//System.out.println("insert");
    	//titandao.insert(titan1);
    	
    	System.out.println("getting titan with id 5");
    	System.out.println(titandao.gettitan(5));
    	
    	System.out.println("Getting all titans");
    	System.out.println(titandao.getAllTitan());
    	
    	//System.out.println("updating titan power with warhammer with materliaze");
    	//Titan titan2=new Titan(2,"War_Hammer Titan","can materliaze anything");
    	//titandao.updatTitan(titan2);
    	
    	//System.out.println("deleting titan jaw titan");
    	//titandao.deleteTitan(7);
    	
    	
    	
    }

	
}
