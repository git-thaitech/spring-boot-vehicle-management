package net.techeese.VehicleManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.techeese.VehicleManagement.models.VehicleMake;
import net.techeese.VehicleManagement.repositories.VehicleMakeRepository;

@Service
public class VehicleMakeService {
	
	@Autowired
	private VehicleMakeRepository vehicleMakeRepository;
	
	//Get All VehicleMakes
	public List<VehicleMake> findAll(){
		return vehicleMakeRepository.findAll();
	}	
	
	//Get VehicleMake By Id
	public Optional<VehicleMake> findById(int id) {
		return vehicleMakeRepository.findById(id);
	}	
	
	//Delete VehicleMake
	public void delete(int id) {
		vehicleMakeRepository.deleteById(id);
	}
	
	//Update VehicleMake
	public void save(VehicleMake vehicleMake) {
		vehicleMakeRepository.save(vehicleMake);
	}

}
