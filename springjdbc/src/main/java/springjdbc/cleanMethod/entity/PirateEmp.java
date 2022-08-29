package springjdbc.cleanMethod.entity;

import org.springframework.stereotype.Component;

@Component
public class PirateEmp {
	public PirateEmp() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String name;
	private String Devilfruit;
	private String title;
	
	@Override
	public String toString() {
		return "Pirate Emperor [name=" + name + ", Devilfruit=" + Devilfruit + ", title=" + title + "]";
	}
	public PirateEmp(String name, String devilfruit, String title) {
		super();
		this.name = name;
		Devilfruit = devilfruit;
		this.title = title;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDevilfruit() {
		return Devilfruit;
	}
	public void setDevilfruit(String devilfruit) {
		Devilfruit = devilfruit;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	
}
