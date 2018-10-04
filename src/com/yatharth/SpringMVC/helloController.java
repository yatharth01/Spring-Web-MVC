package com.yatharth.SpringMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloController {
	@RequestMapping("/")
	   public String showMyPage() {
		return "main-menu";

	   }
}
