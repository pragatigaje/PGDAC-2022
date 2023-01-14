package com.sarje.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class MyWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {

	@Override
	   protected void configure(HttpSecurity http) throws Exception {
	      http
	      	.csrf().disable()
	        .authorizeRequests()
//	        .antMatchers("/", "/login").permitAll()
	         .antMatchers("/").permitAll()
	         .anyRequest().authenticated()
	           
	         .and()
	         .formLogin()
//	         .loginPage("/login")
	         .permitAll()
	         .loginProcessingUrl("/login")
	         .defaultSuccessUrl("/welcome_page")
	         
	         .and()
	         .logout()
	         .invalidateHttpSession(true)
	         .clearAuthentication(true)
	         .permitAll();
	   }
	   @Autowired
	   public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	      auth
	         .inMemoryAuthentication()
	         .withUser("ram").password("{noop}123").roles("ADMIN");
	   }
}
