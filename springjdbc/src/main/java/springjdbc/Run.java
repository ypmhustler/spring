package springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springjdbc.cleanMethod.dao.PirateDaoImpl;
import springjdbc.cleanMethod.entity.PirateEmp;

public class Run 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc/cleanMethod/config.xml");
        PirateDaoImpl p1=(PirateDaoImpl) context.getBean("daoimpl");
        PirateEmp e=new PirateEmp("BlackBeard","Shadow Fruit"," 4th emperor");
        //e.setName("Kaido");
        //e.setDevilfruit("Dragon fruit");
        //e.setTitle(" 1st emperor");
        System.out.println(e.getName()+e.getTitle()+e.getDevilfruit());
        //JdbcTemplate template=(JdbcTemplate) context.getBean("jdbcTemplate");
       // String query="insert into pirate(name,DevilFruit,title) values(?,?,?)";
       //int result =template.update(query,"Luff1y","Gum-Gum","5th emperor");
       //System.out.println(result);
       p1.con(e);
    }
}
