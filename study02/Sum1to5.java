package study02;

public class Sum1to5 {

	public static void main(String[] args) {
		//	1 + 2 + 3 + 4 + 5 +
		String result = "";
		int sum1 = 0;
		for( int i=1; i<=10; i++) {	
			result += i == 10 ? i+" = " : i+" + ";	//	3항 연산자
			sum1 += i;
		}
		System.out.print(result + sum1);
		
		System.out.println("\n");
		//	1 + 2 + 3 + 4 + 5 +
		String eval = "";
		int sum = 0;
		for( int i=1; i<=10; i++) {	
			if(i == 10) {
				eval += i+" = ";
			}else {
				eval += i+" + ";
			}
			sum += i;
		}
		System.out.print(eval + sum);
	}
}
