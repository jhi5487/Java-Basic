
public class Main {
	
	/* 팩토리얼 계산 */
	// 반복함수의 경우
	public static int factorial(int number) {
		int answer = 1;
		for(int i = number; i > 1; i--)
		{
			answer *= i;
		}
		return answer;
	}
	
	// 재귀함수의 경우
	public static int factorial2(int number) {
		if(number == 1)
			return 1;
		else
			return number * factorial(number - 1); // n! = n * (n - 1)! 
	}
	
	public static void main(String[] args) {
		
		System.out.println("10!은 " + factorial(10));
		System.out.println("10!은 " + factorial2(10));
	}

}
