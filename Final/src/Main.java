// Final : 절대 변하지 않는 특정한 것
// Final 키워드는 변수(상수), 메소드(재정의 불가능한 메소드), 클래스(상속 불가한 완전한 클래스)에 모두 사용 가능.

public class Main {
	
	//public void show() {} 함수의 재정의 불가
	
	public static void main(String[] args) {
		
		final int number = 10; // 상수 정의
	    //number = 5; 바꿀 수 없음
		System.out.println(number);
	}

}
