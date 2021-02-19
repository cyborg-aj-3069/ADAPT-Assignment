package com.example.DataSec;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityRun {

	@RequestMapping("/")
	public String Landing() {
		return " <h2> Hello World , This is the Landing Page </h2>";
	}
	@RequestMapping("/user")
	public String user() {
		return " <h2> Hello User , This is the User Page </h2>";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return " <h2> Hello Admin , This is the Admin Page </h2>";
	}
}
