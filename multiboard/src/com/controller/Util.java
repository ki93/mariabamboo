package com.controller;

import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class Util {
	public static void saveFile(MultipartFile mf, String dir) {
//		File f = new File(Util.class.getProtectionDomain().getCodeSource().getLocation().getPath());
		
		
//		System.out.println(f);
		
		//C:\study_multicampus\spring\source\test\bin
//		C:\spring\MultiBamboo\multiboard\web\img
		byte [] data;
		String imgname=mf.getOriginalFilename();
		
		try {
			data=mf.getBytes();
			System.out.println(dir);
			FileOutputStream fo = new FileOutputStream(dir+imgname);
			fo.write(data);
			fo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
