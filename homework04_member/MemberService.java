package homework04_member;

public class MemberService {
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
