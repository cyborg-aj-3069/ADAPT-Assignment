package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpController {

	@Autowired
	private EmpService empservice;
	
	
	@RequestMapping("/employee")
	public List<Employee> getAllEmp() {
		return empservice.getAllEmp();
	}
	
	@RequestMapping("/employee/{id}")
	public Employee getEmp(@PathVariable String id) {
		return empservice.getEmp(id);
	}

	@RequestMapping(method = RequestMethod.POST , value ="/employee")
	public void addEmp(@RequestBody  Employee employee){
		empservice.addEmp(employee);

	}
	@RequestMapping(method = RequestMethod.PUT , value ="/employee/{id}")
	public void updateEmp(@RequestBody Employee employee, @PathVariable String id){
		empservice.updateEmp(employee,id);	

	}
	
	@RequestMapping(method = RequestMethod.DELETE , value ="/employee/{id}")
	public void delEmployee(@PathVariable String id) {
		empservice.deleteEmp(id);
		}
	
}

