package com.lti.controller;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.modelEntity.Level1;
import com.lti.modelEntity.Level2;
import com.lti.modelEntity.Level3;
import com.lti.modelEntity.Student;
import com.lti.modelEntity.StudentSideReport;
import com.lti.service.ExamService;
import com.lti.service.StudentExamService;

@Controller
@SessionAttributes({"dummy","reportsubjectchoice","subjectchoice","questionslevel1","qnol1","counterlevel1","questionslevel2","qnol2","counterlevel2","questionslevel3","qnol3","counterlevel3","loggedInUser"})
public class StudentExamController {
	
	@Autowired
	StudentExamService studentexamService;
	
	
	
	@RequestMapping(path="/subjectoption.lti")
	public String subjectSessionVariable(ModelMap model,@RequestParam("link") String name) {
		
		model.put("subjectchoice",name);
		return "startexam.jsp";
	}
	
	
	@RequestMapping(path="/examlevel1.lti", method = RequestMethod.POST)
	public String Questionlevel1(ModelMap model) {
		int subid= Integer.parseInt((model.get("subjectchoice").toString()));
		List<Level1>list=studentexamService.displayQueslevel1(subid);
		Collections.shuffle(list); 
		model.put("questionslevel1", list);
		
		return "redirect:getquestionlevel1.lti";
		
	}
	
	@RequestMapping(path = "/getquestionlevel1.lti")
	public String getQuestionlevel1(ModelMap model) {
		List<Level1> list = (List<Level1>) model.get("questionslevel1");
		Integer qno = (Integer) model.get("qnol1");
		if(qno == null)
			qno = 0;
		else
			qno ++;
		model.put("qnol1", qno);				
		while(qno<3)
		{	
			Level1 q = list.get(qno);
			model.put("currentQs", q);
			return "viewquestionlevel1.jsp";
		}
		Integer counter = (Integer) model.get("counterlevel1");
		if (counter>1) 
		{
		return"viewresultlevel1.jsp";
		}
		else
		{
			model.put("fail", counter);
			return"failresult.jsp";
		}
		
	}
	
	
	  @RequestMapping(path="/scorelevel1.lti", method = RequestMethod.POST)
	  public String calculatescorelevel1(ModelMap model,@RequestParam("ans")String ans) { 
		 
		
		  List<Level1> list = (List<Level1>) model.get("questionslevel1");
		  Integer qno = (Integer) model.get("qnol1");
		  Level1 q = list.get(qno);
		  String answer=q.getFlag();
		  Integer count = (Integer) model.get("counterlevel1");
		  if(count == null)
		  {  count=0;
		  model.put("counterlevel1", count);
		  }		  
		  if(ans.equals(answer)) {		  		 		  		 
			  count ++;
			  model.put("counterlevel1", count);		  
		  }
		  return "redirect:getquestionlevel1.lti"; 
	  }	 
//********************************************************************************************************************		

	  @RequestMapping(path="/examlevel2.lti", method = RequestMethod.POST)
		public String Questionlevel2(ModelMap model) {
			int subid= Integer.parseInt((model.get("subjectchoice").toString()));
			List<Level2>list=studentexamService.displayQueslevel2(subid);
			Collections.shuffle(list); 
			model.put("questionslevel2", list);
			
			return "redirect:getquestionlevel2.lti";
			
		}
		
		@RequestMapping(path = "/getquestionlevel2.lti")
		public String getQuestionlevel2(ModelMap model) {
			List<Level2> list = (List<Level2>) model.get("questionslevel2");
			Integer qno = (Integer) model.get("qnol2");
			if(qno == null)
				qno = 0;
			else
				qno ++;
			model.put("qnol2", qno);				
			while(qno<3)
			{	
				Level2 q = list.get(qno);
				model.put("currentQs", q);
				return "viewquestionlevel2.jsp";
			}
			Integer counter = (Integer) model.get("counterlevel2");
			if (counter>1) 
			{
			return"viewresultlevel2.jsp";
			}
			else
			{
				model.put("fail", counter);
				return"failresult.jsp";
			}
			
		}
		
		
		  @RequestMapping(path="/scorelevel2.lti", method = RequestMethod.POST)
		  public String calculatescorelevel2(ModelMap model,@RequestParam("ans")String ans) { 
			 
			
			  List<Level2> list = (List<Level2>) model.get("questionslevel2");
			  Integer qno = (Integer) model.get("qnol2");
			  Level2 q = list.get(qno);
			  String answer=q.getFlag();
			  Integer count = (Integer) model.get("counterlevel2");
			  if(count == null)
			  {  count=0;
			  	 model.put("counterlevel2", count);
			  }
			  if(ans.equals(answer)) {		  		 		  		 
				  count ++;
				  model.put("counterlevel2", count);		  
			  }
			  return "redirect:getquestionlevel2.lti"; 
		  }
//******************************************************************************************************************************		  

