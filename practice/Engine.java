package practice;
import java.util.Scanner;
public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;	//	new Member();
		Service service = null;	//	new Service();
		
		while(true) {
			System.out.println("0.종료 1.회원정보 2.Join 3.BMI 4.ReportCard 5.Tax");
			switch(scanner.nextInt()) {
			case 0 :  return;
			case 1 : 
				member = new Member();
				System.out.println("회원정보기입");
				System.out.println("아이디 : ");
				member.setId(scanner.next());
				System.out.println("비번 : ");
				member.setPw(scanner.next());
				System.out.println("이름 : ");
				member.setName(scanner.next());
				System.out.println("생년월일 : ");
				member.setSsn(scanner.next());
				System.out.println("성인여부(성인:true 미성년:false)");
				member.setStatus(scanner.next());
				System.out.println("키");
				member.setHeight(scanner.nextDouble());
				System.out.println("몸무게");
				member.setWeight(scanner.nextDouble());
				System.out.println("혈액형");
				member.setBlood(scanner.next());
				
				System.out.println(member.toString());
				break;
			case 2 : 
				System.out.println("Join");
				
				break;	
			case 3 : 
				service = new Service();
				System.out.println("BMI");
				System.out.println(service.getBmi(member));
				break;	
			case 4 : 
	
				break;	
			case 5 : 
				
				break;	
			}
		}
	}
}
