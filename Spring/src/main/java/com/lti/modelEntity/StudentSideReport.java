package com.lti.modelEntity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TBL_StudentSideReport")
public class StudentSideReport {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE, generator="repo" )
	@SequenceGenerator(name="repo" , sequenceName="SEQ_REPORTSTUDENT",allocationSize=1)
	int reportid;
	int level1score;
	int level2score;
	int level3score;
	LocalDateTime dateTime;
	
	@ManyToOne
	@JoinColumn(name="STUDENT_ID")
	Student student;
	
	@ManyToOne
	@JoinColumn(name="SUBJECT_ID")
	Subject subject;


	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public int getReportid() {
		return reportid;
	}

	public void setReportid(int reportid) {
		this.reportid = reportid;
	}

	public int getLevel1score() {
		return level1score;
	}

	public void setLevel1score(int level1score) {
		this.level1score = level1score;
	}

	public int getLevel2score() {
		return level2score;
	}

	public void setLevel2score(int level2score) {
		this.level2score = level2score;
	}

	public int getLevel3score() {
		return level3score;
	}

	public void setLevel3score(int level3score) {
		this.level3score = level3score;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
