package springmvc.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




import springmvc.dao.UserDao;
import springmvc.entity.Login;
import springmvc.entity.User;
import springmvc.service.Service1;

@Controller
public class PirateKing extends HttpServlet {

	
	
	

	String lo;
	private String String;
	@ModelAttribute
	public void common(Model m) {
		m.addAttribute("info", "This challenge requires sannin level rank card");
		m.addAttribute("desc", "currrent winner is Master Jiraya");
	}
	
	
	@RequestMapping("/pirate")
	public String Registation(HttpServletResponse res) {
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
		res.setHeader("Pragma", "no-cache"); 
		res.setDateHeader("Expires", 0); 
		return "contact";
		
	}
	@RequestMapping(path="/signin")
	public String Signin(HttpServletRequest req,HttpServletResponse res ) {
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
		res.setHeader("Pragma", "no-cache"); 
		res.setDateHeader("Expires", 0); 
		lo=req.getSession().getId();
		System.out.println(lo);
		return "SignIn";
		
	}
	@RequestMapping(path="/logout")
	public String logout(HttpServletRequest req,HttpServletResponse res) {
		System.out.println("logout emthod");
		HttpSession session=req.getSession();
		session.invalidate();
		res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
		res.setHeader("Pragma", "no-cache"); 
		res.setDateHeader("Expires", 0); 
		return "redirect:/";
		
	}
	@RequestMapping(path="/loginprocess",method=RequestMethod.POST)
	public String loginprocess(@ModelAttribute Login login ,@ModelAttribute
			User user,Model m ,HttpServletRequest req,HttpServletResponse res)  {
		System.out.println("login process");
		System.out.println(req.getSession().getId());
		String l1=req.getSession().getId();
		if(lo.equals(l1)) {
			res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
			res.setHeader("Pragma", "no-cache"); 
			res.setDateHeader("Expires", 0); 
			ApplicationContext context=new AnnotationConfigApplicationContext(Service1.class);
			UserDao userDao=(UserDao) context.getBean("userdao");
			userDao.search(login);
			Login log=userDao.search(login);
			if((log.getUseremail().equals(login.getUseremail())) && (log.getPassword().equals(login.getPassword()))) {
				
				List<User> user1= userDao.getAlluser();
				m.addAttribute("user", user1);
				res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
				res.setHeader("Pragma", "no-cache"); 
				res.setDateHeader("Expires", 0); 
				HttpSession session=req.getSession();
				session.invalidate();
				return "profile";
			}
			else {
			System.out.println("else block");
				res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
				res.setHeader("Pragma", "no-cache"); 
				res.setDateHeader("Expires", 0); 
				HttpSession session=req.getSession();
				session.invalidate();
				return "NotAutorize";
			}
			
		}else {
			HttpSession session=req.getSession();
			session.invalidate();
			return "redirect:/";
			
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
	public String handler(@ModelAttribute User user,Model model,HttpServletResponse res) {
		if(user.getUserName().isBlank() || user.getUserpass().isBlank() || user.getEmail().isBlank() ) {
			System.out.println("redirect block");
			res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
			res.setHeader("Pragma", "no-cache"); 
			res.setDateHeader("Expires", 0); 
			return "redirect:/pirate";
		}
		else {
			ApplicationContext context=new AnnotationConfigApplicationContext(Service1.class);
			UserDao userDao=(UserDao) context.getBean("userdao");
			userDao.insert(user);
			res.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
			res.setHeader("Pragma", "no-cache"); 
			res.setDateHeader("Expires", 0); 
			return "formAccept";
		}
		
		
	}
		

}
