package com.controller;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.vo.User;

@Controller
public class MainController {
	
	@RequestMapping("/home.go")
	public ModelAndView main() {
		//데이터와 화면(Model And View)
		ModelAndView mv = new ModelAndView();
		mv.addObject("content","content");
		mv.addObject("centerpic","centerpic");
		mv.addObject("center","center");
		mv.addObject("sidebar","sidebar");
		mv.addObject("entire","entire");
		mv.setViewName("home");
		return mv;
	}
  
	@RequestMapping("/about.go")
	public ModelAndView about() {
		//데이터와 화면(Model And View)
		ModelAndView mv = new ModelAndView();
		mv.addObject("entire","aboutpage/aboutentire");
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/mpage.go")
	public ModelAndView mpage() {
		//데이터와 화면(Model And View)
		ModelAndView mv = new ModelAndView();
		mv.addObject("entire","mypage/mysidebar");
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("/sign.go")
	public ModelAndView sign(HttpSession session) {
		//데이터와 화면(Model And View)
		ModelAndView mv = new ModelAndView();
		User user = (User)session.getAttribute("loginuser");
		
		if(user != null) {
			mv.setViewName("home");
			return mv;
		}
		mv.setViewName("sign");
		return mv;
	}
}
