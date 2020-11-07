/*
 * 프로젝트명(Project Name): Member - Controller
 * 작성일자(Create Date): 2020-11-06
 * 작성(Author): Dodo (rabbit.white at daum dot net)
 * 파일명(Filename): LogoutController.java
 * 비고(Description):
 * 
 */
package com.example.website.controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.website.controller.Controller;
import com.example.website.util.HttpUtil;

public class LogoutController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {

		
		String contextPath = req.getContextPath();
		HttpSession session = req.getSession();
		 
		if ( session != null && 
			 session.getAttribute("login") != null) {
			 
			 session.setMaxInactiveInterval(62800);
			 session.invalidate();
			 
		}
		 
		res.sendRedirect( contextPath + "/");
		
	}

}
