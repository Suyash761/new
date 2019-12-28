package com.lti.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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
	@Transactional
	public List<Level1> fetchlevel1(int subid) {
		Query q=entityManager.createQuery("select q from Level1 q where q.sub.subjectId=:id ");
		q.setParameter("id", subid);
		List<Level1> list=q.getResultList();
		return list;
	}
	@Transactional
	public List<Level2> fetchlevel2(int subid) {
		Query q=entityManager.createQuery("select q from Level2 q where q.sub.subjectId=:id ");
		q.setParameter("id", subid);
		List<Level2> list=q.getResultList();
		return list;
	}
	@Transactional
	public List<Level3> fetchlevel3(int subid) {
		Query q=entityManager.createQuery("select q from Level3 q where q.sub.subjectId=:id ");
		q.setParameter("id", subid);
		List<Level3> list=q.getResultList();
		return list;
	}
	@Transactional
	public Level1 fetchlevel1question(int qid) {
		Level1 ques = entityManager.find(Level1.class, qid);
		return ques;
		
	}
	@Transactional
	public Level2 fetchlevel2question(int qid) {
		Level2 ques = entityManager.find(Level2.class, qid);
		return ques;
	}
	@Transactional
	public Level3 fetchlevel3question(int qid) {
		Level3 ques = entityManager.find(Level3.class, qid);
		return ques;
	}
	@Transactional
	public void addEditDetailsAdminlevel1(Level1 level1,int qid) {		
		Level1 ques = entityManager.find(Level1.class, qid);
		ques.setQuestion(level1.getQuestion());
		ques.setAnswer1(level1.getAnswer1());
		ques.setAnswer2(level1.getAnswer2());
		ques.setAnswer3(level1.getAnswer3());
		ques.setAnswer4(level1.getAnswer4());
		ques.setFlag(level1.getFlag());
		entityManager.merge(ques);
		
	}
	@Transactional
	public void addEditDetailsAdminlevel2(Level2 level2,int qid) {		
		Level2 ques = entityManager.find(Level2.class, qid);
		ques.setQuestion(level2.getQuestion());
		ques.setAnswer1(level2.getAnswer1());
		ques.setAnswer2(level2.getAnswer2());
		ques.setAnswer3(level2.getAnswer3());
		ques.setAnswer4(level2.getAnswer4());
		ques.setFlag(level2.getFlag());
		entityManager.merge(ques);
		
	}
	@Transactional
	public void addEditDetailsAdminlevel3(Level3 level3,int qid) {		
		Level3 ques = entityManager.find(Level3.class, qid);
		ques.setQuestion(level3.getQuestion());
		ques.setAnswer1(level3.getAnswer1());
		ques.setAnswer2(level3.getAnswer2());
		ques.setAnswer3(level3.getAnswer3());
		ques.setAnswer4(level3.getAnswer4());
		ques.setFlag(level3.getFlag());
		entityManager.merge(ques);
		
	}



}
