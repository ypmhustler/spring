package springcore.no_xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "springcore.no_xml")
public class JavaConfig {
	
	@Bean(name="vice")
	public ViceCaptain getname() {
		ViceCaptain v=new ViceCaptain();
		return v;
	}

}
