package com.sarje;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.sarje.service.ProductService;
import com.sarje.model.Product;


@SpringBootTest
public class ProductServiceTester {

	@Autowired
    private ProductService productService;
 
    @DisplayName("Test 1")
    @Test
    public void whenValidName_thenProductShouldBeFound() {
    	System.out.println("test =============");
        
        List<Product> found = productService.getAllByName("pc");
     
        assertThat(found.get(found.size()-1).getName()).isEqualTo("pc"); 
        
     }
    
}