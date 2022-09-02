package springmvc.controller;

import java.time.LocalDateTime;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

	// concept of path variable i am passing value in url  on view and getting the value of it in my controller
	@RequestMapping(path="/{userName}/{id}",method=RequestMethod.GET)
	public String home(Model model,@PathVariable("userName") String name,@PathVariable("id") int id,HttpServletResponse res) {
		model.addAttribute("name", "bruce wayne");
		model.addAttribute("key", "Gotham");
		System.out.println(name);
		System.out.println(id);
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
		res.setHeader("Pragma", "no-cache");  
		return "home";
	}
	@RequestMapping(path="/",method=RequestMethod.GET)
	public String home(Model model,HttpServletResponse res) {
		model.addAttribute("name", "Kisame Hoshikage Is inviting you ");
		model.addAttribute("key", "Tournament is coming up");
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
		res.setHeader("Pragma", "no-cache"); 
		res.setDateHeader("Expires", 0); 
		return "home";
	}
	
	@RequestMapping("/about")
	public ModelAndView about(HttpServletResponse res) {
		ModelAndView m=new ModelAndView();
		m.addObject("name", "Peter Parker");
		LocalDateTime date=LocalDateTime.now();
		m.addObject("date", date);
		m.setViewName("index");
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
		res.setHeader("Pragma", "no-cache"); 
		res.setDateHeader("Expires", 0); 
		return m;
	}
}
