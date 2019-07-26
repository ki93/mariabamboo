package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Biz;
import com.vo.User;


@Controller
public class SessionController {
	
	@Resource(name="ubiz")
	Biz<String, User> userv;
	
//	@RequestMapping("/bsidebar1.go")
//	public string bsidebar() {
//		//�����Ϳ� ȭ��(Model And View)
//		Map<String, Object> map = new HashMap<String, Object>();
//		
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("entire","bsidebar");
//		mv.setViewName("home");
//		ModelAndView()
//		
//		map.put("product", new )
//		return mv;
//	}

	@RequestMapping("/login.go")
	public ModelAndView login(ModelAndView mv,
			HttpServletRequest request,
			HttpSession session) {
		String id=request.getParameter("id");
		String pwd = request.getParameter("pwd");
		System.out.println("id:"+id+",pwd:"+pwd);
		User user = new User();
		try {
			user=userv.get(id);
			System.out.println(user);
			if(user.getPwd().equals(pwd)) {
				session.setAttribute("loginuser", user);
				mv.setViewName("home");
			}else {
				mv.setViewName("session/loginfail");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}		
		
		return mv;
	}	
	@RequestMapping("/logout.go")
	public ModelAndView logout(ModelAndView mv,
			HttpSession session) {
		if(session != null) {
			session.invalidate();
		}
		mv.setViewName("sign");
		return mv;
	}
	
	
	
}
