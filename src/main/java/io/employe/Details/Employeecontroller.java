package io.employe.Details;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Employeecontroller {
	
	@Autowired
   private EmployeeService es;
	
   @RequestMapping("/employees")
   public List<Employee> getall(){
	   
	   return es.getalldetails();
   }
   @RequestMapping("/employees/{id}")
   public Optional<Employee> getone(@PathVariable String id) {
	   return es.geto(id);
   }
   @RequestMapping(method=RequestMethod.POST,value="/employees")
   public void add(@RequestBody Employee e) {
	   es.addeach(e);
   }
   @RequestMapping("/employees/age")
   public Employee getgreat() {
	   return es.great();
   }
}
