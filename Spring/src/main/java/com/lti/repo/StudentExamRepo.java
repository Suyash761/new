package com.lti.repo;


import java.time.LocalDateTime;
import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.modelEntity.Level1;
import com.lti.modelEntity.Level2;
import com.lti.modelEntity.Level3;
import com.lti.modelEntity.Student;
import com.lti.modelEntity.StudentSideReport;
import com.lti.modelEntity.Subject;

@Repository
public class StudentExamRepo {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public List<Level1> displayQueslevel1(int subid) {
		Query q=entityManager.createQuery("select q from Level1 q where q.sub.subjectId=:id ");
		q.setParameter("id", subid);
		List<Level1> list=q.getResultList();
		return list;
		
	}
	
	@Transactional
	public List<Level2> displayQueslevel2(int subid) {
		Query q=entityManager.createQuery("select q from Level2 q where q.sub.subjectId=:id ");
		q.setParameter("id", subid);
		List<Level2> list=q.getResultList();
		return list;
		
	}
	@Transactional
	public List<Level3> displayQueslevel3(int subid) {
		Query q=entityManager.createQuery("select q from Level3 q where q.sub.subjectId=:id ");
		q.setParameter("id", subid);
		List<Level3> list=q.getResultList();
		return list;
		
	}

	@Transactional
	public void Addstudentreports(Student student,int count1,int count2,int count3,int subid) {
		StudentSideReport report= new StudentSideReport();
		Subject sub = entityManager.find(Subject.class, subid);
		report.setLevel1score(count1);
		report.setLevel2score(count2);
		report.setLevel3score(count3);
		report.setDateTime(LocalDateTime.now());
		report.setStudent(student);
		report.setSubject(sub);
		entityManager.persist(report);
		
	}
//	@Transactional
//	public List<Level1> displayreport(int subid) {
//		Query q=entityManager.createQuery("select q from Level1 q where q.sub.subjectId=:id ");
//		q.setParameter("id", subid);
//		List<Level1> list=q.getResultList();
//		return list;
//		
//	}

	public List<StudentSideReport> viewstudentreports(int id, int subid) {
		Query q=entityManager.createQuery("select r from StudentSideReport r where r.subject.subjectId=:id and r.student.regId=:stuid ");
		q.setParameter("id", subid);
		q.setParameter("stuid", id);
		List<StudentSideReport> list=q.getResultList();
		return list;
		
	}

//	public List<Student> viewallstudent() {
//		Query q=entityManager.createQuery("select s from Student s");
//		ret
//	}
}
