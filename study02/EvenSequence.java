package study02;
import java.util.Scanner;
public class EvenSequence {

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
		
		if(end%2 == 0){
			end2 = end;
		}else {
			end2 = end - 1;
		}
		
		for(int i=start;i<=end;i++) {
			if( i%2 == 0) {
				if( i != end2) {
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
