package net.techeese.VehicleManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.techeese.VehicleManagement.models.Vehicle;
import net.techeese.VehicleManagement.repositories.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository vehicleRepository;
	
	//Get All Vehicles
	public List<Vehicle> findAll(){
		return vehicleRepository.findAll();
	}	
	
	//Get Vehicle By Id
	public Optional<Vehicle> findById(int id) {
		return vehicleRepository.findById(id);
	}	
	
	//Delete Vehicle
	public void delete(int id) {
		vehicleRepository.deleteById(id);
	}
	
	//Update Vehicle
	public void save(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
	}

}
