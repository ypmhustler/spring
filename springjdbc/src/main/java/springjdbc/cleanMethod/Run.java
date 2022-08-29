package springjdbc.cleanMethod;

import org.springframework.context.ApplicationContext;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springjdbc.cleanMethod.Jdbcconfig;
import springjdbc.cleanMethod.JdbcconfigAutowire;
import springjdbc.cleanMethod.dao.PirateDaoImpl;
import springjdbc.cleanMethod.entity.PirateEmp;

public class Run 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcconfigAutowire.class);
        // below line used when u r configuring the bean using xml file
    	//ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc/cleanMethod/config.xml");
        PirateDaoImpl p1=(PirateDaoImpl) context.getBean("daoimpl");
        
        // insert operation
        
        //PirateEmp e=new PirateEmp("Big M","Soru Soru no Mi"," 3rd emperor");
        //p1.con(e);
        
        
        // update operation
        //PirateEmp e=new PirateEmp("the Gura Gura no Mi","1St emperor","BlackBeard");
        //PirateEmp e=new PirateEmp("Dragon Fruit","2nd emperor","kaido");
        //p1.change(e);
        
        // delete opeation
        
       // PirateEmp e=new PirateEmp();
       //e.setName("Luff1y");
       //p1.delete(e);
        
        
        //SelectOperation for one
       // PirateEmp pir=p1.select("kaido");
        //System.out.println(pir);
        
        
        
        
        // select * operation
        List<PirateEmp> p=p1.getAllPirateKing();
        for(PirateEmp pir :p) {
        	System.out.println(pir);
        }
    }
}
