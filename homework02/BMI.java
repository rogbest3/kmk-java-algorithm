package homework02;
import java.util.Scanner;
import java.lang.Math;
public class BMI {

	public static void main(String[] args) {
	/** 정석 p483 Math클래스 참조
	  * 사람의 이름을 입력하고, 몸무게 , 키를 입력하면
		해당 사람의 상태가 비만인지 저체중인지 알려주는 BMI 지수 측정하는 프로그램을 만들어 주세요.
		BMI 구하는 공식은 아래와 같아요. 더 궁금하면 여기를 클릭하세요.
		       BMI = x KG / (y M * y M)
		
		Example for 175 cm height and 70 kg weight:
		BMI = 70 / (1.75 * 1.75) = 22.86
		
		(bmi >= 30.0) 고도비만
		(bmi >= 25.0) 비만
		(bmi >= 23.0) 과체중
		(bmi >= 18.5) 정상
		(bmi < 18.5) 저체중
		       이랍니다.
	  */
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름 입력");
		String name = scanner.next();
		System.out.println("몸무게 입력");
		double weight = scanner.nextDouble();
		System.out.println("키 입력");
		double height = scanner.nextDouble() / 100;
		
		double bmi = weight / (height * height);
		bmi = Math.round(bmi * 100.0)/100.0;
		
		System.out.printf("%s님은 현재 BMI 수치가 ", name);
		System.out.print(bmi);
		
		if( bmi >= 30.0 ) {
			System.out.printf("고도비만 입니다.");
		}else if( bmi >= 25.0 ) {
			System.out.printf("비만 입니다.");
		}else if( bmi >= 23.0 ) {
			System.out.printf("과체중 입니다.");
		}else if( bmi >= 18.5) {
			System.out.printf("정상 입니다.");
		}else {
			System.out.printf("저체중 입니다.");
		}
		
	}
}
