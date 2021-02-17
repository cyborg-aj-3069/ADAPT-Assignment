package com.assignment;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Controller
public class MediaTek implements Processors {
	public void process() {
		System.out.println(" I am used in budget mobiles");
	}
}