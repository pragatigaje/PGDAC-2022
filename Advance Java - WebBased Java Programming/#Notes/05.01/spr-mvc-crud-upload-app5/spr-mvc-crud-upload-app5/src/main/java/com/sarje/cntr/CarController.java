package com.sarje.cntr;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.sarje.model.Car;
import com.sarje.service.CarService;
import com.sarje.service.CarValidator;

@Controller
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@Autowired
	private CarValidator carValidator;

	@RequestMapping(value = {"/car_add_form.htm"})
	public String carAddForm(ModelMap model) {
		model.put("car", new Car());
		return "car_add_form";
	}
	
	@RequestMapping(value = {"/car_add.htm"},method = RequestMethod.POST)
	public String carAdd(Car car,BindingResult result, ModelMap model) {
		
		carValidator.validate(car, result);
		
		if(result.hasErrors())
			return "car_add_form";
		
		carService.add(car);
		model.put("car", car);
		return "car_add_form";
	}
	
	@RequestMapping(value = {"/car_list.htm"},method = RequestMethod.GET)
	public String carList(ModelMap model) {
		List<Car> lst = carService.getAll();
		model.put("cars", lst);
		return "car_list";
	}
	
	@RequestMapping(value = {"/car_delete.htm"},method = RequestMethod.GET)
	public String carDelete(@RequestParam(name = "id") int id, ModelMap model) {
		carService.removeById(id);
		List<Car> lst = carService.getAll();
		model.put("cars", lst);
		return "car_list";
	}
	
	@RequestMapping(value = {"/car_update_form.htm"},method = RequestMethod.GET)
	public String carUpdateForm(@RequestParam(name = "id") int id, ModelMap model) {
		Car c = carService.getById(id);
		model.put("car", c);
		return "car_update_form";
	}
	
	@RequestMapping(value = {"/car_update.htm"},method = RequestMethod.POST)
	public String carUpdate(Car car, ModelMap model) {
		carService.modify(car);
		List<Car> lst = carService.getAll();
		model.put("cars", lst);
		return "car_list";
	}
	
	@RequestMapping(value = {"/car_upload.htm"},method = RequestMethod.POST)
	public String carUpload(@RequestParam int id, @RequestParam CommonsMultipartFile image, ModelMap model, HttpServletRequest request) {
		
		try {
			ServletContext sc = request.getServletContext();
			String filePath = sc.getRealPath("images");
			Path path = Paths.get(filePath);
			if(!Files.exists(path)) {
				Files.createDirectory(path);
			}
			
			String fileName = image.getOriginalFilename();
			fileName = fileName.substring(fileName.lastIndexOf('.')); 
			fileName = id+fileName;
			path = path.resolve(fileName); 
			Files.copy(image.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
			System.out.println(path);
			carService.upload(id, fileName);
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		List<Car> lst = carService.getAll();
		model.put("cars", lst);
		return "car_list";
	}
	
	
}
