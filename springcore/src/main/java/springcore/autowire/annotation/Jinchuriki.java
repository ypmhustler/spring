package springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Jinchuriki {
	private String name;
	private TailedBeast tailedbeast;
	
	@Override
	public String toString() {
		return "Jinchuriki [name=" + name + ", tailedbeast=" + tailedbeast + "]";
	}
	public Jinchuriki() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Jinchuriki(String name, TailedBeast tailedbeast) {
		super();
		this.name = name;
		this.tailedbeast = tailedbeast;
		System.out.println("using construtore autowire with annotation");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TailedBeast getTailedbeast() {
		return tailedbeast;
	}
	@Autowired
	@Qualifier("leaf")
	public void setTailedbeast(TailedBeast tailedbeast) {
		this.tailedbeast = tailedbeast;
		System.out.println("autowire using setter with annotation");
	}

}
