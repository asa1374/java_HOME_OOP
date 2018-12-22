package oop_bank2;

public class AccountBean {
	public final static String BANK_NAME ="국민은행";   //상수
	private String accountNum,today;
	private int money;
	public void setAccountNum(String account) {
		this.accountNum = account;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public String getToday() {
		return today;
	}
	public void money(int money) {
		this.money = money;
	}
	public int money() {
		return money;
	}
	@Override
	public String toString() {
		return String.format("", "");
	}
}
