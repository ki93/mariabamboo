package com.controller;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.DependenciesBiz;
import com.vo.Bfile;
import com.vo.Board;
import com.vo.Reply;


@Controller
public class ReplyController {
	
	@Resource(name="rbiz")
	DependenciesBiz<Integer, Reply> rbiz;
	
	@RequestMapping("/breplywriteimpl.go")
	public String brepwirteimpl(ModelAndView mv, Reply reply, Integer id) {
		System.out.println(reply);
		System.out.println("id: "+id);
		reply.setAt_id(id);
		try {
			rbiz.register(reply);
			System.out.println(reply);
			mv.addObject("reply", reply);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		return "redirect:bboarddetail.go?id="+id;
		//���� ����
	}
	
	@RequestMapping("/breplylist.go")
	public ModelAndView breplist(Integer id) {
		//�����Ϳ� ȭ��(Model And View)
		
		ModelAndView mv = new ModelAndView();
		ArrayList<Reply> list= null;
		
		try {
			//���⼭ at_id�� ���� �ֵ鸸 ����Ʈ����� ��. 
			list = rbiz.getByOwnerId(id, null);	
			System.out.println("king of my heart ");
			for(Reply rep: list) {
				System.out.println(rep);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		mv.addObject("rlist", list);
		mv.addObject("center","b_board/replylist");
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/breplydelete.go")
	public String brepdel(ModelAndView mv, Integer id) {
		Reply rep=null;
		try {
			rep=rbiz.get(id);
			rbiz.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:bboarddetail.go?id="+rep.getAt_id();
	}
	
	
	//얘를 ajax로 하기 
	@RequestMapping("/breplyupdate.go")
	public ModelAndView brepupdpate(
			ModelAndView mv, Integer id) {
		Reply rep = null;
		try {
			System.out.println(id);
			rep = rbiz.get(id);
			System.out.println(rep);
			mv.addObject("rep", rep);		
			mv.addObject("content", "replyupdate");
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.addObject("center","b_board/replyupdate");
		mv.setViewName("main");
		return mv;
	}
	
	@RequestMapping("/breplyupdateimpl.go")
	public String brepupdpateimpl(ModelAndView mv, 
			Reply rep , Integer r_id, Integer at_id) {		
		try {
			System.out.println(rep);
			rbiz.modify(rep);
			
			mv.addObject("reply", rep);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:bboarddetail.go?id="+at_id;
	}
	
}
