package study03;
import java.util.Scanner;
import study03.Student;
public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		
		int flag = 0;
		String result = "";
		String[] recordResult = new String[3];
		
		while(true) {
			System.out.println("메뉴 : 0.종료 1.AC 2.BMI 3.HowMuch 4.Join 5.LeapYear 6.MonthEndDay 7.PassOrFail 8.Ranking 9.ReportCasd 10.ScoreCalc 11.Tax 12.TimeCalc");
			flag = scanner.nextInt();
			
			switch(flag) {
			case 0 : System.out.println("종료"); return;
			case 1 : System.out.println("AC");
				
				break;
			case 2 : 
				System.out.println("BMI"); 
				
				System.out.println("이름 입력");
				String name = scanner.next();
				System.out.println("몸무게 입력");
				double weight = scanner.nextDouble();
				System.out.println("키 입력");
				double height = scanner.nextDouble();
				
				result = student.getBmi(name, weight, height);
				System.out.println(result);
				break;
				
			case 3 : 
				System.out.println("HowMuch"); 
				student.howMuch();
				break;
				
			case 4 : 
				System.out.println("ReportCard"); 
				student.getReportCard();
				break;
				
			case 8 : 
				System.out.println("Ranking"); 
				
				double[] record = new double[3];

				for(int i=0;i<3; i++) {
					System.out.println("선수 기록 입력");
					record[i] = scanner.nextDouble();
				}
				
				recordResult = student.getRank(record);
				for(int i=0;i<3; i++) {
					System.out.println(recordResult[i]);
				}
				break;
			
			
			}
		}
	}
}
