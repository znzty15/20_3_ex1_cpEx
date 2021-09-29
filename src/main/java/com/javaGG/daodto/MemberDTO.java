package com.javaGG.daodto;


public class MemberDTO {
	
	private String name;
	private String id;
	private String pw;
	private String ph1;
	private String ph2;
	private String ph3;
	private String gender;

	public MemberDTO(String name, String id, String pw, String ph1, String ph2, String ph3, String gender) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.ph1 = ph1;
		this.ph2 = ph2;
		this.ph3 = ph3;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPh1() {
		return ph1;
	}

	public void setPh1(String ph1) {
		this.ph1 = ph1;
	}

	public String getPh2() {
		return ph2;
	}

	public void setPh2(String ph2) {
		this.ph2 = ph2;
	}

	public String getPh3() {
		return ph3;
	}

	public void setPh3(String ph3) {
		this.ph3 = ph3;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
