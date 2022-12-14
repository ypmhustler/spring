package springcore.sterotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("lo")
public class Titans {
	@Value("Attack Titan")
	private String name;

	@Override
	public String toString() {
		return "Titans [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Titans() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Titans(String name) {
		super();
		this.name = name;
	}

}
