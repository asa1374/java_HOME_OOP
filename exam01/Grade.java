package exam01;
import java.util.Scanner;
public class Grade {
	public void grade() {
		System.out.println("몇명의 학생을 입력하시나요");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String[] a = new String[num];
		int[] b = new int[num];
		System.out.println(num+ "명의 이름과 점수를 입력");
		for(int i = 0;i<num;i++) {
			a[i] = scanner.next();
			b[i] = scanner.nextInt();
			}
		for(int i = 0;i<num-1;i++) {
			for(int j =0;j<num;j++) {
				if(b[i]<b[j]) {
					int t = b[j];
					b[j] = b[i];
					b[i] = t;
					
					String n = a[j];
					a[j]=a[i];
					a[i]=n;
				}
			}
		}
		for(int i=0;i<num;i++) {
			System.out.println(a[i] +"\n"+b[i]);
		}
		
	}
}
