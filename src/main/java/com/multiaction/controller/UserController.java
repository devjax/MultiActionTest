package com.multiaction.controller;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//public class UserController {
//
//	@RequestMapping("/home")
//	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ModelAndView model = new ModelAndView("home");
//		model.addObject("message", "Home");
//		return model;
//	}
//
//	@RequestMapping("/add")
//	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ModelAndView model = new ModelAndView("user");
//		model.addObject("message", "Add");
//		return model;
//	}
//
//	@RequestMapping("/remove")
//	public ModelAndView remove(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ModelAndView model = new ModelAndView("user");
//		model.addObject("message", "Remove");
//		return model;
//	}
//
//}

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;


@Controller
public class UserController {

//	@RequestMapping("/user")
//	public ModelAndView user(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		View mv = (View) ApplicationContext.getBean()
//		return new ModelAndView(mv, null);
//	}
//
	@RequestMapping("/myView")
	public ModelAndView myView(HttpServletRequest request, HttpServletResponse response) throws Exception {

		View mv = (View) WebApplicationContextUtils.getWebApplicationContext(getServletContext()).getBean("myView");
		return new ModelAndView(mv, null);
	}
//
//	@RequestMapping("/remove")
//	public ModelAndView remove(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		
//		View mv = (View) getWebApplicationContext().getBean("myView");
//		return new ModelAndView(mv, null);
//	}
	
//	@RequestMapping("/myView")
//	public ModelAndView myView(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		ModelAndView model = new ModelAndView("MyView");
//		model.addObject("message", "Add");
//		return model;
//	}
}