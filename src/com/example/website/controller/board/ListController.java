/*
 * 프로젝트명(Project Name): List - Controller
 * 작성일자(Create Date): 2020-11-06
 * 작성(Author): Dodo (rabbit.white at daum dot net)
 * 파일명(Filename): ListController.java
 * 비고(Description):
 * 
 */
package com.example.website.controller.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.website.controller.Controller;
import com.example.website.dao.AddressDAO;
import com.example.website.dao.AddressDAOImpl;
import com.example.website.util.HttpUtil;
import com.example.website.vo.AddressDTO;

public class ListController implements Controller {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		AddressDAO dao = new AddressDAOImpl();
		
		AddressDTO dto = dao.selectAddress(1);
		System.out.println(dto.getName());
		
		HttpUtil.forward(req, res, "/WEB-INF/views/board/list.jsp");

	}

}
