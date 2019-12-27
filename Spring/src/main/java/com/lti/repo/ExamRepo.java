package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.modelEntity.Level1;
import com.lti.modelEntity.Level2;
import com.lti.modelEntity.Level3;
import com.lti.modelEntity.Subject;

@Repository
public class ExamRepo {
	
	@PersistenceContext
	private EntityManager entityManager;
	@Transactional
	public void addQueslevel1(Level1 level1,int subid) {
		Subject sub = entityManager.find(Subject.class, subid);
		level1.setSub(sub);
		entityManager.persist(level1);
		
	}
	@Transactional
	public void addQueslevel2(Level2 level2,int subid) {
		Subject sub = entityManager.find(Subject.class, subid);
		level2.setSub(sub);
		entityManager.persist(level2);
		
	}
	@Transactional
	public void addQueslevel3(Level3 level3,int subid) {
		Subject sub = entityManager.find(Subject.class, subid);
		level3.setSub(sub);
		entityManager.persist(level3);
		
	}

}
