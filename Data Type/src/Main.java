
public class Main {

	public static void main(String[] args) {
		
		/* double형을 이용한 평균 구하기 */
		double a = 10.5; 
		double b = 9.6;
		double c = 7.8;
		
		System.out.println((a + b + c)/3);
		System.out.format("지수형: %e\n", (a + b + c)/3);
		
		/* 아스키코드 기반의 char형 */
		for (char i = 'a'; i<= 'z'; i++)
		{
			System.out.print(i + " "); // a부터 z까지 출력
		}
		
		/* 진수 표현 바꿔 출력 */
		int d = 200;
		
		System.out.println("10진수: " + d);
		System.out.format("8진수: %o\n", d); 
		System.out.format("16진수: %x\n", d);
		
		/* 비 원시적 자료형 String */
		String name = "John Park";
		System.out.println(name);
		System.out.println(name.substring(0, 1)); // 내부 함수 substring(java에서 제공)
		System.out.println(name.substring(3, 8));
		System.out.println(name.substring(5, 9));
	}

}
