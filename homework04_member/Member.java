package homework04_member;

public class Member {
	// private 다른 클래스에서 접근 불가 (보안이 좋음)
	private String name, id, pw, ssn, blood, status;	// 공용으로 쓰기 때문에 초기화하면 안됨
	private double height, weight;						// 프로퍼티 선언
	private int salary;
	
	public void setName(String name) {	// 위에 선언한 변수
		this.name = name;				// 세터, 쓰기		
	}
	public String getName() {			// 게터, 읽기 read only
		return this.name;				// set이 기록한것을 get이 알고있음
	} 
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return this.id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPw() {
		return this.pw;
	}
	//////////////////////
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getSsn() {
		return this.ssn;
	}
	////////////////////////
	public void setBlood(String blood) {
		this.blood = blood;
	}
	public String getBlood() {
		return this.blood;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus() {
		return this.status;
	}
	///////////////////////
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight;
	}
	///////////////////////
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getSalary() {
		return this.salary;
	}

	//	toString	컨트롤 + 스페이스  -> toString() 선택
	@Override
	public String toString() {
		String status = getStatus();
		String statusTemp = "";
		if(status.equals("true")) {
			statusTemp = "성인";
		}else if(status.equals("false")) {
			statusTemp = "미성년";
		}else {
			statusTemp = "입력 오류";
		}
		return String.format("=== 회원정보 ===\n"
				+ "이름  : %s \n"
				+ "비번 : %s \n"
				+ "아이디 : %s \n"
				+ "주민번호 : %s \n"
				+ "성인여부 : %s \n"
				+ "혈액형 : %s형\n",
				name, pw, id, ssn, statusTemp, blood );
	}
}
