package study04;
import java.util.Scanner;
import study04.Student;
public class Engine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		String result ="";
		while(true) {
			System.out.println("0.종료 1.BMI 2.이해못할문제");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료"); return;
			case 1 : System.out.println("BMI");
			
			System.out.println("BMI : 이름, 키, 몸무게 입력");
			String name = scanner.next();
			double weight = scanner.nextDouble();
			double height = scanner.nextDouble();
			
			result = student.getBmi(name, weight, height);
			System.out.println(result);
			break;
			
			case 2 : // 이름, 주소, 나이, 은행잔고, 신용도
					 // 결과가 뭘 넣든간에 1억 대출
			name = scanner.next();
			String addr = scanner.next();
			int age = scanner.nextInt();
			int money = scanner.nextInt();
			String shin = scanner.next();
			
			result = student.daechul(name, addr, age, money, shin);	
			System.out.println(result);
			break;
			
			}
		}
	}
}
