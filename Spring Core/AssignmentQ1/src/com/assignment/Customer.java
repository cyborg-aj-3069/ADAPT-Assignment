package com.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Customer {
	
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    Address address = (Address) context.getBean("address");
  
    
    public String getCustomerAddress(){
        String address = "Street : " + this.address.getStreet() + "City : " +
                this.address.getCity() + "State : "+ this.address.getState() + "ZIP :"+ this.address.getZip();
       
        return address;
    }
    
    
	private int cust_Id;
    private String cust_Name;
    private int cust_Number;
    
	
	
	public int getCust_Id() {
		return cust_Id;
	}
	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}
	public String getCust_Name() {
		return cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}
	public int getCust_Number() {
		return cust_Number;
	}
	public void setCust_Number(int cust_Number) {
		this.cust_Number = cust_Number;
	}
	@Override
	public String toString() {
		return "Customer [address=" + address + ", cust_Id=" + cust_Id + ", cust_Name=" + cust_Name + ", cust_Number="
				+ cust_Number + "]";
	}
	
	
    
    
	
	
}
