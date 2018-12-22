package oop_card;

import javax.swing.JOptionPane;
public class Controller {
	public static void main(String[] args) {
		CardBean bean = null;
		CardService cardService = new CardServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1.카드 입력\n2.카드 보기")) {
			case "0" :
				JOptionPane.showMessageDialog(null, "종료합니다.");
				return;
			case "1" :
				bean = cardService.info(JOptionPane.showInputDialog("Kind : "), Integer.parseInt(JOptionPane.showInputDialog("Number : ")));
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, bean.toString());
				break;
			}
		}
	}
}
