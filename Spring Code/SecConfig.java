package com.example.DataSec;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecConfig extends WebSecurityConfigurerAdapter {
    @Autowired
     DataSource datasource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
		.dataSource(datasource)
		.withDefaultSchema()
		.withUser(
				User.withUsername("user")
				    .password("pass")
				    .roles("user")
				)
		.withUser(
				User.withUsername("admin")
				    .password("pass")
				    .roles("admin")
				);
		
	}
	@Bean
 public PasswordEncoder getPasswordEncoder() {
	return NoOpPasswordEncoder.getInstance();
		
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		    .antMatchers("/user").hasAnyRole("user","admin")
		    .antMatchers("/admin").hasRole("admin")
		    .antMatchers("/").permitAll()
		    .and().formLogin();
	}
	
	
	
	

}
