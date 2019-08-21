package homework04_calendar;
import javax.swing.JOptionPane;
public class MyCalendarController {

	public static void main(String[] args) {
		MyCalendar myCalendar = myCalendar = new MyCalendar();;
		MyCalendarService myCalendarService = new MyCalendarService();
		while(true) {
			
			switch(JOptionPane.showInputDialog("0.종료 1.윤달 2.달말일")) {
			case "0" : JOptionPane.showMessageDialog(null, "종료"); return;
			case "1" :
				
				myCalendar.setYear(Integer.parseInt(JOptionPane.showInputDialog("연도 입력")));
				JOptionPane.showMessageDialog(null, myCalendarService.isLeapYear(myCalendar));
				break;
			case "2" :
				
				myCalendar.setMonth(Integer.parseInt(JOptionPane.showInputDialog("달 입력")));
				JOptionPane.showMessageDialog(null, myCalendarService.getEndDay(myCalendar));
				break;
			
			}
		}
	}
}
