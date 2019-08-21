package practice;

public class Member {
	/**아이디 : 
		비밀번호 : 
		이름 : 
		생년월일(예) 1980-01-01 : 
		성인여부(성인true,미성년false) : 
		키(소수점 첫째자리까지) :
		몸무게(소수점 첫째자리까지) : 
		혈액형(A) : 
		*/
	private String name, pw, id, ssn, status, blood;
	private double height, weight;
	private int kor, eng, math, salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBlood() {
		return blood;
	}
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {

		return String.format("회원가입\n"
				+ "아이디 : %s \n"
				+ "비번 : %s \n"
				+ "이름 : %s \n"
				+ "생년월일 : %s \n"
				+ "키 : %scm \n"
				+ "몸무게 : %skg \n"
				+ "혈액형 : %s형 \n", id, pw, name, ssn, height, weight, blood);
	}
	
}
