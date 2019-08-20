package homework02;
import java.util.Scanner;
import java.lang.Math;
public class TimeCalc {

	public static void main(String[] args) {
		/**
		 * To.개발자님께
			초단위로 알려주는 시험이 있는데
			이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요.
			혹시 초값을 입력받으면 자동으로 계산되는 프로그램을 만들어 줄 수 있을까요?
			그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		double hour = 0, minute = 0, second = 0;
		double hourTemp = 0, minuteTemp = 0;
		
		while(true) {
			System.out.println("초를 입력하여 주십시오.");
			double inputSecond = scanner.nextInt();
			
			hour 		= inputSecond / 3600.0;
			hourTemp 	= hour - Math.floor(hour);
			minute 		= hourTemp * 60;
			minuteTemp 	= minute - Math.floor(minute);
			second 		= minuteTemp * 60;
			System.out.println(minute);
			System.out.println(second);
			System.out.println(String.format("%.0f시간 %.0f분 %.0f초\n", Math.floor(hour), Math.floor(minute), second ));
		}
	}
}
