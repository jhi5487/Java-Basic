
public class Main {
	/* 피보나치 수열 */
	//재귀함수
	public static int fibo(int number) {
		if((number == 1) || (number == 2))
			return 1;
		return fibo(number - 1) + fibo(number - 2);
	}
	
	//반복함수
	public static int fibo2(int number) {
		int one = 1;
		int two = 1;
		int result = -1;
		
		if(number == 1) return one;
		else if(number == 2) return two;
		else
		{
			for(int i = 2; i < number; i++)
			{
				result = one + two;
				one = two;
				two = result; // 하나씩 옮겨줌
			}	
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("피보나치 수열의 7번째 수는 " + fibo(7));
		System.out.println("피보나치 수열의 10번째 수는 " + fibo2(10));

	}

}
