package com.assignmentQ3;


public class BankingApp {

	

	    public static void main( String[] args )
	    {
	      
			Application context = new ClassPathXmlApplicationContext("Spring3.xml");
	        Controller b = (Controller)context.getBean("controller");
	        b.deposit(12244L,10000);
	        b.getBalance(12244L);
	    }
	}

