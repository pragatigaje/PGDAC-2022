package com.pragati.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.pragati.model.Car;

@Service
public class CarValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(Car.class); 
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "make", "make_err","Make is required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "model", "make_err","Make is required");
		
		Car car = (Car)target;
		if(car.getPrice()<=0) {
			errors.rejectValue("price", "price_err","price cannot be 0 or less");
		}
		
	}
	
}
