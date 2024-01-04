package com.jyo.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody   //return message to the browser
	public String sayHello() {
		return "Hello! What are you learning today?";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody   //return message to the browser
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>My First HTML page</title>");
		sb.append("</head>");
		sb.append("	<body>");
		sb.append("My First HTML Page");
		sb.append("	</body>");
		sb.append("</html>");	
		return sb.toString();
	}
	
	
	/// /src/main/resources/META-INF/resources/WEB-INF/jsp/say-hello-jsp.jsp
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "say-hello-jsp";
	}
	
}
