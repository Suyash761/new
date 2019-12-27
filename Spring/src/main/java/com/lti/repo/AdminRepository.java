package com.lti.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.modelEntity.AdminLogin;
import com.lti.service.AdminLoginService;

@Repository
public class AdminRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
//	@Transactional
//	public void add(AdminLogin adminLogin) {
//		entityManager.persist(adminLogin);
//	}

	
	public AdminLogin fetch(String username, String password) {
		Query q = entityManager.createQuery("select a from AdminLogin a where a.username =:user and a.password =:pwd");
	    q.setParameter("user", username);
	    q.setParameter("pwd", password);
		return (AdminLogin) q.getSingleResult();
	}
	

}
