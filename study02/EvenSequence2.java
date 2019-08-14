package study02;
import java.util.Scanner;
public class EvenSequence2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("시작값 입력");
		int num1 = scan.nextInt();
		System.out.println("마지막값 입력");
		int num2 = scan.nextInt();
		
		String sequence = "";
		int series = 0, end2 = 0, start = 0, end = 0;
		
		if(num1 > num2) {
			start = num2;
			end = num1;
		}else {
			start = num1;
			end = num2;
		}
		
		end2 = end%2 == 0 ? end : end -1;
		
		for(int i=start;i<=end;i++) {
			if( i%2 == 0) {
				sequence += i==end2 ? i+"=" : i+"+";
				series += i;
			}
			
		}
		System.out.println(sequence + series);
	}

}
