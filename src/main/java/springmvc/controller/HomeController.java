package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(path="/home",method=RequestMethod.GET)	
	public String home(Model model) {
		System.out.println("This is home url");
		model.addAttribute("name", "Sujit Shinde");
		model.addAttribute("id" , 220);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Rohit");
		friends.add("Pushpak");
		friends.add("Sanket");
		model.addAttribute("f", friends);
		
		return "index";	
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("This is about controller");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is help controller");
		ModelAndView modelAndView = new ModelAndView();
		//setting the data
		modelAndView.addObject("name", "Narendra");
		modelAndView.addObject("rollnumber", 212);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);
		//setting the view name
		modelAndView.setViewName("help");
		return modelAndView;
	}

}
