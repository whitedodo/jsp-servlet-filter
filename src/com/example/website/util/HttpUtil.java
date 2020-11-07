/*
 * 프로젝트명(Project Name): HttpUtil
 * 작성일자(Create Date): 2020-11-06
 * 작성(Author): Dodo (rabbit.white at daum dot net)
 * 파일명(Filename): HttpUtil.java
 * 비고(Description):
 * 
 */
package com.example.website.util;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HttpUtil {

	public static void forward(HttpServletRequest req,
			HttpServletResponse res, String path) {
		
		try {
			RequestDispatcher dispatcher = req.getRequestDispatcher(path);
			dispatcher.forward(req, res);
			
		}catch(Exception ex) {
			System.out.println("forward 오류 :" + ex );
		}
		
	}
	
}
