package study05;
import java.util.Scanner;
public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;
		Service service = null;
		while(true) {
			System.out.println("0.종료 1.회원정보기입 2.Join 3.Search 4.BMI 5.ReportCard 6.Tax");
			switch(scanner.nextInt()) {
			case 0 : System.out.println("종료");
			case 1 : 
				member = new Member();
				System.out.println("회원가입");
				
				System.out.println("아이디");
				member.setId(scanner.next());
				
				System.out.println("비밀번호");
				member.setPw(scanner.next());
				
				System.out.println("이름");
				member.setName(scanner.next());
				
				System.out.println("주민번호");
				member.setSsn(scanner.next());
				
				System.out.println("키");
				member.setHeight(scanner.nextDouble());
				
				System.out.println("몸무게");
				member.setWeight(scanner.nextDouble());
				
				System.out.println("혈액형");
				member.setBlood(scanner.next());
				
				System.out.println("국어점수");
				member.setKor(scanner.nextInt());
				
				System.out.println("영어점수");
				member.setEng(scanner.nextInt());
				
				System.out.println("수학점수");
				member.setMath(scanner.nextInt());
				
				System.out.println("연봉");
				member.setSalary(scanner.nextInt());
				break;
				
			case 2 :	
				System.out.println(member.toString());
				break;

			case 3 :
				member = new Member();
				System.out.println("아이디, 이름을 입력하면 비번과 주민번호 알려줌");
				String searchName = scanner.next();
				String searchId = scanner.next();
				if(searchName.equals("kmk") && searchId.equals("kmk")) {
					System.out.printf("찾는 비번 : %s \n"
							+ "주민번호 : %s \n", member.getPw(), member.getSsn());
				}else {
					System.out.println("찾는 아이디 없습니다.");
				}
				break;
				
			case 4 :
			//	member = new Member();
				service = new Service();
				System.out.println("BMI 구하기");
				System.out.println(service.getBMI(member));
				
				break;
			case 5 :
			//	member = new Member();
				service = new Service();
				System.out.println("ReportCard");
				System.out.println(service.getReportCard(member));
				break;
			case 6 :
			//	member = new Member();
				service = new Service();
				System.out.println("Tax");
				System.out.println(service.getTax(member));
				break;
				
			}
		}
	}

}
