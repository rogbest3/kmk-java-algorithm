package study02;
import java.util.Scanner;
public class IntArray {

	public static void main(String[] args) {
		 /** 프로그램을 하나 개발해야 합니다.
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
		String[] subjects = {"국어", "영어", "수학", "과학", "사회"};
		System.out.println("국어점수 입력");
		int kor = scanner.nextInt();
		System.out.println("영어점수 입력");
		int eng = scanner.nextInt();
		System.out.println("수학점수 입력");
		int math = scanner.nextInt();
		System.out.println("과학점수 입력");
		int science = scanner.nextInt();
		System.out.println("사회점수 입력");
		int society = scanner.nextInt();
		
		int[] scores = { kor, eng, math, science, society };
	/**	System.out.printf("국어점수 %d \n", kor);	//	printf f는 format
		System.out.printf("영어점수 %d \n", eng);
		System.out.printf("수학점수 %d \n", math);
		System.out.printf("과학점수 %d \n", science);
		System.out.printf("사회점수 %d \n", society);
	*/	
		System.out.printf("국어점수 %d \n", scores[0] );	//	printf f는 format
		System.out.printf("영어점수 %d \n", scores[1] );
		System.out.printf("수학점수 %d \n", scores[2] );
		System.out.printf("과학점수 %d \n", scores[3] );
		System.out.printf("사회점수 %d \n", scores[4] );
	}
}
