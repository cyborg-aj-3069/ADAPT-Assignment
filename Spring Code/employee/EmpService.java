package com.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class EmpService {
	
	private List<Employee> emp= new ArrayList <> (Arrays.asList(
			new Employee("Spring1","Spring2","Spring3"),
			new Employee("Java1","Java2","Java3"),
			new Employee("JavaScript1","JavaScript2","JavaScript3") 
			));
			
	
	
	public List<Employee> getAllEmp() {
		return emp;
	}

	public Employee getEmp(String id ) {
		return emp.stream().filter(t -> t.getE_id().equals(id)).findFirst().get();
	}

	public void addEmp(Employee employee) {
		emp.add(employee);
		
	}

	public void updateEmp(Employee employee, String id) {
		for (int i=0;i<emp.size();i++)
		{
			Employee t =  emp.get(i);
			if(t.getE_id().equals(id)) {
				emp.set(i, employee);
				return;
			}
			
		}
		
	}

	public void deleteEmp(String id) {
		emp.removeIf(t -> t.getE_id().equals(id));
		
	}

}
