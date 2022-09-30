package net.techeese.VehicleManagement.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.techeese.VehicleManagement.models.JobTitle;
import net.techeese.VehicleManagement.repositories.JobTitleRepository;

@Service
public class JobTitleService {

	@Autowired
	private JobTitleRepository jobTitleRepository;
	
	//Get All JobTitles
	public List<JobTitle> findAll(){
		return jobTitleRepository.findAll();
	}	
	
	//Get JobTitle By Id
	public Optional<JobTitle> findById(int id) {
		return jobTitleRepository.findById(id);
	}	
	
	//Delete JobTitle
	public void delete(int id) {
		jobTitleRepository.deleteById(id);
	}
	
	//Update JobTitle
	public void save(JobTitle jobTitle) {
		jobTitleRepository.save(jobTitle);
	}
}
