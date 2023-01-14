package com.pragati.cntr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping(value = {"/hello.htm"})
	public String sayHello(ModelMap model) {
		model.put("msg", "Hello Spring MVC !!!!!!!!");
		return "info";
	}
}
  