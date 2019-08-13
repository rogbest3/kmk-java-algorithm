package homework01;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 가위바위보에서 
		 * Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다.
		 * 컴퓨터가 만든 값이 1이면 가위를 낸 것이고
		 * 2이면 바위를 낸 것이고
		 * 3이면 보를 낸 것으로 할 때,
		 * 사용자측이 가위, 바위, 보를 냈을 때
		 * 승패를 결정하는 프로그램을 작성하시오
		 */
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		
		int rps = random.nextInt(3) + 1;
	//	System.out.println(rps);
		System.out.println("가위 바위 보를 선택하세요.");
		String answer = scan.next();
		String eval = "";
		String rpsString = String.valueOf(rps);
	//	System.out.println(answer);
	
		switch( rps + answer ) {
			case 1 + "가위" : eval = "컴퓨터가 가위를 냈습니다. 비겼습니다."; break;	//	컴퓨터 가위
			case 1 + "바위" : eval = "컴퓨터가 가위를 냈습니다. 이겼습니다."; break;
			case 1 + "보" : eval = "컴퓨터가 가위를 냈습니다. 졌습니다."; break;
			case 2 + "가위" : eval = "컴퓨터가 바위를 냈습니다. 졌습니다."; break;	//	컴퓨터 바위
			case 2 + "바위" : eval = "컴퓨터가 바위를 냈습니다. 비겼습니다."; break;
			case 2 + "보" : eval = "컴퓨터가 바위를 냈습니다. 이겼습니다."; break;
			case 3 + "가위" : eval = "컴퓨터가 보를 냈습니다. 이겼습니다."; break;	//	컴퓨터 보
			case 3 + "바위" : eval = "컴퓨터가 보를 냈습니다. 졌습니다."; break;
			case 3 + "보" : eval = "컴퓨터가 보를 냈습니다. 비겼습니다."; break;
			default : break;
		}
		System.out.println(eval);
		
	}

}
