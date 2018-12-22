package oop_car;

import javax.swing.JOptionPane;

public class Controller {
	public static void main(String[] args) {
		CarBean bean = null;
		CarService carService = new CarServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n1. CAR정보입력\n2. CAR정보보기\n3.")) {
			case"0" : 
				JOptionPane.showMessageDialog(null, "종료합니다.");
				return;
			case "1" :
				bean = carService.info(JOptionPane.showInputDialog("COLOR :"),
						JOptionPane.showInputDialog("GearType :"),
						Integer.parseInt(JOptionPane.showInputDialog("Door :")));
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, bean.toString());
				break;
			}
		}
	}
}
