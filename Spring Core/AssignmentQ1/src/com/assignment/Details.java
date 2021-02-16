package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Details {

    
	
	 private static ApplicationContext context;

	public static void main(String[] args){
	       
		 context = new ClassPathXmlApplicationContext("spring.xml");
		    Customer customer = (Customer) context.getBean("cust");
		    customer.getCust_Id();
		    customer.getCust_Name();
		    customer.getCust_Number();
		    customer.getCustomerAddress();
		    System.out.println("Details :" + customer);
		   
		 
		    
		    

		   
	    }

	   
	    
}
