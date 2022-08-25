package springcore.collection;

import java.util.*;

public class Anime {
	private String name;
	private List<String> hokage;
	private Set<String> village;
	private Map<String,String>Akatsuki;
	public Anime(String name, List<String> hokage, Set<String> village, Map<String, String> akatsuki) {
		super();
		this.name = name;
		this.hokage = hokage;
		this.village = village;
		Akatsuki = akatsuki;
	}
	public Anime() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getHokage() {
		return hokage;
	}
	public void setHokage(List<String> hokage) {
		this.hokage = hokage;
	}
	public Set<String> getVillage() {
		return village;
	}
	public void setVillage(Set<String> village) {
		this.village = village;
	}
	public Map<String, String> getAkatsuki() {
		return Akatsuki;
	}
	public void setAkatsuki(Map<String, String> akatsuki) {
		Akatsuki = akatsuki;
	}

}
