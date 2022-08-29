package springjdbc;

public class OnePieceChar {
	private String name;
	private String Devilfruit;
	private String title;
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "OnePieceChar [name=" + name + ", Devilfruit=" + Devilfruit + ", title=" + title + "]";
	}
	public OnePieceChar(String name, String devilfruit, String title) {
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
	
}
