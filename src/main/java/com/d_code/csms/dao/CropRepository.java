package com.d_code.csms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.d_code.csms.entity.Crop;

/**
 * Spring Data JPAを使用する方法
 * 
 * @author d_code
 * Entity type:Crop
 * Primary:Integer // because Crop class is based on Integer primary key
 *
 */
public interface CropRepository extends JpaRepository<Crop, Integer> {

	// that's it ... no need to write any code LOL!
	// get these CRUD methods for free
	// no need for implementation class
}
