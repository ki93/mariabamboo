package com.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Biz;
import com.frame.DependenciesBiz;
import com.vo.Board;
import com.vo.User;

@Controller
public class UserController {

	@Resource(name="ubiz")
	Biz<String, User> userv;
	@Resource(name="bbiz")
	DependenciesBiz<Integer, Board> bbiz;
  
	@RequestMapping("/registerpage.go")
	public ModelAndView userregimpl(ModelAndView mv, User user) {
		//mv.addObject("navi", Navi.login);
		mv.setViewName("user/registerpage");
		return mv;	
	}	
	
	@RequestMapping("/register.go")
	public ModelAndView register(ModelAndView mv,
			HttpServletRequest request) {
		// �����Ϳ� ȭ��(Model And View)
	   //mv.addObject("navi", Navi.useradd);
		String id=request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String ip = request.getHeader("X-FORWARDED-FOR");
		
        if (ip == null)
            ip = request.getRemoteAddr();
        
		User user = new User(id, pwd, name, ip);
		
		// size�� Ŭ�������� �־��ִ� ��=�������ش�.
		try {
			userv.register(user);
			mv.setViewName("sign");
		} catch (Exception e) {
			mv.addObject("regiter");
			e.printStackTrace();
		}
		mv.setViewName("main");
		return mv;
	}
	
	
	@RequestMapping("/mypage.go")
	public ModelAndView usermypage(ModelAndView mv, HttpSession session) {
	//	mv.addObject("navi", Navi.useradd);
		User user = (User) session.getAttribute("loginuser");
		
		mv.addObject("loginuser", user);
		mv.addObject("entire","mypage/mysidebar");
		mv.addObject("center", "myinfo");
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/updateuser.go")
	public ModelAndView updateuser(ModelAndView mv, HttpServletRequest request, HttpSession session) {
		User currentUser = (User) session.getAttribute("loginuser");
		
		String newPwd = request.getParameter("newPwd");
		String newPwdCheck = request.getParameter("newPwdCheck");
		String newUname = request.getParameter("newUsername");
		
		System.out.println(currentUser);
		
		if(newPwd.equals(newPwdCheck)) {
			try {
				User updatedUser = new User(currentUser.getU_id(), newPwd, newUname, currentUser.getU_ip());
				userv.modify(updatedUser);
				session.setAttribute("loginuser", updatedUser);
			} catch (Exception e) {
				e.printStackTrace();
			}
			mv.setViewName("mypage/updateUserSuccess");
		}
		else {
			mv.setViewName("mypage/updateUserFail");
		}
		return mv;
	}
	
	@RequestMapping(value="/unamecheck.go", method=RequestMethod.POST)
	public @ResponseBody String unamecheck(@RequestParam("newUsername") String newUsername) {
		boolean isDuplicated = false;
		try {
			ArrayList<User> list = userv.get();
			
			for(User user : list) {
				if(user.getU_name().equals(newUsername)) {
					isDuplicated = true;
					break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String result = isDuplicated ? "no" : "ok"; 
		
		return result;
	}

	@RequestMapping(value="/uidcheck.go", method=RequestMethod.POST)
	public @ResponseBody String uidcheck(@RequestParam("uid") String uid) {
		boolean isDuplicated = false;
		try {
			ArrayList<User> list = userv.get();
			
			for(User user : list) {
				if(user.getU_id().equals(uid)) {
					isDuplicated = true;
					break;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String result = isDuplicated ? "ok" : "no"; 
		
		return result;
	}
	
	@RequestMapping("/myarticles.go")
	public ModelAndView myarticles(ModelAndView mv, HttpServletRequest request, HttpSession session) {
		User user = (User) session.getAttribute("loginuser");
		
		try {
			ArrayList<Board> list = bbiz.getByOwnerId(null, user.getU_id());
			mv.addObject("boardlist", list);
			mv.addObject("entire","mypage/mysidebar");
			mv.addObject("center", "myarticles");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		mv.setViewName("home");
		return mv;
	}
}
