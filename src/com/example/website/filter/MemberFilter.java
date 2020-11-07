/*
 * 프로젝트명(Project Name): Member Filter
 * 작성일자(Create Date): 2020-11-06
 * 작성(Author): Dodo (rabbit.white at daum dot net)
 * 파일명(Filename): MemberFilter.java
 * 비고(Description):
 * 
 */
package com.example.website.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("*")
public class MemberFilter implements Filter {

	public void init(FilterConfig config) throws ServletException {	}
	
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) 
			throws IOException, ServletException {
	
		HttpServletRequest hReq = (HttpServletRequest)req;
		HttpServletResponse hRes = (HttpServletResponse)res;
		
		HttpSession session = hReq.getSession();
		
		String url = hReq.getRequestURI();
		String contextPath = hReq.getContextPath();
		String path = url.substring(contextPath.length() );
		
		if ( path.indexOf("login.do") != -1 ) {
			chain.doFilter(req, res);
		}else if ( path.indexOf("logout.do") != -1 ) {
			chain.doFilter(req, res);
		}else if ( path.indexOf("process.do") != -1 ) {
			chain.doFilter(req, res);
		}else {
			
			if ( session != null && session.getAttribute("login") != null ) {
				chain.doFilter(req, res);
			}
			else {
				hRes.sendRedirect( contextPath + "/member/login.do");
			}
			
		}
				
	}

	public void destroy() {	}
	
}
