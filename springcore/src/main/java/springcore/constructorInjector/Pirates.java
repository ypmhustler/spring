package springcore.constructorInjector;

import java.util.HashMap;
import java.util.Map;

public class Pirates {
	private String shipname;
	private int arc;
	private Captain captain;
	private Map<String ,String> emperor;
	public Pirates(String shipname, int arc, Captain captain, HashMap<String, String> emperor) {
		super();
		this.shipname = shipname;
		this.arc = arc;
		this.captain = captain;
		this.emperor = emperor;
	}
	public void init() {
		System.out.println("inside init method");
	}
	public void destroy() {
		System.out.println("inside destroy method");
	}
	public void info() {
		System.out.println(this.shipname);
		System.out.println(arc);
		System.out.println(this.captain.getName());
		System.out.println(this.emperor.values().toString());
		
	}
	

}
