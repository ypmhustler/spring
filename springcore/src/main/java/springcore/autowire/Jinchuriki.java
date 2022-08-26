package springcore.autowire;

public class Jinchuriki {
	
 private String name;
 private TailedBeast tailedbeast;
	public Jinchuriki(String name, TailedBeast tailedbeast) {
	super();
	this.name = name;
	this.tailedbeast = tailedbeast;
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

	public void setTailedbeast(TailedBeast tailedbeast) {
		this.tailedbeast = tailedbeast;
	}

	public Jinchuriki() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Jinchuriki [name=" + name + ", tailedbeast=" + tailedbeast + "]";
	}

	

}