		  @RequestMapping(path="/examlevel3.lti", method = RequestMethod.POST)
			public String Questionlevel3(ModelMap model) {
				int subid= Integer.parseInt((model.get("subjectchoice").toString()));
				List<Level3>list=studentexamService.displayQueslevel3(subid);
				Collections.shuffle(list); 
				model.put("questionslevel3", list);
				
				return "redirect:getquestionlevel3.lti";
				
			}
			
			@RequestMapping(path = "/getquestionlevel3.lti")
			public String getQuestionlevel3(ModelMap model) {
				List<Level3> list = (List<Level3>) model.get("questionslevel3");
				Integer qno = (Integer) model.get("qnol3");
				if(qno == null)
					qno = 0;
				else
					qno ++;
				model.put("qnol3", qno);				
				while(qno<3)
				{	
					Level3 q = list.get(qno);
					model.put("currentQs", q);
					return "viewquestionlevel3.jsp";
				}
				Integer counter = (Integer) model.get("counterlevel3");
				if (counter>1) 
				{
				return"viewresultlevel3.jsp";
				}
				else
				{
					model.put("fail", counter);
					return"failresult.jsp";
				}
				
			}
			
			
			  @RequestMapping(path="/scorelevel3.lti", method = RequestMethod.POST)
			  public String calculatescorelevel3(ModelMap model,@RequestParam("ans")String ans) { 
				 
				
				  List<Level3> list = (List<Level3>) model.get("questionslevel3");
				  Integer qno = (Integer) model.get("qnol3");
				  Level3 q = list.get(qno);
				  String answer=q.getFlag();
				  Integer count = (Integer) model.get("counterlevel3");
				  if(count == null)
				  {  count=0;
				  	 model.put("counterlevel3", count);
				  }
				  if(ans.equals(answer)) {		  		 		  		 
					  count ++;
					  model.put("counterlevel3", count);		  
				  }
				  
				  return "redirect:getquestionlevel3.lti"; 
			  }
//*********************************************************************************************************************			  
			  @RequestMapping(path="/Report.lti", method = RequestMethod.POST)
			  public String addreport(ModelMap model, HttpSession session) {
				  int subid= Integer.parseInt((model.get("subjectchoice").toString()));
				  Integer count1 = (Integer) model.get("counterlevel1");
				  Integer count2 = (Integer) model.get("counterlevel2");
				  Integer count3 = (Integer) model.get("counterlevel3");
				  
				  Student student = (Student) model.get("loggedInUser");
				  if(count1==null) {
					  count1=0;
				  }
				  if(count2==null) {
					  count2=0;
				  }
				  if(count3==null) {
					  count3=0;
				  }
				  studentexamService.Addstudentreport(student,count1,count2,count3,subid);
				  
				return "redirect:studentDashboard.lti";
				
			  }
//***************************************************************************************************************			  
			  @RequestMapping(path="/reportsubjectoption.lti",method = RequestMethod.POST)
				public String reportsubjectSessionVariable(ModelMap model,@RequestParam("link") String name) {
					
					model.put("reportsubjectchoice",name);
					return "redirect:Reportstudent.lti";
				}
			  
			  @RequestMapping(path="/Reportstudent.lti")
			  public String viewreport(ModelMap model,HttpSession session) {
				  int subid= Integer.parseInt((model.get("reportsubjectchoice").toString()));				
				  Student student = (Student) model.get("loggedInUser");
				  int id=student.getRegId();
				 
				  List<StudentSideReport> report=studentexamService.viewstudentreport(id,subid);
				  System.out.println(report);
				  
				  if(report.isEmpty())
				  {
					  return "noRecord.jsp";
				  }
				  else
				  {
					  
					  model.put("report", report);
						return "viewReport.jsp";
					  				
				  }
				  
				  
					 
				
			  }
//************************************************************************************************************************
			  @RequestMapping(path="/viewallstudent.lti")
			  public String viewallstudent(ModelMap model) {
			  
				  List<Student> list=studentexamService.viewallstudent();
				  model.put("studetails", list);
					return "adminSideResult.jsp";
			  }
			  @RequestMapping(path="/studentadminreport.lti")
			  public String studentadminreport(ModelMap model,@RequestParam("studentId") int id) {
				  
				  Student student=studentexamService.getstudent(id);
				  model.put("loggedInUser",student);
				  model.put("dummy", 1);
				  return "subjectReportView.jsp";				  
			  }
			  
			 
}
			  
