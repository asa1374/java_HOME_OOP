package oop_bank1;

public class Member {
	String id,pass,name,ssn;
	Member(String id,String pass,String name, String ssn){
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.ssn = ssn;
	}
	public String info() {
		return String.format("ID : %s\n"
				+ "비밀번호 : %s\n"
				+ "이름 : %s\n"
				+ "주민번호 : %s\n",id,pass,name,ssn);
	}
}
