package homework04_grade;

import study06.Member;

public class GradeService {

	public int getTotal(Grade grade) {
		int total = 0;
		int kor = grade.getKor();
		int eng = grade.getEng();
		int math = grade.getMath();

		total = kor + eng + math;
		return total;
	}
	public int getAvg(Grade grade) {
		int avg = 0;
		int total = getTotal(grade);
		avg = total / 3;
		return avg;
		
	}
	public String getPassOrFail(Grade grade) {
		String result = "";
		int avg = getAvg(grade);
		
		if(avg >= 90) {
			result = "장학생";
		}else if(avg >= 70) {
			result = "합격";
		}else {
			result = "불합격";
		}
		return result;
	}

}
