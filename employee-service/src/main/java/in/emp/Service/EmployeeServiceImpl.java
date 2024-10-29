package in.emp.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import in.emp.Repo.EmployeeRepo;
import in.emp.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	@Autowired
	EmployeeRepo employeeRepo;
	
	@Override
	public String saveEmp(@RequestBody Employee employee) {
		employeeRepo.save(employee);
		return "Success";
	}

	@Override
	public List<Employee> getAllEmp() {
		return employeeRepo.findAll();		
	}

	@Override
	public Employee getEmpById(Integer id) {
		Optional<Employee> byId = employeeRepo.findById(id);		
		if(byId.isPresent()) {
			return byId.get();
		}
		else {
			return null;
		}
	}

	@Override
	public String deleteById(Integer id) {
		employeeRepo.deleteById(id);
		return "Data is Deleted";
	}

	@Override
	public Employee getEmpByName(String name) {
		return employeeRepo.getEmpByName(name); 
	}


	
}
