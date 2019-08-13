package step1;
import java.util.Scanner;

public class Print5Times {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("진행 1, 스톱 0");
			int flag = scan.nextInt();
			switch(flag) {
			case 0 : System.out.println("시스템 종료"); return;
			case 1 : System.out.println("시스템 진행"); break;
			}
			System.out.println("안녕");
		}
	
		//	System.out.println("While에서 빠져나옴.");	// 수행 불가능 
	}
}
