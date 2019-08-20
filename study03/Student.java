package study03;
import java.util.Scanner;

public class Student {
//	1.AC 2.BMI 3.HowMuch 4.Join 5.LeapYear 6.MonthEndDay 7.PassOrFail 8.Ranking 9.ReportCasd 10.ScoreCalc 11.Tax 12.TimeCalc
	Scanner scanner = new Scanner(System.in);
	public String getBmi(String name, double weight, double height) {
		
		String eval = "";
		height = height / 100;
		double bmi = weight / (height * height);
		
		if( bmi >= 30.0 ) {
			eval = "고도비만";
		}else if( bmi >= 25.0 ) {
			eval = "비만";
		}else if( bmi >= 23.0 ) {
			eval = "과체중";
		}else if( bmi >= 18.5) {
			eval = "정상";
		}else {
			eval = "저체중";
		}
		return String.format("%s님은 %s 입니다 ", name, eval);
	}
	
	public String[] getRank( double[] record ) {
		String[] string = { "A", "B", "C"};
		int[] num = { 1, 2, 3 };
		double recodTemp = 0.0;
		String stringTemp = "";
		String[] result = new String[3];
		
		for(int i=0;i<2; i++) {
			if(record[i] > record[i+1]) {
				recodTemp = record[i];
				record[i] = record[i+1];
				record[i+1] = recodTemp;
				
				stringTemp = string[i];
				string[i] = string[i+1];
				string[i+1] = stringTemp;
			}
		}

		if(record[0] > record[1]) {
			recodTemp = record[0];
			record[0] = record[1];
			record[1] = recodTemp;
			
			stringTemp = string[0];
			string[0] = string[1];
			string[1] = stringTemp;
		}
		
		System.out.println("##### 성적 랭킹 #####\n");
		for(int i=0;i<3; i++) {
			result [i] = String.format("%d등 : %s 선수 기록 (%.1f초)\n", num[i], string[i], record[i]);
		}
		
		return result;
	}
	public void howMuch() {
		
		System.out.println("얼마에요?");
		int inputMoney = scanner.nextInt();
		System.out.println(String.format("%d원 입니다.", inputMoney));
		
		System.out.println("몇개 드릴까요?");
		int num = scanner.nextInt();
		System.out.println(String.format("%d개 주세요.", num));
		
		int total = inputMoney * num;
		System.out.println(String.format("총 금액은 %d원 입니다.", total));
		
		System.out.println("비싸요(할인율 입력)");
		int dc = scanner.nextInt();
		System.out.println(dc + "% 깍아주세요.");
	
		dc = total * dc / 100;
		
		System.out.printf(String.format("그럼 %d원만 주세요.", total - dc ));
	}
	public void getReportCard() {
		Scanner scanner = new Scanner(System.in);
		String[] subjects = { "학생", "국어", "영어", "수학", "총점", "평균", "합격여부" };
		String[] string = new String[7];
		int[] scores = new int[7];
		int sum = 0;
		
		System.out.printf("%s이름를 입력해 주세요.\n", subjects[0]);
		string[0] = scanner.next();
		
		for(int i=1; i<4;i++) {
			System.out.printf("%s점수를 입력해 주세요.\n", subjects[i]);
			scores[i] = scanner.nextInt();
			sum += scores[i];
		}
		scores[4] = sum;
		scores[5] = sum / 3;
		
		for(int i=1;i<6;i++) {
			string[i] = String.valueOf(scores[i]); 
		}
		
		if( scores[5] >= 90 ) {
			string[6] = "장학생";
		}else if( scores[5] < 70 ) {
			string[6] = "불합격";
		}else {
			string[6] = "합격";
		}
		
		for(int i=0; i<7;i++) {
			System.out.printf("%3s  ", subjects[i] );
		}
		System.out.println("");
		
		for(int i=0; i<10;i++) {
			System.out.printf("===");
		}
		System.out.println("");
		for(int i=0; i<7;i++) {
			System.out.printf("%3s ", string[i]);
		}
	}
}
