package springjdbc.cleanMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

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
