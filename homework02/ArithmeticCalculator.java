package homework02;
import java.util.Scanner;
public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/**
	  * 프로그램을 하나 개발해야 합니다.
		교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
		복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
		몫과 나머지값으로 출력하면 된답니다.
		출력결과물은 예를 들어
		5 + 5 = 10
		2 - 7 = -5
		이렇게 되고,
		10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
		그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
		*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		int inputNum1 = scanner.nextInt();
		
		System.out.println("연산자 입력");
		String operator = scanner.next();
		
		System.out.println("숫자 입력");
		int inputNum2 = scanner.nextInt();
		int result = 0, remainder = 0;
		
		switch(operator) {
		case "+" : result = inputNum1 + inputNum2; break;
		case "-" : result = inputNum1 - inputNum2; break;
		case "*" : result = inputNum1 * inputNum2; break;
		case "/" : result = inputNum1 / inputNum2; remainder = inputNum1 % inputNum2; break;
		default : System.out.println("연산자 입력 오류"); return;
		}

		System.out.printf("%d %s %d = %d", inputNum1, operator, inputNum2, result );
		
		if( operator.equals("/") ) {
			System.out.printf(" [%d]\n", remainder );
		}
	/**	switch(operator) {
		case "/" : System.out.printf(" [%d]\n", remainder ); break;
		default : break;
		}
	*/	
	}
}
