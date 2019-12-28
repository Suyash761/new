package com.lti.controller;

import java.util.List;

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
import com.lti.service.ExamService;

@Controller
@SessionAttributes({"editQuestionid","subjectcode","lev","adminsubjectcode","adminlev","adminlevQuestion"})
public class ExamController {
	
	@Autowired
	ExamService examService;
	
	@RequestMapping(path="/subject.lti")
	public String subjectSessionVariable(ModelMap model,@RequestParam("link") String name) {
		
		model.put("subjectcode",name);
		return "Level.jsp";
	}
	
	@RequestMapping(path="/level.lti")
	public String levelSessionVariable(ModelMap model,@RequestParam("setlevel") String level) {
		
		model.put("lev",level);
		return "addQuestion.jsp";
	}
	@RequestMapping(path="/level1.lti", method = RequestMethod.POST)
	public String addQuestionlevel1(Level1 level1,ModelMap model) {
		int subid= Integer.parseInt((model.get("subjectcode").toString()));
		examService.addQueslevel1(level1,subid);
		for(int i=0;;i++)
		return "addQuestion.jsp";
		
	}
	
	@RequestMapping(path="/level2.lti", method = RequestMethod.POST)
	public String addQuestionlevel2(Level2 level2,ModelMap model) {	
		int subid= Integer.parseInt((model.get("subjectcode").toString()));
		examService.addQueslevel2(level2,subid);
		for(int i=0;;i++)
		return "addQuestion.jsp";
		
	}
	
	@RequestMapping(path="/level3.lti", method = RequestMethod.POST)
	public String addQuestionlevel3(Level3 level3,ModelMap model) {				
		int subid= Integer.parseInt((model.get("subjectcode").toString()));
		examService.addQueslevel3(level3,subid);
		for(int i=0;;i++)
		return "addQuestion.jsp";
		
	}
//*************************************************************************************************	
	@RequestMapping(path="/adminSubjectView.lti")
	public String subjectSessionVariableview(ModelMap model,@RequestParam("link") String name) {
		
		model.put("adminsubjectcode",name);
		return "viewQuestionLevelChoice.jsp";
	}
	
	@RequestMapping(path="/adminLevelView.lti")
	public String levelSessionVariableview(ModelMap model,@RequestParam("setlevel") String level) {		
		model.put("adminlev",level);
		int subid= Integer.parseInt((model.get("adminsubjectcode").toString()));
		int lev= Integer.parseInt((model.get("adminlev").toString()));
		if(lev==1) {
			List<Level1> list=examService.fetchlevel1(subid);
			model.put("adminlevel",list);
			return "viewAdminQuestion.jsp";
		}
		if(lev==2) {
			List<Level2> list=examService.fetchlevel2(subid);
			model.put("adminlevel",list);
			return "viewAdminQuestion.jsp";
		}
		if(lev==3) {
			List<Level3> list=examService.fetchlevel3(subid);
			model.put("adminlevel",list);
			return "viewAdminQuestion.jsp";
		}
		return "";
		
	}
	
	@RequestMapping(path="/editDetailsAdmin.lti")
	public String editDetailsAdmin(ModelMap model,@RequestParam("viewQuestiontId") int qid) {
		model.put("editQuestionid",qid);
		int lev= Integer.parseInt((model.get("adminlev").toString()));
		if(lev==1) {
			Level1 list=examService.fetchlevel1question(qid);
			model.put("adminlevQuestion",list);
			return "editYourQuestion.jsp";
		}
		if(lev==2) {
			Level2 list=examService.fetchlevel2question(qid);
			model.put("adminlevQuestion",list);
			return "editYourQuestion.jsp";
		}
		if(lev==3) {
			Level3 list=examService.fetchlevel3question(qid);
			model.put("adminlevQuestion",list);
			return "editYourQuestion.jsp";
		}
		return "";
	}
	
	@RequestMapping(path="/addEditDetailsAdminLevel1.lti")
	public String addEditDetailsAdminlevel1(ModelMap model,Level1 level1) {
		int subid= Integer.parseInt((model.get("adminsubjectcode").toString()));
		Integer qid=(Integer) model.get("editQuestionid");
		examService.addEditDetailsAdminlevel1(level1,qid);
		return "redirect:adminDashboard.lti";
	}
	@RequestMapping(path="/addEditDetailsAdminLevel2.lti")
	public String addEditDetailsAdminlevel2(ModelMap model,Level2 level2) {
		int subid= Integer.parseInt((model.get("adminsubjectcode").toString()));
		Integer qid=(Integer) model.get("editQuestionid");
		examService.addEditDetailsAdminlevel2(level2,qid);
		return "redirect:adminDashboard.lti";
	}
	@RequestMapping(path="/addEditDetailsAdminLevel3.lti")
	public String addEditDetailsAdminlevel3(ModelMap model,Level3 level3) {
		int subid= Integer.parseInt((model.get("adminsubjectcode").toString()));
		Integer qid=(Integer) model.get("editQuestionid");
		examService.addEditDetailsAdminlevel3(level3,qid);
		return "redirect:adminDashboard.lti";
	}

}
