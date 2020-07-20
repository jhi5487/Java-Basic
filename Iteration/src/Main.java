
public class Main {
	
	final static int N = 10; // 상수 정의
		
	public static void main(String[] args) {
		/* while 문 */
		int i = 1, sum = 0;
		while(i <= 100)
		{
			sum += i++; // sum을 i에 더한 후 1증가
		}
		System.out.println("1부터 100까지의 합: " + sum);
		
		
		/* for문 : 초기화, 종료 조건, 연산 */
		for(int j = N; j > 0; j--)
		{
			for(int k = j; k > 0; k--) { // 이중 for문
				System.out.print("*"); // 30개부터 1개까지 출력
			}
			System.out.println(); //줄바꿈
		}
		
	
		/* 원 출력하기 */
		for(int a= -N; a <= N; a++)
		{
			for(int b = -N; b <= N; b++)
			{
				if (a * a + b * b <= N * N) // 원의 방정식 내부에 있으면 "*" 출력
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(); // 줄바꿈
		}
		
		
		/* 무한 루프, break */
		int count = 0;
		
		for(;;) // while(True)와 같음
		{
			System.out.println("count");
			count++;
			if(count == 10)
			{
				break; // 조건 만족 시 반복문 탈출
			}
		}
	}
}
