package homework03;
import java.sql.ResultSet;
import java.util.Scanner;
import homework03.Student;
public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Student student = new Student();
		
		int flag = 0, resultInt = 0;
		String result = "", name = "";
		String[] recordResult = new String[3];
		String[] resultString = new String[8];
		
		while(true) {
			System.out.println("메뉴 : 0.종료 1.AC 2.BMI 3.HowMuch 4.Join 5.LeapYear 6.MonthEndDay 7.PassOrFail 8.Ranking 9.ReportCasd 10.ScoreCalc 11.Tax 12.TimeCalc");
			flag = scanner.nextInt();
			
			switch(flag) {
			case 0 : System.out.println("종료"); return;
			case 1 : System.out.println("AC");
			
				System.out.println("숫자 입력");
				int inputNum1 = scanner.nextInt();
				
				System.out.println("연산자 입력");
				String operator = scanner.next();
				
				System.out.println("숫자 입력");
				int inputNum2 = scanner.nextInt();
			
				result = student.getAc(inputNum1, operator, inputNum2);
				System.out.println(result);
				break;
			case 2 : 
				System.out.println("BMI"); 
				
				System.out.println("이름 입력");
				name = scanner.next();
				System.out.println("몸무게 입력");
				double weight = scanner.nextDouble();
				System.out.println("키 입력");
				double height = scanner.nextDouble();
				
				result = student.getBmi(name, weight, height);
				System.out.println(result);
				break;
				
			case 3 : 
				System.out.println("HowMuch"); 
				
				System.out.println("얼마에요?");
				int inputMoney = student.answerInt(scanner.nextInt());
				System.out.printf("%d원 입니다.", inputMoney);
				
				System.out.println("몇개 드릴까요?");
				int num = student.answerInt(scanner.nextInt());
				System.out.printf("%d개 주세요.\n", num);
				
				int total = student.getTotal(inputMoney, num);
				System.out.printf("총 금액은 %d원 입니다.\n", total);
				
				System.out.println("비싸요(할인율 입력)");
				int dc = scanner.nextInt();
				System.out.println(dc + "% 깍아주세요.");
				dc = student.getDc(total, dc);
				
				resultInt = student.howMuch(total, dc);
				System.out.printf("그럼 %d원만 주세요.\n", resultInt);
				break;
			
			case 4 :
				System.out.println("Join");
				
				String[] inputInformation = new String[8];
				
				System.out.println("=== 회원가입 ===");
				
				for(int i=0; i<8; i++) {
					System.out.printf("%s : ", student.getInformation(i));
					inputInformation[i] = scanner.next();
				}
				resultString = student.join(inputInformation);
				System.out.println("=== 회원정보 ===");
				
				for(int i=0; i<8; i++) {
					System.out.printf(resultString[i]);
				}
				break;
				
			case 5 :
				System.out.println("LeapYear");
				
				System.out.println("연도를 입력해주세요.");
				result = student.getLeapYear(scanner.nextInt());
				System.out.println(result);
				break;
				
			case 6 :
				System.out.println("MonthEndDay");
				
				System.out.println("월을 입력하여 주세요.");
				result = student.getMonthEndDay(scanner.nextInt());
				System.out.println(result);
				break;
				
			case 7 :
				System.out.println("PassOrFail");
				int[] scores = new int[7];
				
				System.out.println("학생 이름 입력");
				name = scanner.next();
				
				for(int i=1; i<4; i++) {
					System.out.printf("%s 점수 입력 : ", student.getString(i));
					scores[i] = scanner.nextInt();
				}
				
				resultString = student.getPassOrFail(name, scores);
				
				for(int i = 0; i<7; i++) {
					System.out.printf("%3s  ", student.getString(i));
				}
				System.out.println("");
				for(int i = 0; i<10; i++) {
					System.out.print("===");
				}
				System.out.println("");
				for(int i = 0; i<7; i++) {
					System.out.printf(resultString[i]);
				}
				System.out.println("");
				break;
				
			case 8 : 
				System.out.println("Ranking"); 
				
				double[] record = new double[3];

				for(int i=0;i<3; i++) {
					System.out.println("선수 기록 입력");
					record[i] = scanner.nextDouble();
				}
				
				recordResult = student.getRank(record);
				System.out.println("##### 성적 랭킹 #####\n");
				for(int i=0;i<3; i++) {
					System.out.println(recordResult[i]);
				}
				break;
				
			case 9 : 
				System.out.println("ReportCard"); 
				
				int[] ReportScores = new int[7];
				
				System.out.printf("%s이름를 입력해 주세요.\n", student.getSubjects(0));
				name = scanner.next();
				
				for(int i=1; i<4;i++) {
					System.out.printf("%s점수를 입력해 주세요.\n", student.getSubjects(i));
					ReportScores[i] = scanner.nextInt();
				}
				
				resultString = student.getReportCard(name, ReportScores);
				
				for(int i=0; i<7;i++) {
					System.out.printf("%3s  ", student.getSubjects(i) );
				}
				System.out.println("");
				
				for(int i=0; i<10;i++) {
					System.out.printf("===");
				}
				System.out.println("");
				for(int i=0; i<7;i++) {
					System.out.print(resultString[i]);
				}
				System.out.println("");
				break;
				
			case 10 :
				System.out.println("ScoreCalc");
				int evalInt = 0, firstResultInt =0;
				int accumulatedresultInt = 0;
				String firstResultString ="";
				result = "";
				System.out.println("더하시려는 숫자를 입력하세요(종료는 -1)");
				int input = scanner.nextInt();
				firstResultInt = student.getIntScoreCalc(input);
				firstResultString = student.getStringScoreCalc(input, 0);
				
				while(input != -1) {
					System.out.println("더하시려는 숫자를 입력하세요(종료는 -1)");
					input = scanner.nextInt();
					accumulatedresultInt += student.getIntScoreCalc(input);
					result += student.getStringScoreCalc(input, 1);
				}
				evalInt = firstResultInt + accumulatedresultInt;
				result = firstResultString + result;
				System.out.println( result + evalInt );
				System.out.println();
				break;
				
			case 11 : 
				System.out.println("Tax");
				
				System.out.println("이름을 입력해 주세요.");
				name = scanner.next(); 
				System.out.println("연봉을 입력해 주세요.");
				int annualIncome = scanner.nextInt();
				
				result = student.getTax( name, annualIncome );
				System.out.println(result);
				break;
				
			case 12:
				System.out.println("TimeCalc");
				
				System.out.println("초를 입력하여 주십시오.");
				result = student.getTimeCalc(scanner.nextInt());
				System.out.println(result);
				break;
			}
		}
	}

}
