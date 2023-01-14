package com.sarje.cntr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping(value = {"/hello.htm"})
	public String sayHello(ModelMap model) {
		// creating mode and storing data in key value
		model.put("msg", "Hello Spring MVC !!!!!!!!!!!!!!!!");
		// returning view name
		return "info";
	}
}
