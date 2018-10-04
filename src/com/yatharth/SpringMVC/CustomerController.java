package com.yatharth.SpringMVC;


import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/form")
	public String showForm(Model themodel)
	{
		//Customer thecustomer= new Customer();
		
		themodel.addAttribute("customer",new Customer());
		
		return "customer-form";	
	}
	
	
	@RequestMapping("/processform")
	public String processForm(@Valid @ModelAttribute("customer") Customer thecustomer,BindingResult theBindingResult) {
		if(theBindingResult.hasErrors())
		{
			return "customer-form";
		}
		else
		{
		return "processCustomer";
			
		}
		
	}

}

