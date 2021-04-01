package com.SecurityConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

import com.mysql.cj.protocol.AuthenticationProvider;

@SuppressWarnings("deprecation")
public class SecurityConfiguration {
	@Autowired
	private UserDetailsService userDeatilsService;

	@Bean
	public AuthenticationProvider<?> authProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDeatilsService);
		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		return (AuthenticationProvider<?>) provider;
	}
 protected void configure(HttpSecurity http) throws Exception{
 }
	
	
}
