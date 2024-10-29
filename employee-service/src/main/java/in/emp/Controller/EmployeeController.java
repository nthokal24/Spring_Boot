package in.emp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.emp.Service.EmployeeServiceImpl;
import in.emp.entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;
		
	@PostMapping("/save")
	public ResponseEntity<String> saveEmpRecord(@RequestBody Employee employee){
		String saveEmp = employeeServiceImpl.saveEmp(employee);
		return new ResponseEntity<String>(saveEmp, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<Employee>> getAllEmp(){
		List<Employee> allEmp = employeeServiceImpl.getAllEmp();
		return new ResponseEntity<List<Employee>>(allEmp, HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Employee> getByIdEmp(@PathVariable Integer id){
		Employee empById = employeeServiceImpl.getEmpById(id);
		return new ResponseEntity<Employee>(empById, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> empdeletById(@PathVariable Integer id){
		String deleteById = employeeServiceImpl.deleteById(id);
		return new ResponseEntity<String>(deleteById, HttpStatus.OK);
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<Employee> findByName(@PathVariable String name){
		Employee empByName = employeeServiceImpl.getEmpByName(name);
		return new ResponseEntity<Employee>(empByName, HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
