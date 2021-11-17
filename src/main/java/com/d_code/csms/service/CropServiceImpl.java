package com.d_code.csms.service;

import java.util.List;
import java.util.Optional;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.d_code.csms.dao.CropRepository;
//import com.d_code.csms.dao.CropDAO;
import com.d_code.csms.entity.Crop;

@Service
public class CropServiceImpl implements CropService {

//	// define field for cropdao
//	private CropDAO cropDAO;
//	
//	// set up constructor injection
//	@Autowired
//	public CropServiceImpl(CropDAO theCropDAO) {
//		cropDAO = theCropDAO;
//	}
//
//	@Override
//	@Transactional
//	public List<Crop> findAll() {
//		return cropDAO.findAll();
//	}
//
//	@Override
//	@Transactional
//	public Crop findById(int theId) {
//		return cropDAO.findById(theId);
//	}
//
//	@Override
//	@Transactional
//	public void save(Crop theCrop) {
//		cropDAO.save(theCrop);
//	}
//
//	@Override
//	@Transactional
//	public void deleteById(int theId) {
//		cropDAO.deleteById(theId);
//	}
	
	private CropRepository cropRepository;
	
	// set up constructor injection
	@Autowired
	public CropServiceImpl(CropRepository theCropRepository) {
		cropRepository = theCropRepository;
	}
	
	@Override
//	@Transactional - Remove @Trnasactional since JpaRepository provides this functionality
	public List<Crop> findAll() {
		return cropRepository.findAll();
	}

	@Override
//	@Transactional
	public Crop findById(int theId) {
		Optional<Crop> result = cropRepository.findById(theId);
		
		Crop theCrop = null;
		
		if (result.isPresent()) {
			theCrop = result.get();
		}
		else {
			// we didn't find the crop
			throw new RuntimeException("Did not find crop id - " + theId);
		}
		
		return theCrop;

	}

	@Override
//	@Transactional
	public void save(Crop theCrop) {
		cropRepository.save(theCrop);
	}

	@Override
//	@Transactional
	public void deleteById(int theId) {
		cropRepository.deleteById(theId);
	}

}
