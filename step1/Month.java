package step1;

import java.util.Scanner;

public class Month {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = 0;
		String eval = "";
		
		System.out.println("몇월입니까?");
		Scanner scan = new Scanner(System.in);
		
		month = scan.nextInt();
		
		switch( month ) {
			
		case 1 : eval = "1월"; break;
		case 2 : eval = "2월"; break;
		case 3 : eval = "3월"; break;
		case 4 : eval = "4월"; break;
		case 5 : eval = "5월"; break;
		case 6 : eval = "6월"; break;
		case 7 : eval = "7월"; break;
		case 8 : eval = "8월"; break;
		case 9 : eval = "9월"; break;
		case 10 : eval = "10월"; break;
		case 11 : eval = "11월"; break;
		case 12 : eval = "12월"; break;
		
		default : break;
		}
		System.out.println(eval);
	}
}
