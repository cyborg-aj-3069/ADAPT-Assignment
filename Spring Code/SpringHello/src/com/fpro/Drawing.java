package com.fpro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Drawing {

	public static void main(String Args[]) {
		
	 ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	  Triangle triangle = (Triangle) context.getBean("Triangle");
	  triangle.draw();
	 
		
	}
	
}
