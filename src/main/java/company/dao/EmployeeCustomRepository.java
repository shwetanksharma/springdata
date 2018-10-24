package company.dao;

import java.util.List;

import company.model.Employee;

public interface EmployeeCustomRepository {

	List<Employee> findByNameANDDepartId(String name, Long id);
}
