package oop_bank1;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		Member member = null;
		Account account = null;
		while(true) {
			String select = JOptionPane.showInputDialog("0.종료\n1.회원가입\n2.계좌만들기\n3.계좌확인");
			switch(select) {
			case "0" : 
				JOptionPane.showMessageDialog(null, "종료합니다.");
				return;
			case "1" : 
				String id = JOptionPane.showInputDialog("id를 입력해주세요");
				String pass = JOptionPane.showInputDialog("비밀번호를 입력해주세요");
				String name = JOptionPane.showInputDialog("이름을 입력해주세요");
				String ssn = JOptionPane.showInputDialog("주민번호를 입력해주세요");
				member = new Member(id, pass, name, ssn);
				JOptionPane.showMessageDialog(null,member.info());
				break;
			case "2" :
				account = new Account(0);
				break;
			case "3" :
				JOptionPane.showMessageDialog(null, account.open(member.name));
				break;
			}
		}
	}
}
