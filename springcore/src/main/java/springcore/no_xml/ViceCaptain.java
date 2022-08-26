package springcore.no_xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class ViceCaptain {
	@Value("Zoro")
	private String name;

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "ViceCaptain [name=" + name + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

}
