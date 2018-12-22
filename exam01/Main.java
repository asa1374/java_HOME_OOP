package exam01;
import java.util.Scanner;
import exam01.*;
public class Main {
	public static void main(String[] args) {
		while(true) {
			System.out.println("[메뉴]\n"
					+ "0.종료 "
					+ "1.계산기 "
					+ "2.BMI "
					+ "3.달력만들기 "
					+ "4.성별계산기 "
					+ "5.등수계산 ");
			Scanner scanner = new Scanner(System.in);
			String num = scanner.next();
			switch(num) {
			case "0" : System.out.println("종료"); return;
			case "1" : 
				Calc calc = new Calc();
				calc.calc();
				break;
			case "2" : 
				Bmi bmi = new Bmi();
				bmi.bmi();
				break;
			case "3" : 
				Mycalender mycalender = new Mycalender();
				mycalender.mycal();
				break;
			case "4" :
				Ssn ssn = new Ssn();
				ssn.ssn();
				break;
			case "5" : 
				Grade grade = new Grade();
				grade.grade();
				break;
			}
		}
	}

}
