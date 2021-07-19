package co.hazzys.prj;

public class HelloJava {
	private String str; // 멤버 변수
	// private 변수는 1)생성자를 통해서 값 전달, 2)setter을 통해서 값 전달

	// 기본생성자
	public HelloJava() {
	}

	// 생성자
	public HelloJava(String str) { // 생성자 Overloading(다형성) //전달인자나 method가 다름 //값을 기억시킴
		this.str = str;
	}
	
	//
	public String getStr() {// 전달인자 없음, 리턴값 필요 //기억된 값을 가져옴
		return str;
	}

	public void setStr(String str) {// 전달인자 있음, 리턴값 없음
		this.str = str;
	}

	@Override // 본체를 다시 만들어줌
	public String toString() { //Object 객체로 상속받은 toString method를 재정의함
		System.out.println(str);
		return null;
	}
}
