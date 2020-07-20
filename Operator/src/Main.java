// 연산자(Operand)- 하나의 기호체계

public class Main {
	
	final static int SECOND = 10000; // 초 시간

	public static void main(String[] args) {

	/* 초를 시간과 분으로 바꾸기 */
	int hour = SECOND  / 3600;
	int minute = (SECOND % 3600) / 60; //몫
	int second = (SECOND % 3600) % 60; //나머지
	
	System.out.println(hour + "시간 " + minute + "분 " + second + "초");
	
	/* 증감 연산자 */
	int a = 1;
	System.out.println("a는" + a + "입니다.");
	a++; // 1 증가
	System.out.println("a는" + a + "입니다.");
	System.out.println("a는" + ++a + "입니다."); // 증가 후 출력
	System.out.println("a는" + a++ + "입니다."); // 출력 후 증가
	System.out.println("a는" + a + "입니다."); // 증가된 a
	
	/* %연산자 */
	for (int i = 1; i<= 6; i++) 
	{
		System.out.println(i % 4); // 4로 나눈 나머지 출력
	}
	
	/* 비교, 논리 연산자 */
	int aa = 30;
	int bb = 40;
	
	System.out.println("aa는 bb보다 큰가? " + (aa > bb));
	System.out.println("aa는 bb보다 작고 30이상인가? " + ((aa < bb) && (aa >= 30))); // and 연산자
	System.out.println("aa는 30이 아닌가? " + (aa != 30));
	
	/* 삼항 연산자 (조건 ? 참: 거짓) */
	int x = 7;
	int y = 10;
	
	System.out.println("최댓값은 " + max(x, y)); // max 함수를 통해 출력
	
	/* 거듭제곱 연산 */
	double c = Math.pow(2.0, 10.0); // 라이브러리에서 Math클래스의 pow함수 호출
	System.out.println("2의 10제곱은 " + (int)c);
	}
	
	// 반환형, 함수 이름, 매개 변수
	static int max(int a, int b) {
		int result = (a > b) ? a : b; //a가 b보다 크면 a, 아니면 b 반환
		return result;
	
	}
}
