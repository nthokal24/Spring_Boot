package in.emp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.emp.entity.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	Employee getEmpByName(String name);

}
