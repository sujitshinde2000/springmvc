package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;

	@ModelAttribute
	public void commonDataForModel(Model m) {
		m.addAttribute("Header", "LearnCodeWith Sujit");
		m.addAttribute("Desc", "Home for Programmer");
	}
	
	
	@RequestMapping("/contact")
	public String showForm(Model m) {
		/*
		 * m.addAttribute("Header","LearnCodeWith Sujit"); m.addAttribute("Desc",
		 * "Home for Programmer");
		 */
		return "contact";
	}

	/*
	 * To fetch data old way --new way request annotation
	 * 
	 * @RequestMapping(path="/processForm", method=RequestMethod.POST) public String
	 * handleForm(HttpServletRequest request) {
	 * 
	 * String email = request.getParameter("email");
	 * System.out.println("user email is "+email);
	 * 
	 * return ""; }
	 */

	/*
	 * till 61
	 * 
	 * @RequestMapping(path="/processForm", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String userEmail,
	 * 
	 * @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("userPassword")String userPassword, Model model) {
	 * System.out.println("User Email : "+userEmail);
	 * System.out.println("User Name : "+userName);
	 * System.out.println("User Password : "+userPassword);
	 * 
	 * //process model.addAttribute("name", userName); model.addAttribute("email",
	 * userEmail); model.addAttribute("password", userPassword);
	 * 
	 * return "success"; }
	 */

	/*
	 * 62 onwards before modelattribute
	 * 
	 * @RequestMapping(path="/processForm", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email") String userEmail,
	 * 
	 * @RequestParam("userName") String userName,
	 * 
	 * @RequestParam("userPassword")String userPassword, Model model) {
	 * System.out.println("User Email : "+userEmail);
	 * System.out.println("User Name : "+userName);
	 * System.out.println("User Password : "+userPassword);
	 * 
	 * 
	 * //User is the object which acts as a model User user = new User();
	 * user.setUserEmail(userEmail); 
	 * user.setUserName(userName);
	 * user.setUserPassword(userPassword);
	 * 
	 * System.out.println(user);
	 * 
	 * //process
	 * 
	 * model.addAttribute("name", userName); 
	 * model.addAttribute("email", userEmail);
	 * model.addAttribute("password", userPassword);
	 * 
	 * 
	 * model.addAttribute("user",user);
	 * 
	 * return "success"; }
	 */

	/*
	 * using ModelAttribute--we dont need to write request param bcz if fields are
	 * too many code will be length instead just use ModelAttribute & no need to set the userfields
	 */
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user, Model model) {
		

		/*
		 * model.addAttribute("Header","LearnCodeWith Sujit");
		 * model.addAttribute("Desc", "Home for Programmer");
		 */
	

		System.out.println(user);
		
		int createdUser = this.userService.createUser(user);
		
		model.addAttribute("msg", "User created with id : "+createdUser);
		
		return "success";
	}
	
	

}
