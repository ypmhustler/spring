package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.protobuf.Service;

import springmvc.dao.UserDao;
import springmvc.entity.Login;
import springmvc.entity.User;
import springmvc.service.Service1;

@Controller
public class PirateKing {

	
	
	@ModelAttribute
	public void common(Model m) {
		m.addAttribute("info", "This challenge requires sannin level rank card");
		m.addAttribute("desc", "currrent winner is Master Jiraya");
	}
	
	
	@RequestMapping("/pirate")
	public String Registation() {
		return "contact";
		
	}
	@RequestMapping(path="/signin")
	public String Signin() {
		return "SignIn";
		
	}
	@RequestMapping(path="/loginprocess",method=RequestMethod.POST)
	public String loginprocess(@ModelAttribute Login login ,Model m) {
		ApplicationContext context=new AnnotationConfigApplicationContext(Service1.class);
		UserDao userDao=(UserDao) context.getBean("userdao");
		userDao.search(login);
		Login log=userDao.search(login);
		if((log.getUseremail().equals(login.getUseremail())) && (log.getPassword().equals(login.getPassword()))) {
			m.addAttribute("mail", log.getUseremail());
			m.addAttribute("pass", log.getPassword());
			m.addAttribute("name", log.getUserName());
			return "profile";
		}
		else {
		System.out.println("else block");
			return "NotAutorize";
		}
		
		
	}
/*	
    // this method(Approach-1) is old and reqires a lot of codding we can use diiferent appraoch which requires less coding 
    
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handler(HttpServletRequest req,@RequestParam("email")String userEmail,
			@RequestParam("userName")String username,
			@RequestParam("userpass")String password,Model model
	) {
		String email=req.getParameter("email");
		System.out.println(email); // this data is fetching by using httpServletRequest
		System.out.println(userEmail); //this data is fetching using requesstParam
		System.out.println(username); //this data is fetching using requesstParam
		System.out.println(password); //this data is fetching using requesstParam
		
		
//		model.addAttribute("userEmail", userEmail);
//		model.addAttribute("userName", username); 
//		model.addAttribute("userpass", password); here we use addAttribute to bind but we can also create a classs and use addAtrribute only one like in the below code
		
		User user=new User();
		user.setEmail(userEmail);
		user.setUserName(username);
		user.setUserpass(password);
		model.addAttribute(user);
		
		return "formAccept";
		
	} */
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handler(@ModelAttribute User user,Model model) {
		if(user.getUserName().isBlank() || user.getUserpass().isBlank() || user.getEmail().isBlank() ) {
			System.out.println("redirect block");
			
			return "redirect:/pirate";
		}
		else {
			ApplicationContext context=new AnnotationConfigApplicationContext(Service1.class);
			UserDao userDao=(UserDao) context.getBean("userdao");
			userDao.insert(user);
			return "formAccept";
		}
		
		
	}
		

}
