package practice;

public class Student {

	public String getinformation(int num) {
		
		String[] strings = {"아이디", "비밀번호", "이름", "생년월일", "성인 여부(true : 성인, false : 미성년)", "키", "몸무게", "혈액형"};
		
		return strings[num];
	}
	
	public String[] join(String[] input) {
		String[] output = new String[8];
		String[] result = new String[8];
		
		String[] type = {"cm", "kg", "형"};
		
		for(int i=0;i<8;i++) {
			output[i] = input[i];
		}
		if(output[4].equals("true")) {
			output[4] = "성인";
			
		}else if(output[4].equals("false")) {
			output[4] = "미성년";
		}else {
			output[4] = "입력 오류";
		}
			
		for(int i=0;i<3;i++) {
			output[i+5] += type[i];
		}
		for(int i=0;i<8;i++) {
			result[i] = String.format("%s : %s", getinformation(i), output[i]);
		}
		return result;
	}
	public String getLeapYear(int input) {
		
		String whatYear ="";
		String result = "";
		
		if(input % 4 == 0) {
			if(input % 100 == 0) {
				if(input % 400 == 0) {
					result = "윤달";
				}else {
					result = "평달";
				}
			}else {
				result = "윤달";
			}
		}else {
			result = "평달";
		}
		
		return String.format("%d년은  %s입니다.", input, result);
	}
}
