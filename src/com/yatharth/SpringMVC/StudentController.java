package com.yatharth.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/student")

public class StudentController {

	@RequestMapping("/showForm")
	public String ShowForm(Model themodel) {
		Student theStudent= new Student();
		
		themodel.addAttribute("student",theStudent);
		
		return "showForm";
		
	}
	
	@RequestMapping("/processStudent")
    public String ProcessStudent(@ModelAttribute("student") Student theStudent)
    {
		return "processStudent";
		
    }
	
}
