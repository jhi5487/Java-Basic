
public class Main {
	/* 최대 공약수를 찾는 함수 */
	// 사용자 정의 함수 - 반환형, 함수이름, 매개변수
	public static int function(int a, int b, int c) {
		int min;
		if(a > b)
		{
			if(b > c) min = c;
			else min = b;
		}
		else
		{
			if(a > c) min = c;
			else min = a;
		}
		for(int i = min; i > 0; i--) // 가장 작은 수 부터 1씩 감소
		{
			if( a % i == 0 && b % i == 0 && c % i == 0) // 각 수를 나눴을 때 모두 나머지가 0이면 최대공약수
				return i;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("40, 60, 80의 최대 공약수:" + function(40, 60, 80));

	}
	

}
