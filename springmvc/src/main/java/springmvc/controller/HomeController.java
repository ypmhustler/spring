package springmvc.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping(path="/",method=RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("name", "bruce wayne");
		model.addAttribute("key", "Gotham");
		return "home";
	}
	
	@RequestMapping("/about")
	public ModelAndView about() {
		ModelAndView m=new ModelAndView();
		m.addObject("name", "Peter Parker");
		LocalDateTime date=LocalDateTime.now();
		m.addObject("date", date);
		m.setViewName("index");
		return m;
	}
}
