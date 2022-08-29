package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PirateKing {
	
	@RequestMapping("/pirate")
	public String Registation() {
		return "contact";
		
	}

}
