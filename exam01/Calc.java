package exam01;
import java.util.Scanner;
public class Calc {
	public void calc() {
		System.out.println("계산식을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		String op = scanner.next();
		int num2 = scanner.nextInt();
		int add = 0;
		
		switch(op) {
		case "+" : add = num1+num2; break;
		case "-" : add= num1 -num2; break;
		case "*" : add = num1 * num2; break;
		case "/" : add = num1 /num2; break;
		case "%" : add = num1 % num2; break;
		}
		System.out.println(num1 + op + num2 +"=" + add);
		
	}
}
