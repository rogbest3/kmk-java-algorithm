package practice;

public class Service {

	public String getBmi(Member member) {
		String result = "", eval = "";
		String name = member.getName();
		double h = member.getHeight() / 100.0;
		double w = member.getWeight();
		
		double bmi = w/(h*h);
		if(bmi >= 30.0) {
			eval = "고도비만";
		}else if(bmi >= 25.0) {
			eval = "비만";
		}else if(bmi >= 23.0) {
			eval = "과체중";
		}else if(bmi >= 18.5) {
			eval = "정상";
		}else {
			eval = "저체중";
		}

		result = String.format("%s님의 BMI 수치는 %.1f로 %s입니다.", name, bmi, eval );
		return result;
	}
}
