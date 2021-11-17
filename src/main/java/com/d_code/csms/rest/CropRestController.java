package com.d_code.csms.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.d_code.csms.entity.Crop;
import com.d_code.csms.service.CropService;

@RestController
@RequestMapping("/api")
public class CropRestController {
	
	private CropService cropService;
	
	@Autowired
	public CropRestController(CropService theCropService) {
		cropService = theCropService;
	}
	
	// add mapping for GET /crops - return list of crops
	@GetMapping("/crops")
	public List<Crop> findAll() {
		return cropService.findAll();
	}
	
	// add mapping for GET /crops/{cropId}
	@GetMapping("/crops/{cropId}")
	public Crop getCrop(@PathVariable int cropId) {
		Crop theCrop = cropService.findById(cropId);
		
		if (theCrop == null) {
			throw new RuntimeException("Crop id not found - " + cropId);
		}
		
		return theCrop;
	}
	
	// add mapping for POST /crops - add new crop
	@PostMapping("/crops")
	public Crop addCrop(@RequestBody Crop theCrop) {
		
		// also just in case they pass an id in JSON ... set in to 0
		// this is to force a save of new item ... instead of update
		
		theCrop.setId(0);
		
		cropService.save(theCrop);
		
		return theCrop;
	}
	
	// add mapping for PUT /crops - update existing crop
	@PutMapping("/crops")
	public Crop updateCrop(@RequestBody Crop theCrop) {
		
		cropService.save(theCrop);
		
		return theCrop;
	}
	
	// add mapping for DELETE /crops/{cropId} - delete crop
	@DeleteMapping("/crops/{cropId}")
	public String deleteCrop(@PathVariable int cropId) {
		
		Crop tempCrop = cropService.findById(cropId);
		
		// throw exception if null
		if(tempCrop == null) {
			throw new RuntimeException("Crop id not found - " + cropId);
		}
		
		cropService.deleteById(cropId);
		
		return "Deleted crop id - " + cropId;
	}
	
}
