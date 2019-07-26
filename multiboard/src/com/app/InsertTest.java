package com.app;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Biz;
import com.vo.User;

public class InsertTest {

	public static void main(String[] args) {		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
	Biz<String, User> biz = (Biz<String, User>) factory.getBean("ubiz");
	
	try {
		biz.register(new User("ABC2", "PWD02", "Namememe", "70.0.0.225"));
//		
//		for(User u : ulist) {
//			System.out.println(u);
//		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
