package com.jyo.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class LoginController {
	
	//private Logger logger = LoggerFactory.getLogger(getClass());
	/*@RequestMapping("login")
	public String loginPage(@RequestParam String name, ModelMap model) {*/
		//model.put("name", name);
		//logger.debug("Name is : {} ",name);
		//System.out.println("Name is : "+name); // instead of using sop, use Logger
	private AuthenticationService authenticationService;
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	@RequestMapping(value="login",method = RequestMethod.GET)
	public String loginPage() {
		return "Login";
	}
	
	@RequestMapping(value="login",method = RequestMethod.POST)
	public String welcomePage(@RequestParam String name,@RequestParam String password, ModelMap model) {
		if(authenticationService.authenticate(name, password)) {
			model.put("name", name);
			return "Welcome";
		}
		model.put("errorMessage", "Invalid Credential, Please try again!");
		return "Login";	
	}
}
