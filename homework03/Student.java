package homework03;

import java.util.Scanner;

public class Student {
//	1.AC 2.BMI 3.HowMuch 4.Join 5.LeapYear 6.MonthEndDay 7.PassOrFail 8.Ranking 9.ReportCasd 10.ScoreCalc 11.Tax 12.TimeCalc
	Scanner scanner = new Scanner(System.in);
	
	public String getAc(int inputNum1, String operator, int inputNum2 ) {

		int result = 0, remainder = 0;
		String eval ="";
		
		switch(operator) {
		case "+" : result = inputNum1 + inputNum2; break;
		case "-" : result = inputNum1 - inputNum2; break;
		case "*" : result = inputNum1 * inputNum2; break;
		case "/" : result = inputNum1 / inputNum2; remainder = inputNum1 % inputNum2; break;
		default : return "연산자 입력 오류";
		}

		
		if( operator.equals("/") ) {
			eval = String.format("%d %s %d = %d [%d]", inputNum1, operator, inputNum2, result, remainder );
		}else
		{
			eval = String.format("%d %s %d = %d", inputNum1, operator, inputNum2, result );
		}
		
		return eval;
	}
	
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
	
	public int answerInt( int inputInt ) {
		return inputInt;
	}
	public int getTotal(int inputMoney, int num) {
		int total = inputMoney * num;
		return total;
	}
	public int getDc(int total, int dc) {
		dc = total * dc / 100;
		return dc;
	}
	public int howMuch(int total, int dc) {
		total = total - dc;
		return total;
	}

	public String getInformation(int num) {
		String[] informationString = { "아이디", "비밀번호", "이름", "생년월일(1990-05-05)", "성인여부(성인true, 미성년false)", "키(소수점 첫째자리까지)", "몸무게(소수점 쳇째자리까지)", "형액형(A)" };
		return informationString[num];
	}
	
	public String[] join(String[] inputInformation) {
		String[] type = { "cm", "kg", "형" };
		
		String[] outputInfomation = new String[8];
		String[] eval = new String[8];
		
		for(int i=0; i<8; i++) {
			outputInfomation[i] = inputInformation[i];
		}
		
		switch( inputInformation[4] ) {
		case "true" : outputInfomation[4] = "성인"; break;
		case "false" : outputInfomation[4] ="미성년"; break;
		}
		
		for(int i=0;i<3; i++) {
			outputInfomation[i+5] = outputInfomation[i+5] + type[i];
		}
	
		for(int i=0; i<8; i++) {
			eval[i] = String.format("%s : %s\n", getInformation(i), outputInfomation[i]);
		}
		return eval;
	}
	
	public String getLeapYear(int inputYear) {
		
		String whatYear = "";
		String eval = "";
													
		if( inputYear % 4  == 0 ) {				
			if( inputYear % 100 == 0 ) {			
				if( inputYear % 400 == 0 ) {
					whatYear = "윤년";	
				}else {
					whatYear = "평년";	
				}
			}else {
				whatYear = "윤년";
			}
		}else {
			whatYear = "평년";	
		}
		eval = String.format("%d년은 %s입니다.", inputYear, whatYear);
		return eval;
	}
	
	public String getMonthEndDay(int input) {
		
		int[] month = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] day = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int num = 0;
		String eval = "";
		
		for(int i=0; i<12; i++) {
			if(input == month[i] ) {
				num = i;
			}
		}
		eval = String.format("%d월은 %d일 까지 입니다.\n", month[num], day[num]);
		return eval;
	}
	
	public String getString(int num) {
		String[] string = { "학생", "국어", "영어", "수학", "총점", "평균", "합격여부" };
		return string[num];
	}
	public String[] getPassOrFail(String name, int[] scores) {
		int sum = 0;
	//	scores = new int[7];
		String[] result = new String[7];
		String[] eval = new String[7];
		
		result[0] = name;
		
		for(int i=1; i<4; i++) {
			sum += scores[i];
		}
		scores[4] = sum;
		scores[5] = sum / 3;
		
		for(int i=1; i<6; i++) {
			result[i] = String.valueOf(scores[i]);
		}
		
		if(scores[5] >= 90) {
			result[6] = "장학생";
		}else if(scores[5] >= 70) {
			result[6] = "합격";
		}else {
			result[6] = "불합격";
		}
		
		for(int i = 0; i<7; i++) {
			eval[i] = String.format("%3s ", result[i]);
		}
		return eval;
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
		for(int i=0;i<3; i++) {
			result [i] = String.format("%d등 : %s 선수 기록 (%.1f초)\n", num[i], string[i], record[i]);
		}
		return result;
	}
	
	public String getSubjects(int num) {
		String[] subjects = { "학생", "국어", "영어", "수학", "총점", "평균", "합격여부" };
		return subjects[num];
	}
	public String[] getReportCard(String name, int[] ReportScores) {
		
		String[] string = new String[7];
		String[] eval = new String[7];
		int sum = 0;
		
		string[0] = name;
		
		for(int i=1; i<4;i++) {
			sum += ReportScores[i];
		}
		ReportScores[4] = sum;
		ReportScores[5] = sum / 3;
		
		for(int i=1;i<6;i++) {
			string[i] = String.valueOf(ReportScores[i]); 
		}
		
		if( ReportScores[5] >= 90 ) {
			string[6] = "장학생";
		}else if( ReportScores[5] < 70 ) {
			string[6] = "불합격";
		}else {
			string[6] = "합격";
		}
		
		for(int i=0; i<7;i++) {
			eval[i] = String.format("%3s ", string[i]);
		}
		return eval;
	}
	
	public int getIntScoreCalc(int input) {
		int series = 0;
		int eval = 0;
		
			if(input == -1) {
				eval = series;
				return series;
			}else {	
				series += input;
				return series;
			}	
	}
	public String getStringScoreCalc(int input, int num) {
		int series = 0;
		String sequence = "", eval = "";
		
		if( num == 0) {
			sequence += input;
			return sequence;	
		}else {
			if(input == -1) {
				sequence += " = ";
				return sequence;
			}else {	
				sequence += " + " + input;
				return sequence;
			}	
		}
	}
	
	public String getTax( String name, int annualIncome ) {
		
		String eval = "";

		double taxRate = 9.7;
		double tax = (double)annualIncome * taxRate * 0.01;
		
		eval = String.format("연봉 %d만원을 받으시는 %s님께서 납부할 세금은 %.1f만원입니다.\n", annualIncome, name, tax);
		return eval;
	}
	
	public String getTimeCalc(int inputSecond) {
		
		double hour = 0, minute = 0, second = 0;
		double hourTemp = 0, minuteTemp = 0;
		String eval = "";
		
		hour 		= inputSecond / 3600.0;
		hourTemp 	= hour - Math.floor(hour);
		minute 		= hourTemp * 60;
		minuteTemp 	= minute - Math.floor(minute);
		second 		= minuteTemp * 60;
		
		eval = String.format("%.0f시간 %.0f분 %.0f초\n", Math.floor(hour), Math.floor(minute), second );
		return eval;
	}
}