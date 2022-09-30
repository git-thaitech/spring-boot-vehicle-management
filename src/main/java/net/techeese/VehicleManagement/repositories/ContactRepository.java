package net.techeese.VehicleManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.techeese.VehicleManagement.models.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
