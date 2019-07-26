package com.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.DependenciesBiz;
import com.vo.Bfile;
import com.vo.Board;
import com.vo.Reply;
import com.vo.User;


@Controller
public class BoardController {

	@Resource(name="bbiz")
	DependenciesBiz<Integer,Board> bbiz;
	@Resource(name="bfbiz")
	DependenciesBiz<Integer,Bfile> bfbiz;
	@Resource(name="rbiz")
	DependenciesBiz<Integer,Reply> rbiz;
	@Autowired
	ServletContext servletContext;


	@RequestMapping("/bhome.go")
	public ModelAndView main() {
		//�뜝�럥혵�먯삕혬�뜝�럡�댉�뜝�룞�삕 �뜝�럩혛혮嶺��뜝(Model And View)
		ModelAndView mv = new ModelAndView();
		mv.addObject("center","centerbamboo");
		mv.addObject("entire","b_board/bsidebar");
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/bboardlist.go")
	public ModelAndView bboardlist() {
		//혥怨쀂앸똾혙怨쀂쇑� 혲혬筌�(Model And View)
		
		ModelAndView mv = new ModelAndView();
		ArrayList<Board> list= null;
		
		try {
			list=bbiz.get();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		mv.addObject("navi",Navi.productlist);
		mv.addObject("blist",list);
		mv.addObject("content","list");
		mv.addObject("center","centerbamboo");
		mv.addObject("entire","b_board/bsidebar");
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/bboardwrite.go")
	public ModelAndView boardwirte(ModelAndView mv,
			Board bd) {
		//혥怨쀂앸똾혙怨쀂쇑� 혲혬筌�(Model And View)
//		mv.addObject("board", bd);
		mv.addObject("center","write");
		mv.addObject("entire","b_board/bsidebar");
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/bboardwriteimpl.go")
	public String boardwirteimpl(ModelAndView mv,
			Board board, Bfile bf, HttpSession session) {
		String imgname=bf.getMf().getOriginalFilename();
		bf.setF_name(imgname);		
		try {
			User loginUser = (User)session.getAttribute("loginuser");
			board.setU_id(loginUser.getU_id());
			
			bbiz.register(board);
			System.out.println(board);
			bf.setAt_id(board.getAt_id());
			bfbiz.register(bf);
			
			// File save
			String dir = servletContext.getRealPath("/img/");
			Util.saveFile(bf.getMf(), dir);
			
			
			mv.addObject("board", board);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
//		
//		System.out.println(board);
//		System.out.println(bf);
		return "redirect:bboardlist.go";
	}

	
	@RequestMapping("/bboarddetail.go")
	public ModelAndView boarddetail(ModelAndView mv, Integer id) {
		Board bd=null;
		Bfile bf=null;
		ArrayList<Reply> rlist= null;
		System.out.println(id);
		try {
			bd = bbiz.get(id);
			ArrayList<Bfile> templist = bfbiz.getByOwnerId(id, null);
			if(templist.size() != 0) 
				bf = templist.get(0);
			
			rlist = rbiz.getByOwnerId(id, null);
			for(Reply rep: rlist) {
				System.out.println(rep);
			}
			
			System.out.println(bd);
			System.out.println(bf);
			mv.addObject("bboarddetail", bd);
			mv.addObject("bf",bf);
			mv.addObject("rlist",rlist);
			mv.addObject("center","detail");
			mv.addObject("entire","b_board/bsidebar");
			mv.setViewName("home");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mv;
	}
	
	@RequestMapping("/bboarddelete.go")
	public String boarddel(ModelAndView mv, Integer id) {
		try {
			bbiz.remove(id);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		try {
			bfbiz.removeByOwnerId(id, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			rbiz.removeByOwnerId(id, null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:bboardlist.go";
	}
	

	   @RequestMapping("/bboardupdate.go")
	   public ModelAndView boardupdpate(
	         ModelAndView mv, Integer id) {
	      Board brd = null;
	      try {
	         brd = bbiz.get(id);
	         mv.addObject("boardupdate", brd);      
	         mv.addObject("center", "update");
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      
	      
	      mv.addObject("entire","b_board/bsidebar");
	      mv.setViewName("home");
	      return mv;
	   }
	   
//	   mv.addObject("center","detail");
//		mv.addObject("entire","b_board/bsidebar");
//		mv.setViewName("home");
	@RequestMapping("/bboardupdateimpl.go")
	public String boardupdpateimpl(ModelAndView mv, Board board, Bfile bf, HttpServletRequest request) {
		String imgname=bf.getMf().getOriginalFilename();
		System.out.println(imgname);
		bf.setF_name(imgname);
		
		try {
			System.out.println(board);
			bbiz.modify(board);
			bf.setAt_id(board.getAt_id());
			System.out.println(bf);
			bfbiz.modify(bf);
			
			// file upload
			String dir = servletContext.getRealPath("web/img/");
			Util.saveFile(bf.getMf(), dir);
			
			mv.addObject("board", board);
			mv.addObject("bf", bf);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:bboarddetail.go?id="+board.getAt_id();
	}
	
}
