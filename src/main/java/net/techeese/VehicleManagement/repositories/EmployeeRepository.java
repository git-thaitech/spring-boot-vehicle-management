package net.techeese.VehicleManagement.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.techeese.VehicleManagement.models.Employee;
import net.techeese.VehicleManagement.models.EmployeeType;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeType, Integer> {
	
//	public Employee findByUsername(String un);

//	public void save(Employee employee);
}
