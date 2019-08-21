package homework04_calendar;

public class MyCalendarService {

	public String getEndDay(MyCalendar myCalendar) {
		String result = "";
		int endDay = 0;
		int[] monthArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int[] endDayArray = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int month = myCalendar.getMonth();
		
		for(int i=0; i<12; i++) {
			if(monthArray[i] == month ) {
				endDay = endDayArray[i];
			}	
		}
		result = String.format("%d월은 %d일까지 입니다.", month, endDay);
		return result;
	}
	public String isLeapYear(MyCalendar myCalendar) {
		String leapYear = "윤년입니다.";
		String notLeapYear = "윤년이 아닙니다.";
		String result = "";
		int year = myCalendar.getYear();
		if(year % 4 == 0) {
			if(year % 100 == 0 ) {
				if( year % 400 == 0 ) {
					result = leapYear;
				}else {
					result = notLeapYear;
				}
				
			}else {
				result = leapYear;
			}
		}else {
			result = notLeapYear;
		}
			
		return result;
	}
}
