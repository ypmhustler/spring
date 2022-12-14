package springcore.constructorInjector;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Captain1 {
	private String name;
	private int commander;

	public int getCommander() {
		return commander;
	}

	public void setCommander(int commander) {
		this.commander = commander;
	}

	public Captain1(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@PostConstruct
	public void start(){
		System.out.println("inside init method using annotation");
		
	}
	@PreDestroy
	public void destroy() {
		System.out.println("inside destroy method using  annotation");
		
	}

	@Override
	public String toString() {
		return "Captain [name=" + name + ", commander=" + commander + "]";
	}

}


