package springcore.autowire.annotation;



public class TailedBeast {
	
	private String name;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public TailedBeast(String name) {
		super();
		this.name = name;
	}

	public TailedBeast() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "TailedBeast [name=" + name + "]";
	}
	

}
