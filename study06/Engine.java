package study06;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Member member = null;		// member1, member2, ... 로 회원을 추가 만듬
		Service service = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.회원정보기입 2.Join 3.Search 4.BMI 5.ReportCard 6.Tax")) {
			case "0" : JOptionPane.showInputDialog("종료"); return;
			case "1" : 
				member = new Member();
				JOptionPane.showInputDialog("회원가입");
				member.setId(JOptionPane.showInputDialog("ID입력"));
				member.setPw(JOptionPane.showInputDialog("비밀번호입력"));
				member.setName(JOptionPane.showInputDialog("이름"));
				
				System.out.println("주민번호");
				member.setSsn(scanner.next());
				
				System.out.println("성인여부(성인:true 미성년:false)");
				member.setStatus(scanner.next());
				
		/*		System.out.println("키");
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
				
				System.out.println(member.toString());
		*/		break;
				
			case "2" :	
				JOptionPane.showMessageDialog(null, "2.마이페이지\n" + member.toString());
				break;

			case "3" :
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
				
			case "4" :
			//	member = new Member();				//	1번에서 수행됨
				service = new Service();
				System.out.println("BMI 구하기");
				System.out.println(service.getBMI(member));
				
				break;
			case "5" :
			//	member = new Member();
				service = new Service();
				System.out.println("ReportCard");
				System.out.println(service.getReportCard(member));
				break;
			case "6" :
			//	member = new Member();
				service = new Service();
				System.out.println("Tax");
				System.out.println(service.getTax(member));
				break;
				
			}
		}
	}

}
