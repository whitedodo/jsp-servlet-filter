/*
 * 프로젝트명(Project Name): MemberVO
 * 작성일자(Create Date): 2020-11-06
 * 작성(Author): Dodo (rabbit.white at daum dot net)
 * 파일명(Filename): MemberVO.java
 * 비고(Description):
 * 
 */
package com.example.website.vo;

import java.sql.Timestamp;

public class MemberVO {

	private int id;
	private String email;
	private String passwd;
	private int enabled;
	private Timestamp regidate;
	private String ip;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public Timestamp getRegidate() {
		return regidate;
	}
	public void setRegidate(Timestamp regidate) {
		this.regidate = regidate;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	
}
