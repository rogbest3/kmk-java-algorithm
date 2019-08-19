package homework02;
import java.util.Scanner;
public class MonthEndDay {

	public static void main(String[] args) {
		/**
		 * 월을 입력하면 해당 월이 몇일까지인지
			알려주는 프로그램을 작성해 주세요.
			단) 2월은 윤년을 따지지 않고 무조건 29일입니다.
			출력문장 : "??월은 **일 까지 입니다."
		 */
		Scanner scanner = new Scanner(System.in);
		
		int[] month = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] day = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int num = 0;
		
		System.out.println("월을 입력하여 주세요.");
		int input = scanner.nextInt();
		
		for(int i=0; i<12; i++) {
			if(input == month[i] ) {
				num = i;
			}
		}
		System.out.println(String.format("%d월은 %d일 까지 입니다.\n", month[num], day[num]));
	}
}
