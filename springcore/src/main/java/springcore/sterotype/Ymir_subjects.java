package springcore.sterotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ymir")
@Scope("prototype")
public class Ymir_subjects {
	@Value("Eren Yager")
	private String subject;
	@Autowired
	@Qualifier("lo")
    private Titans titan;
	
	@Override
	public String toString() {
		return "Ymir_subjects [subject=" + subject + ", titan=" + titan + "]";
	}
	public Ymir_subjects() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ymir_subjects(String subject, Titans titan) {
		super();
		this.subject = subject;
		this.titan = titan;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Titans getTitan() {
		return titan;
	}
	
	public void setTitan(Titans titan) {
		this.titan = titan;
	}

}

	
	
