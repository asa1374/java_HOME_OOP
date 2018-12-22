package exam01;
import java.util.Scanner;
public class Bmi {
	public void bmi() {
		System.out.println("몸무게 :");
		Scanner scanner = new Scanner(System.in);
		double w = scanner.nextDouble();
		System.out.println("키 :");
		double t = scanner.nextDouble();
		
		double bmi = w/(t*t)*10000;
		String res = "";
		if(bmi>=40) {
			res = "고도비만";
		}else if(bmi>=35) {
			res= "중등도비만";
		}else if(bmi>=30) {
			res = "경도비만";
		}else if(bmi>=25) {
			res = "과체중";
		}else if(bmi>=18.5) {
			res = "정상";
		}else {
			res = "저체중";
		}
		System.out.println(bmi + res);
	}
}
