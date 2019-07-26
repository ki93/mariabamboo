package com.app;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Biz;
import com.vo.Restaurant;
import com.vo.User;

public class SelectTest {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
//		Biz<Integer, Restaurant> biz = (Biz<Integer, Restaurant>) factory.getBean("rtbiz");
		Biz<String, User> biz = (Biz<String, User>) factory.getBean("ubiz");
		
		try {
			ArrayList<User> ulist = biz.get();
			
			for(User u : ulist) {
				System.out.println(u);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
