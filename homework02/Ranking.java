package homework02;
import java.util.Scanner;
import java.lang.Math;
public class Ranking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 저희는 비트올림픽 위원회입니다.
			한번의 트랙에서 육상선수는 총 3명 입니다.
			총 세명의 100m 기록을 입력받아서 
			1, 2, 3 등을 가려야 합니다.
			
			A 선수 기록 : 10.5초
			B 선수 기록 : 10.8초
			C 선수 기록 : 10.1초 
			라고 입력받았다면
			
			###### 성적 랭킹 #######
			
			1등 : C 선수 기록 (10.1초)
			2등 : A 선수 기록 (10.5초)
			3등 : B 선수 기록 (10.8초)
			
			라고 출력시켜주세요.
		 */
		Scanner scanner = new Scanner(System.in);
		String[] string = { "A", "B", "C"};
		int[] num = { 1, 2, 3 };
		double[] record = new double[3];
		double recodTemp = 0.0;
		String stringTemp = "";
		
		for(int i=0;i<3; i++) {
			System.out.printf("%s 선수 기록 입력\n", string[i]);
			record[i] = scanner.nextDouble();
		}
		for(int i=0;i<2; i++) {
			if(record[i] > record[i+1]) {
				recodTemp = record[i];
				record[i] = record[i+1];
				record[i+1] = recodTemp;
				
				stringTemp = string[i];
				string[i] = string[i+1];
				string[i+1] = stringTemp;
			}
		}

		if(record[0] > record[1]) {
			recodTemp = record[0];
			record[0] = record[1];
			record[1] = recodTemp;
			
			stringTemp = string[0];
			string[0] = string[1];
			string[1] = stringTemp;
		}
		
		System.out.println("##### 성적 랭킹 #####\n");
		for(int i=0;i<3; i++) {
			System.out.printf("%d등 : %s 선수 기록 (%.1f초)\n", num[i], string[i], record[i]);
		}
	}

}
