package io.employe.Details;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	private List<Employee> details =new ArrayList<Employee>();
	
	@Autowired
	private EmployeeRepository er;
	
	public List<Employee> getalldetails() {
		
		er.findAll().forEach(details::add);
		return details;
	}

	public Optional<Employee> geto(String id) {
		
		return er.findById(id);
	}

	public void addeach(Employee e) {
		
		er.save(e);
	}
	
	public Employee great() {
		Employee a,b=null;
		int age,max=0;
		for(int i=0;i<details.size();i++) {
			 a=details.get(i);
			age=a.getAge();
			if(age>max) {
				max=age;
				 b=a;
			}
			}
		return b;
	}
  
	
}
