package study01;

import java.util.Scanner;
import java.util.Date;				// 오늘 날짜
import java.text.SimpleDateFormat;

public class Month2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		Scanner scan = new Scanner(System.in);

		String now = sdf.format(date);
		String monthNum = now.substring(5,7);
				
		System.out.println(now);
		System.out.println(monthNum);
		
		int month = 0;
		String eval = "";
		
		System.out.println("몇월입니까?");
	//	month = scan.nextInt();
		
		switch( monthNum ) {
		case "01" : eval = "1월"; break;
		case "02" : eval = "2월"; break;
		case "03" : eval = "3월"; break;
		case "04" : eval = "4월"; break;
		case "05" : eval = "5월"; break;
		case "06" : eval = "6월"; break;
		case "07" : eval = "7월"; break;
		case "08" : eval = "8월"; break;
		case "09" : eval = "9월"; break;
		case "10" : eval = "10월"; break;
		case "11" : eval = "11월"; break;
		case "12" : eval = "12월"; break;
		
		default : break;
		}
		System.out.println(eval);
	}
}
