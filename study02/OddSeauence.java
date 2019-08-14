package study02;
import java.util.Scanner;
public class OddSeauence {

	public static void main(String[] args) {
		// 1 + 3 + 5 + 7 + 9 =
		// 1 % 2 = 0 이면 짝수 1이면 홀수
		Scanner scan = new Scanner(System.in);
		
		String sequence = "";
		int series = 0, first = 0, last = 0, last2 = 0;
		int num1 = 0, num2 = 0;
		System.out.println("==========================");
		System.out.println("입력된 시작값에서부터 마지막값까지 홀수의 합");
		System.out.println("==========================");
		System.out.println("값1 입력");
		num1 = scan.nextInt();
		System.out.println("값2 입력");
		num2 = scan.nextInt();
		
		if( num1 > num2 ) {
			first = num2;
			last = num1;
		}else if( num1 < num2 ){
			first = num1;
			last = num2;
		}else {
			first = num2;
			last = num1;
		}
		
		if(last%2 == 0) {
			last2 = last - 1;
		}else {
			last2 = last;
		}
		
		for(int i=first; i<=last2; i++) {
			if( i%2 != 0) {
				if( i != last2 ) {
					sequence += i + "+";
				}else {
					sequence += i + "=";
				}
				series += i;
			}
		}
		System.out.println(sequence + series);

	}
}
