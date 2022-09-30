package net.techeese.VehicleManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.techeese.VehicleManagement.models.VehicleModel;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
