package com.sarthika.PlacementService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlacementController {
	
	@Autowired
	private PlacementService service;
	
	@PostMapping("/placementservice") //send data from interface to DB
	public void ass(@RequestBody Placement place)
	{
		service.save(place);
	}

}
