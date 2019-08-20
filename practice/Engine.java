package practice;
import java.util.Scanner;
import practice.Student;
public class Engine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		int flag = 0;
		
		while(true) {
			System.out.println("메뉴 : 0.종료 1.AC 2.BMI 3.HowMuch 4.Join 5.LeapYear 6.MonthEndDay 7.PassOrFail 8.Ranking 9.ReportCasd 10.ScoreCalc 11.Tax 12.TimeCalc");
			flag = scanner.nextInt();
			
			switch(flag) {
			case 0 : System.out.println("종료"); return;
			case 4 :
				System.out.println("join");
				String[] input = new String[8];
				String[] result = new String[8];
				
				System.out.println("=== 회원 가입 ===");
				for(int i=0;i<8;i++) {
					System.out.printf("%s : ", student.getinformation(i));
					input[i] = scanner.next();
				}
				result = student.join(input);
				System.out.println("=== 회원 정보 ===");
				for(int i=0;i<8;i++) {
					System.out.println(result[i]);
				}
				break;
			case 5 :
				String result1 = "";
				
				System.out.println("LeapYear");
				
				System.out.println("연도를 입력");
				result1 = student.getLeapYear(scanner.nextInt());
				System.out.println(result1);
				break;
			}
			
		}
	}
}
