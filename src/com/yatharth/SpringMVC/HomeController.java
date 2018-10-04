package com.yatharth.SpringMVC;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HomeController {
	
  
  
   @RequestMapping("/form")
   public String submitForm() {
	   return "form";
   }
   
  @RequestMapping("/showQuery")
   public String showQuery() {
	   return "showQuery";
   }
  
  @RequestMapping("/showProcess2")
  public String showProcess(HttpServletRequest request,Model model) {
	  String s= request.getParameter("query");
	  s= "your query is" + s;
	  model.addAttribute("message",s);
	  return "showQuery";
  }
  
  @RequestMapping("/showProcess3")
  public String showProcess( @RequestParam("query") String s,Model model) {
	  s= "your query is" + s;
	  s = s.toUpperCase();
	  model.addAttribute("message",s);
	  return "showQuery";
  }
  
}
