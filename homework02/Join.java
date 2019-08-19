package homework02;
import java.util.Scanner;
public class Join {

	public static void main(String[] args) {
		/**
		 * 여기는 비트헬스 입니다.
			입력받을 정보는 아래와 같습니다.
			값을 입력받은 후에 다시 입력받은 값을 그대로 보여주는
			프로그램을 보여주세요
			
			=== 회원가입 ===
			아이디 : 
			비밀번호 : 
			이름 : 
			생년월일(예) 1980-01-01 : 
			성인여부(성인true,미성년false) : 
			키(소수점 첫째자리까지) :
			몸무게(소수점 첫째자리까지) : 
			혈액형(A) : 
			
			입력이 종료되면 ...아래처럼 보이게 해주세요
			
			=== 회원정보 ===
			아이디 : hong
			비밀번호 : 1234
			이름 : 홍길동
			생년월일(예) 1990-05-05 : 
			성인여부(성인true,미성년false) : 성인
			키(소수점 첫째자리까지) : 178.5 cm
			몸무게(소수점 첫째자리까지) : 75kg
			혈액형(A) : B형
		 */
		Scanner scanner = new Scanner(System.in);
		String[] information = { "아이디", "비밀번호", "이름", "생년월일(1990-05-05)", "성인여부(성인true, 미성년false)", "키(소수점 첫째자리까지)", "몸무게(소수점 쳇째자리까지)", "형액형(A)" };
		String[] type = { "cm", "kg", "형" };
		String[] inputInformation = new String[8];
		String[] outputInfomation = new String[8];
		
		System.out.println("=== 회원가입 ===");
		for(int i=0; i<8; i++) {
			System.out.printf("%s : ", information[i]);
			inputInformation[i] = scanner.next();
			outputInfomation[i] = inputInformation[i];
		}
		
		switch( inputInformation[4] ) {
		case "true" : outputInfomation[4] = "성인"; break;
		case "false" : outputInfomation[4] ="미성년"; break;
		}
		
		for(int i=0;i<3; i++) {
			outputInfomation[i+5] = outputInfomation[i+5] + type[i];
		}
	
		System.out.print("\n");
		System.out.println("=== 회원정보 ===");
		for(int i=0; i<8; i++) {
			System.out.printf("%s : %s\n", information[i], outputInfomation[i]);
		}
	}
}
