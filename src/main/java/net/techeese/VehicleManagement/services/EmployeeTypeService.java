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
//import net.techeese.VehicleManagement.repositories.EmployeeTypeRepository;
//
//@Service
//public class EmployeeTypeService {
//	
//	@Autowired
//	private EmployeeTypeRepository employeeTypeRepository;
//	
//	//Get All EmployeeTypes
//	public List<Employee> findAll(){
//		return employeeTypeRepository.findAll();
//	}	
//	
//	//Get EmployeeType By Id
//	public Optional<Employee> findById(int id) {
//		return employeeTypeRepository.findById(id);
//	}	
//	
//	//Delete EmployeeType
//	public void delete(int id) {
//		employeeTypeRepository.deleteById(id);
//	}
//	
//	//Update EmployeeType
//	public void save( EmployeeType employeeType) {
//		employeeTypeRepository.save(employeeType);
//	}
//
//}
