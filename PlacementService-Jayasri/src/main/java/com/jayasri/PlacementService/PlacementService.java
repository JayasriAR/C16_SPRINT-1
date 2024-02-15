package com.sarthika.PlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class PlacementService {
	
	@Autowired
	private PlacementRepository repo;
	//insert the record to the DB
	public void save(Placement place)
	{
		repo.save(place);
	}

	 
	
}
