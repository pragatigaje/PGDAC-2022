package com.sarje.cntr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sarje.model.Product;
import com.sarje.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping(value = {"/product"}) 
	public String productAdd(@RequestBody Product product) {
		productService.add(product);
		return "success";
	}
	
	@PutMapping(value = {"/product"})
	public String productUpdate(@RequestBody Product product) {
		productService.modify(product);
		return "success";
	}
	
	@DeleteMapping(value = {"/product"})
	public String productDelete(@RequestParam int id) {
		System.out.println("first delete");
		productService.removeById(id);
		return "success";
	}
	
	@DeleteMapping(value = {"/product/{id}"})
	public String productDelete1(@PathVariable int id) {
		System.out.println("second delete");
		productService.removeById(id);
		return "success";
	}
	
	@GetMapping(value = {"/product/{id}"})
	public Product productGet(@PathVariable int id) {
		return productService.getById(id);
	}
	
	@GetMapping(value = {"/product"})
	public List<Product> productList(){
		return productService.getAll();
	}
	
	@GetMapping(value = {"/product/byname/{name}"})
	public List<Product> productListByName(@PathVariable String name){
		return productService.getAllByName(name);
	}
	
	@GetMapping(value = {"/product/byprice/{price}"})
	public List<Product> productListBySalary(@PathVariable float price){
		return productService.getBySalary(price);
	}
}
