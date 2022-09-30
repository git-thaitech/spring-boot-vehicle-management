//package net.techeese.VehicleManagement.services;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import net.techeese.VehicleManagement.models.Employee;
//import net.techeese.VehicleManagement.models.EmployeeType;
//import net.techeese.VehicleManagement.repositories.EmployeeRepository;
//
//@Service
//public class EmployeeService {
//		
//	@Autowired
//	private EmployeeRepository employeeRepository;
//	
//	//Get All Employees
//	public List<EmployeeType> findAll(){
//		return employeeRepository.findAll();
//	}	
//	
//	//Get Employee By Id
//	public Optional<EmployeeType> findById(int id) {
//		return employeeRepository.findById(id);
//	}	
//	
//	//Delete Employee
//	public void delete(int id) {
//		employeeRepository.deleteById(id);
//	}
//	
//	//Update Employee
//	public void save( Employee employee) {
//		employeeRepository.save(employee);
//	}
//	
//	//Get Employee by username
//	public Employee findByUsername(String un) {
//		return employeeRepository.findByUsername(un);
//	}
//}
