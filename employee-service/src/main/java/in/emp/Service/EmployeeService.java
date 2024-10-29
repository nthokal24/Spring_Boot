package in.emp.Service;

import java.util.List;
import in.emp.entity.Employee;

public interface EmployeeService {
	
	public String saveEmp(Employee employee);
	
	public List<Employee> getAllEmp();
	
	public Employee getEmpById(Integer id );

	public String deleteById(Integer id);
	
	Employee getEmpByName(String name);
	
	
}
