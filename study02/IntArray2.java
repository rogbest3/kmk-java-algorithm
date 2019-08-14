package study02;
import java.util.Scanner;
public class IntArray2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] subjects = {"국어", "영어", "수학", "과학", "사회"}; // 값이 있는 변수 선언
		int[] scores = new int[5];	//	값을 받을 변수 선언
		
		for(int i=0; i<subjects.length; i++) {
			System.out.printf("%s점수 입력\n", subjects[i]);		//	printf f는 format
			scores[i] = scanner.nextInt();
		}
		for(int i=0;i<scores.length;i++) {
			System.out.printf("%s점수 %d \n", subjects[i], scores[i] );
		}
	}
}
