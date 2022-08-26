package springcore.autowire;

public class TailedBeast {
	private String name1;

	@Override
	public String toString() {
		return "TailedBeast [name=" + name1 + "]";
	}

	public TailedBeast() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TailedBeast(String name) {
		super();
		this.name1 = name;
	}

	public String getName() {
		return name1;
	}

	public void setName(String name) {
		this.name1 = name;
	}

}
