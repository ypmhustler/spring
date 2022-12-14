package springcore.constructorInjector;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Captain implements InitializingBean,DisposableBean {
	private String name;
	private int commander;

	public int getCommander() {
		return commander;
	}

	public void setCommander(int commander) {
		this.commander = commander;
	}

	public Captain(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("inside init method using  interface");
		
	}
	
	public void destroy() throws Exception {
		System.out.println("inside destroy method using  interface");
		
	}

	@Override
	public String toString() {
		return "Captain [name=" + name + ", commander=" + commander + "]";
	}

}


