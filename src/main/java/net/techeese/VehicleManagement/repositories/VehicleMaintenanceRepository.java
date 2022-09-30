package net.techeese.VehicleManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.techeese.VehicleManagement.models.VehicleMaintenance;

@Repository
public interface VehicleMaintenanceRepository extends JpaRepository<VehicleMaintenance, Integer>{
	
	

}
