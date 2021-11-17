package com.d_code.csms.service;

import java.util.List;

import com.d_code.csms.entity.Crop;

public interface CropService {

	public List<Crop> findAll();
	
	public Crop findById(int theId);
	
	public void save(Crop theCrop);
	
	public void deleteById(int theId);
}
