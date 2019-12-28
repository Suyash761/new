package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lti.modelEntity.Level1;
import com.lti.modelEntity.Level2;
import com.lti.modelEntity.Level3;
import com.lti.modelEntity.Subject;
import com.lti.repo.ExamRepo;

@Service
public class ExamService {
	@Autowired
	private ExamRepo examRepo;

	public void addQueslevel1(Level1 level1,int subid) {
		examRepo.addQueslevel1(level1,subid);
		
	}
	public void addQueslevel2(Level2 level2,int subid) {
		examRepo.addQueslevel2(level2,subid);
		
	}
	public void addQueslevel3(Level3 level3,int subid) {
		examRepo.addQueslevel3(level3,subid);
		
	}
	public List<Level1> fetchlevel1(int subid) {
		
		return examRepo.fetchlevel1(subid);
	}
	public List<Level2> fetchlevel2(int subid) {
		
		return examRepo.fetchlevel2(subid);
	}
	public List<Level3> fetchlevel3(int subid) {
		
		return examRepo.fetchlevel3(subid);
	}
	
	public Level1 fetchlevel1question(int qid) {
		
		return examRepo.fetchlevel1question(qid);
	}
	public Level2 fetchlevel2question(int qid) {
		
		return examRepo.fetchlevel2question(qid);
	}
	public Level3 fetchlevel3question(int qid) {
		
		return examRepo.fetchlevel3question(qid);
	}
	public void addEditDetailsAdminlevel1(Level1 level1,int qid) {
		
		examRepo.addEditDetailsAdminlevel1(level1,qid);
	}
	public void addEditDetailsAdminlevel2(Level2 level2,int qid) {
		
		examRepo.addEditDetailsAdminlevel2(level2,qid);
	}
	public void addEditDetailsAdminlevel3(Level3 level3,int qid) {
	
	examRepo.addEditDetailsAdminlevel3(level3,qid);
}

}
