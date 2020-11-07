/*
 * 프로젝트명(Project Name): MemberFilter
 * 작성일자(Create Date): 2020-11-06
 * 작성(Author): Dodo (rabbit.white at daum dot net)
 * 파일명(Filename): Controller.java
 * 비고(Description):
 * 1. MemberFilter
 * 
 */
package com.example.website.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {

	public void execute(HttpServletRequest req, HttpServletResponse res) throws
		ServletException, IOException;
	
}
