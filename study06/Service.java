package study06;

import javax.print.attribute.standard.MediaSize.NA;

public class Service {
	public String getBMI(Member member) {
		String result = "";
		String name = member.getName();
		double height = member.getHeight() / 100.0;
		double weight = member.getWeight();
		double bmi = weight / (height * height);
		if(bmi >= 30.0) {
			result = "고도비만";
		}else if(bmi >= 25.0) {
			result = "비만";
		}else if(bmi >= 23.0) {
			result = "과체중";
		}else if(bmi >= 18.5) {
			result = "정상";
		}else {
			result = "저체중";
		}
		return String.format("%s님의 BMI 수치는 %.2f로 %s입니다.", name, bmi, result);
	}
	
	public String getReportCard(Member member) {
		String result = "";
		String passOrFail = "";
		String name = member.getName();
		int kor = member.getKor();
		int eng = member.getEng();
		int math = member.getMath();
		
		int sum = kor + eng + math;
		double avr = sum / 3;
		
		if(avr >= 90.0) {
			passOrFail = "장학생";
		}else if(avr >= 70){
			passOrFail = "합격";
		}else {
			passOrFail = "불합격";
		}
		result = String.format("학생     국어     영어     수학     총점     평균     합격여부\n"
				+ "====================================================\n"
				+ "%s   %d   %d   %d   %d   %.0f   %s", name, kor, eng, math, sum, avr, passOrFail );
		return result;
	}

	public String getTax(Member member) {
		String result = "";
		String name = member.getName();
		int salary = member.getSalary();
		double rate = 9.7;
		
		double tax = salary * rate * 0.01;
		
		result = String.format("연봉 %d만원을 받는 %s님의 세금은 %.0f만원입니다.", salary, name, tax);
		return result;
	}
}
