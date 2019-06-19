package com.gkk.ssm.po;
/**
* @title :instruction
* @author : GUO Kun-kun
* @createDate :2019年6月13日 上午9:15:13
*/
public class Instrument {

	private String username;
	private String passwd;
	private InformationForUser informationForUser;
	
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public InformationForUser getInformationForUser() {
		return informationForUser;
	}
	public void setInformationForUser(InformationForUser informationForUser) {
		this.informationForUser = informationForUser;
	}
	
}
