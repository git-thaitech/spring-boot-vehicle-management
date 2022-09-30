package net.techeese.VehicleManagement.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import net.techeese.VehicleManagement.models.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer> {

}
