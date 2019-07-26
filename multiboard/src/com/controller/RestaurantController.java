package com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.frame.Biz;
import com.frame.RtDependenciesBiz;
import com.vo.Category;
import com.vo.Restaurant;


@Controller
public class RestaurantController {
	@Resource(name="rtbiz")
	Biz<Integer,Restaurant> rtbiz;
	@Resource(name="catebiz")
	RtDependenciesBiz<Integer,Category> catebiz;
	
	@RequestMapping("/restaurantMap.go")
	public ModelAndView rtmap() {
		//�뜝�럥혵�먯삕혬�뜝�럡�댉�뜝�룞�삕 �뜝�럩혛혮嶺��뜝(Model And View)
		ModelAndView mv = new ModelAndView();
		try {
			rtbiz.get();			
		} catch (Exception e) {
			e.printStackTrace();
		}
		mv.addObject("center","rtmap");
		mv.addObject("entire","b_board/bsidebar");
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/makeMarker.go")
	public ModelAndView mmaker() {
		//�뜝�럥혵�먯삕혬�뜝�럡�댉�뜝�룞�삕 �뜝�럩혛혮嶺��뜝(Model And View)
		ModelAndView mv = new ModelAndView();
		mv.addObject("center","makemarker");
		mv.addObject("entire","b_board/bsidebar");
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/makeMarkerimpl.go")
	public String boardwirteimpl(ModelAndView mv,
			Restaurant restaurant, Category category, Integer cate_num) {
			System.out.println(cate_num);
			System.out.println(category);
			System.out.println(restaurant);
		try {
			catebiz.registerCheckCateNum(category);
			rtbiz.register(restaurant);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
//		
//		System.out.println(board);
//		System.out.println(bf);
		return "redirect:restaurantMap.go";
	}
	
	
	@RequestMapping("/restaurantReply.go")
	public ModelAndView rtreply() {
		//�뜝�럥혵�먯삕혬�뜝�럡�댉�뜝�룞�삕 �뜝�럩혛혮嶺��뜝(Model And View)
		ModelAndView mv = new ModelAndView();
		mv.addObject("center","rtreply");
		mv.addObject("entire","b_board/bsidebar");
		mv.setViewName("home");
		return mv;
	}
}
