package net.techeese.VehicleManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.techeese.VehicleManagement.models.Employee;
import net.techeese.VehicleManagement.models.EmployeeType;

@Repository
public interface EmployeeTypeRepository extends JpaRepository<Employee, Integer> {

//	void save(EmployeeType employeeType);

}
