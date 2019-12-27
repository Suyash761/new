package com.lti.controller;

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
@SessionAttributes({"subjectcode","lev"})
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
}
