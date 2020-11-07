/*
 * 프로젝트명(Project Name): Login - Controller
 * 작성일자(Create Date): 2020-11-06
 * 작성(Author): Dodo (rabbit.white at daum dot net)
 * 파일명(Filename): LoginController.java
 * 비고(Description):
 * 
 */
package com.example.website.controller.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.website.controller.Controller;
import com.example.website.util.HttpUtil;

public class LoginController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {

		
		HttpUtil.forward(req, res, "/WEB-INF/views/member/login.jsp");
		
	}

}
