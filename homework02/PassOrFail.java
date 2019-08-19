package homework02;
import java.util.Scanner;
import java.lang.Math;
public class PassOrFail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		   * 프로그램을 하나 개발해야 합니다.
	       * 교수는 학생과 국어, 영어, 수학점수만 입력하면
	       * 총점, 평균, 합격여부가 출력되는 프로그램 입니다.
	       * 오더는 다음과 같이 화면에 출력하라고 합니다.
	       * 학생           국어        영어        수학        총점        평균        합격여부
	       * =======================================================
	       * 홍길동     90       90      90     270      90       (장학생)
	       * 합격여부는 다음과 같다고 합니다.
	       * 평균이 90점 이상이면 장학생
	       * 70점 이상 90점미만 이면 합격
	       * 70미만이면 불합격이라고 하네요.
	       * 단) 평균에서 소수점이하는 절삭입니다.
		 */
		Scanner scanner = new Scanner(System.in);
		String[] string = { "학생", "국어", "영어", "수학", "총점", "평균", "합격여부" };
		int sum = 0;
		int[] scores = new int[7];
		String[] result = new String[7];
		
		System.out.println("학생 이름 입력");
		result[0] = scanner.next();

		for(int i=1; i<4; i++) {
			System.out.printf("%s 점수 입력 : ", string[i]);
			scores[i] = scanner.nextInt();
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
			System.out.printf("%3s  ", string[i]);
		}
		System.out.println("");
		for(int i = 0; i<10; i++) {
			System.out.print("===");
		}
		System.out.println("");
		for(int i = 0; i<7; i++) {
			System.out.printf("%3s ", result[i]);
		}
	}
}
