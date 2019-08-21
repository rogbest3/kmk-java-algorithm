package homework04_member;
import javax.swing.JOptionPane;

public class MemberController {

	public static void main(String[] args) {
		Member member = null;		// member1, member2, ... 로 회원을 추가 만듬
		MemberService service = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료 1.회원정보기입 2.Join 3.BMI 4.Tax")) {
			case "0" : JOptionPane.showMessageDialog(null, "종료"); return;
			case "1" : 
				member = new Member();
				member.setId(JOptionPane.showInputDialog("ID 입력"));
				member.setPw(JOptionPane.showInputDialog("비밀번호 입력"));
				member.setName(JOptionPane.showInputDialog("이름 입력"));
				member.setSsn(JOptionPane.showInputDialog("주민번호입력"));
				member.setStatus(JOptionPane.showInputDialog("성인여부(성인:true 미성년:false) 입력"));
				member.setBlood(JOptionPane.showInputDialog("혈액형 입력"));
				break;
				
			case "2" :	
				JOptionPane.showMessageDialog(null, "2.마이페이지\n" + member.toString());
				break;

			case "3" :
				service = new MemberService();
				member.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키 입력")));
				member.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게 입력")));
				
				JOptionPane.showMessageDialog(null, "3.BMI\n" + service.getBMI(member));
				break;
				
			case "4" :
				member.setSalary(Integer.parseInt(JOptionPane.showInputDialog("연봉 입력")));
				JOptionPane.showMessageDialog(null, "4.Tax\n" + service.getTax(member));
				
				break;
			}
		}
	}
}
