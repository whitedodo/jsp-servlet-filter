/*
 * 프로젝트명(Project Name): Process - Controller
 * 작성일자(Create Date): 2020-11-06
 * 작성(Author): Dodo (rabbit.white at daum dot net)
 * 파일명(Filename): ProcessController.java
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
import com.example.website.vo.MemberVO;

public class ProcessController implements Controller {

	private String authEmail = "root@localhost.com";
	private String authPasswd = "123456";


	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {

		String contextPath = req.getContextPath();
		MemberVO vo = new MemberVO();
		
		HttpSession session = req.getSession();
		
		vo.setEmail(req.getParameter("email"));
		vo.setPasswd(req.getParameter("passwd"));
		
		if ( vo.getEmail().equals(authEmail) == true && 
				vo.getPasswd().equals(authPasswd) == true ) {
			
			session.setAttribute("login", vo);
		
		}
		
		res.sendRedirect(contextPath + "/");
		
		
	}

}
