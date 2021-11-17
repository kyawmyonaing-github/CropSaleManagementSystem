package com.d_code.csms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

//import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;

import com.d_code.csms.entity.Crop;

@Repository
public class CropDAOImpl implements CropDAO {
	
	// define field for entitymanager
	private EntityManager entityManager;
	
	// set up constructor injection
	@Autowired
	public CropDAOImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

//	/**
//	 * EntityManagerを使用しますが、ネイティブのHibernateAPIを活用する方法
//	 */
//	@Override
//	// @Transactional
//	public List<Crop> findAll() {
//		
//		// get the current hibernate session
//		Session currentSession = entityManager.unwrap(Session.class);
//		
//		// create a query
//		Query<Crop> theQuery = 
//				currentSession.createQuery("from Crop", Crop.class);
//		
//		// execute query and get result list
//		List<Crop> crops = theQuery.getResultList();
//		
//		// return the results
//		return crops;
//		
//	}
	
	/**
	 * EntityManagerと標準のJPA APIを使用する方法
	 */
	@Override
	// @Transactional
	public List<Crop> findAll() {
		
		// create a query
		Query theQuery = 
				entityManager.createQuery("from Crop", Crop.class);
		
		// execute query and get result list
		List<Crop> crops = theQuery.getResultList();
		
		// return the results
		return crops;
		
	}

//	/**
//	 * EntityManagerを使用しますが、ネイティブのHibernateAPIを活用する方法
//	 */
//	@Override
//	public Crop findById(int theId) {
//
//		// get the current hibernate session
//		Session currentSession = entityManager.unwrap(Session.class);
//		
//		// get the crop
//		Crop theCrop = 
//				currentSession.get(Crop.class, theId);
//		
//		// return the crop
//		return theCrop;
//		
//	}
	
	/**
	 * EntityManagerと標準のJPA APIを使用する方法
	 */
	@Override
	public Crop findById(int theId) {
		
		// get the crop
		Crop theCrop = 
				entityManager.find(Crop.class, theId);
		
		// return the crop
		return theCrop;
		
	}

//	/**
//	 * EntityManagerを使用しますが、ネイティブのHibernateAPIを活用する方法
//	 */
//	@Override
//	public void save(Crop theCrop) {
//		
//		// get the current hibernate session
//		Session currentSession = entityManager.unwrap(Session.class);
//		
//		// save or update the crop
//		currentSession.saveOrUpdate(theCrop);
//		
//	}
	
	/**
	 * EntityManagerと標準のJPA APIを使用する方法
	 */
	@Override
	public void save(Crop theCrop) {
		
		// save or update the crop
		Crop dbCrop = entityManager.merge(theCrop);
		
		// update with id from db ... so we can get generated id for save/insert
		theCrop.setId(dbCrop.getId());
	}

//	/**
//	 * EntityManagerを使用しますが、ネイティブのHibernateAPIを活用する方法
//	 */
//	@Override
//	public void deleteById(int theId) {
//		
//		// get the current hibernate session
//		Session currentSession = entityManager.unwrap(Session.class);
//		
//		// delete object with primary key
//		Query theQuery =
//				currentSession.createQuery(
//						"delete from Crop where id=:cropId");
//		theQuery.setParameter("cropId", theId);
//		
//		theQuery.executeUpdate();
//		
//	}
	
	/**
	 * EntityManagerと標準のJPA APIを使用する方法
	 */
	@Override
	public void deleteById(int theId) {
		
		// delete object with primary key
		Query theQuery =
				entityManager.createQuery(
						"delete from Crop where id=:cropId");
		theQuery.setParameter("cropId", theId);
		
		theQuery.executeUpdate();
		
	}

}
