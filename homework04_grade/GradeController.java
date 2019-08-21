package homework04_grade;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class GradeController {

	public static void main(String[] args) {
		
		Grade grade = null;
		GradeService gs = null;	// gs = new GradeService();
		while(true) {
			
			switch(JOptionPane.showInputDialog("0.종료 1.점수 입력 2.총점 3.평균 4.합격여부")) {
			case "0" : JOptionPane.showMessageDialog(null, "종룡"); return;
			case "1" : 
				grade = new Grade();
				grade.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어 점수 입력")));
				grade.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어 점수 입력")));
				grade.setMath(Integer.parseInt(JOptionPane.showInputDialog("수학 점수 입력")));
				break;
			case "2" :
				gs = new GradeService();
				JOptionPane.showMessageDialog(null, "총점 : " + gs.getTotal(grade));
				break;
			case "3" :
				JOptionPane.showMessageDialog(null, "평균 : " + gs.getAvg(grade));
				break;
			case "4" : 
				JOptionPane.showMessageDialog(null, "합격 여부 : " + gs.getPassOrFail(grade));
				break;
			}
		}
	}

}
