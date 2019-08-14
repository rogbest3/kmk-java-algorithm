package study02;

public class Sum1to10 {

	public static void main(String[] args) {
		//	1 + 2 + 3 + 4 + 5 +
		for( int i=1; i<=5; i++ ) {
			System.out.print( i + "+");
		}
		
		System.out.println("\n");
		//	1 + 2 + 3 + 4 + 5 =
		for( int j=1; j<=5; j++) {			
			if(j == 5) {
				System.out.print( j + "=" );
			}else {
				System.out.print( j + "+" );
			}
		}
		
		System.out.println("\n");
		for( int j=1; j<=5; j++) {	
			String result = "";
			if(j == 5) {
				result += j+" = ";
			}else {
				result += j+" + ";
			}
			System.out.print(result);
		}
		
		System.out.println("\n");
		for( int k=1; k<=5; k++) {
			switch(k) {
			case 5 : System.out.print( k + "="); break;
			default : System.out.print( k + "+"); break;
			}
		}
	}
}
