package com.sarje.service;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.sarje.model.Car;

@Service
public class CarValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(Car.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "make", "make_err","make required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "model", "model_err","model required");
		
		Car car = (Car)target;
		if(car.getPrice()<=0) {
			errors.rejectValue("price", "price_err", "price can not be 0 or less"); 
		}
		
		
	}

}
