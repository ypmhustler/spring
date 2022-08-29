package springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import springjdbc.cleanMethod.Jdbcconfig;
import springjdbc.cleanMethod.JdbcconfigAutowire;
import springjdbc.cleanMethod.dao.PirateDaoImpl;
import springjdbc.cleanMethod.entity.PirateEmp;

public class Run 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("springjdbc/config.xml");
        JdbcTemplate template=(JdbcTemplate) context.getBean("jdbcTemplate");
        String query="insert into pirate(name,DevilFruit,title) values(?,?,?)";
        int result =template.update(query,"Luff1y","Gum-Gum","5th emperor");
        System.out.println(result);
    }
}