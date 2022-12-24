package com.shree.springboot.docker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@ResponseBody
	@RequestMapping("/home")
	public String sayHello() {
		return "Welcome to docker..!!!";
	}
}
