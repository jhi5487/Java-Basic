
public class Main {
	
	final static double PI = 3.141592; // 상수는 main함수 바깥쪽에 선언
	// final = 바뀔 수 없음(상수), static = 하나의 클래스에서 공유하는 자원
	
	final static int INT_MAX = 2147483647; // 정수형 상수
	
	public static void main(String[] args) {
		
		/* 변수 선언하고 출력하기 */
		int intType = 100; // 정수형 변수 선언
		double doubleType = 150.5; // 실수형
		String stringType = "정혜인";
		
		System.out.println(intType); // 괄호 안의 내용 출력 후 줄바꿈
		System.out.println(doubleType);
		System.out.println(stringType);
		
		/* 원의 반지름 구하기 */
		int r = 30; // 반지름
		System.out.println(r * r * PI); // 원의 넓이
		
		/* 오버플로우: 범위를 넘어버리면 숫자를 컨트롤 하지 못해 오류 발생 */
		int a  = INT_MAX;
		System.out.println(a); // 정수형의 최대값
		System.out.println(a + 1); // 최댓값을 넘으면 가장 작은 값으로 돌아가는 순환구조를 가짐.
		
		/* 사칙연산 */
		int b = 1;
		int c = 2;
		
		System.out.println("a + b = " + (b + c)); // 문자열과 결과값 묶어 출력
		System.out.println("a - b = " + (b - c));
		System.out.println("a * b = " + (b * c));
		System.out.println("a / b = " + (b / c));
		
		/* 형 변환을 통한 반올림 */
		double e = 0.7;
		int f = (int) (e + 0.5); // 0.5를 더해 인수형으로 변환
		System.out.println(f); 
	}

}
