package com.sarje.cntr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sarje.model.Car;

@Controller
public class CarController {

	@RequestMapping(value = {"/car_add_form.htm"})
	public String sayHello(ModelMap model) {
		model.put("car", new Car());
		return "car_add_form";
	}
}
