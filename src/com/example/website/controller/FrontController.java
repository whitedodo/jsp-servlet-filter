/*
 * 프로젝트명(Project Name): MemberFilter
 * 작성일자(Create Date): 2020-11-06
 * 작성(Author): Dodo (rabbit.white at daum dot net)
 * 파일명(Filename): FrontController.java
 * 비고(Description):
 * 1. Annotation 방식 적용
 */
package com.example.website.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.website.controller.member.LoginController;
import com.example.website.controller.member.LogoutController;
import com.example.website.controller.member.ProcessController;


@WebServlet("*.do")
public class FrontController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private String charset = null;
	private HashMap<String, Controller> list = null;
	
	@Override
	public void init(ServletConfig sc) throws ServletException {
		
		charset = "UTF-8";
		
		list = new HashMap<String, Controller>();
		
		list.put("/member/login.do", new com.example.website.controller.member.LoginController() );
		list.put("/member/process.do", new com.example.website.controller.member.ProcessController() );
		list.put("/member/logout.do", new com.example.website.controller.member.LogoutController() );
		list.put("/board/list.do", new com.example.website.controller.board.ListController() );
		
		
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		service(req, res, "GET");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		service(req, res, "POST");
	}
	
	protected void service(HttpServletRequest req, 
						HttpServletResponse res, 
						String flag) throws ServletException, IOException {
		
		req.setCharacterEncoding(charset);
		
		String url = req.getRequestURI();
		String contextPath = req.getContextPath();
		String path = url.substring(contextPath.length());
		
		Controller subController = list.get(path);
		subController.execute(req, res);
		
	}

}
