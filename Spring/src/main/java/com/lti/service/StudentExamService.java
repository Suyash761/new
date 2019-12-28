package com.lti.service;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lti.modelEntity.Level1;
import com.lti.modelEntity.Level2;
import com.lti.modelEntity.Level3;
import com.lti.modelEntity.Student;
import com.lti.modelEntity.StudentSideReport;
import com.lti.modelEntity.Subject;
import com.lti.repo.ExamRepo;
import com.lti.repo.StudentExamRepo;

@Service
public class StudentExamService {
	@Autowired
	private StudentExamRepo studentexamrepo;

	public List<Level1> displayQueslevel1(int subid) {
		return (studentexamrepo.displayQueslevel1(subid));	
		
	}
	public List<Level2> displayQueslevel2(int subid) {
		return (studentexamrepo.displayQueslevel2(subid));	
		
	}
	public List<Level3> displayQueslevel3(int subid) {
		return (studentexamrepo.displayQueslevel3(subid));	
		
	}
	public void Addstudentreport(Student student,int count1,int count2,int count3,int subid) {
		
		studentexamrepo.Addstudentreports(student,count1,count2,count3,subid);
	}
	public List<StudentSideReport> viewstudentreport(int id, int subid) {
		
		return(studentexamrepo.viewstudentreports(id,subid));
	}
	public List<Student> viewallstudent() {
		return(studentexamrepo.viewallstudent());
	}
	public Student getstudent(int id) {
		return(studentexamrepo.getstudent(id));
	}
}
