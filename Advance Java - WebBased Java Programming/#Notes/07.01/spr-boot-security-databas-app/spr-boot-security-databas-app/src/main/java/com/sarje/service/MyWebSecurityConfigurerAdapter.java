/*
CREATE TABLE USER(
  USERNAME varchar(50) NOT NULL,
  PASSWORD varchar(65) NOT NULL,
  ROLE varchar(15) NOT NULL);

INSERT INTO USER VALUES ('user','$2a$10$5e3dB36HeRcozRgp8xQfw.tfD3Qsut8xu/NT9g/DSpVKg9Kzuitrq','USER');
INSERT INTO USER VALUES ('admin','$2a$10$5e3dB36HeRcozRgp8xQfw.tfD3Qsut8xu/NT9g/DSpVKg9Kzuitrq','ADMIN');

*/

package com.sarje.service;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class MyWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource dataSource;

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
	      .jdbcAuthentication().dataSource(dataSource)
	      .authoritiesByUsernameQuery("select USERNAME, ROLE from USER where USERNAME=?")
	      .usersByUsernameQuery("select USERNAME, PASSWORD, 1 as enabled  from USER where USERNAME=?");
	   }
	   
	   @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
}
