package oop_bank1;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Random;

public class Account {
	final static String BANK_NAME = "국민은행";
	String account,day;
	int money;
	Account(int money){
		this.account = this.accountNum();
		this.money = money;
		this.day = this.today();
	}
	public String today() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today = "";
		today = sdf.format(date);
		return today;
	}
	public String accountNum() {
		Random random = new Random();
		return random.nextInt(8999)+1001+"-"+(random.nextInt(8999)+1001);
	}
	
	public String open(String name) {
		return String.format("%s님의 정보\n%s\n계좌번호 :%s\n잔액 :%s\n날짜는%s", name,BANK_NAME,account,money,day);
	}
}
