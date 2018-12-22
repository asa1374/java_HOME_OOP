package oop_bank2;
import javax.swing.JOptionPane;
public class Controller {
	public static void main(String[] args) {
		MemberBean member = null;
		MemberService service = new MemberServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.회원가입\n2.회원정보\n3.계좌개설\n4.계좌보기\n5.입금하기\n"
					+ "6.출금하기\n7.잔액확인\n8.비번변경\n")) {
			case "0" : 
				JOptionPane.showMessageDialog(null, String.format("종료..."));
				return;
			case "1" :
				member = service.join(JOptionPane.showInputDialog("ID :"), JOptionPane.showInputDialog("PASS :"),
						JOptionPane.showInputDialog("NAME :"), JOptionPane.showInputDialog("SSN :"));
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, member.toString());
				break;
			}
		}
	}
}