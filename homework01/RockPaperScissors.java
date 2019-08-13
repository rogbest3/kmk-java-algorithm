package homework01;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		
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
		String answer = "", eval = "";
//		System.out.println(rps);
		System.out.println("가위 바위 보를 선택하세요.");
		answer = scan.next();

		switch( rps ) {
		case 1 : //	컴퓨터 가위
			switch( answer ) {
				case "가위" : eval = "컴퓨터가 가위를 냈습니다. 비겼습니다"; break;	
				case "바위" : eval = "컴퓨터가 가위를 냈습니다. 이겼습니다"; break;	
				case "보" : eval = "컴퓨터가 가위를 냈습니다. 졌습니다"; break;	
			}
			break;	
		
		case 2 : //	컴퓨터 바위
			switch( answer ) {
				case "가위" : eval = "컴퓨터가 바위를 냈습니다. 졌습니다"; break;	
				case "바위" : eval = "컴퓨터가 바위를 냈습니다. 비겼습니다"; break;	
				case "보" : eval = "컴퓨터가 바위를 냈습니다. 이겼습니다"; break;	
			}
			break;	
		
		case 3 : //	컴퓨터 보
			switch( answer ) {
				case "가위" : eval = "컴퓨터가 보를 냈습니다. 이겼습니다"; break;	
				case "바위" : eval = "컴퓨터가 보를 냈습니다. 졌습니다"; break;	
				case "보" : eval = "컴퓨터가 보를 냈습니다. 비졌습니다"; break;	
			}
			break;	
		}
		System.out.println(eval);
	}
}
