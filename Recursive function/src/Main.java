
public class Main {
	
	/* ���丮�� ��� */
	// �ݺ��Լ��� ���
	public static int factorial(int number) {
		int answer = 1;
		for(int i = number; i > 1; i--)
		{
			answer *= i;
		}
		return answer;
	}
	
	// ����Լ��� ���
	public static int factorial2(int number) {
		if(number == 1)
			return 1;
		else
			return number * factorial(number - 1); // n! = n * (n - 1)! 
	}
	
	public static void main(String[] args) {
		
		System.out.println("10!�� " + factorial(10));
		System.out.println("10!�� " + factorial2(10));
	}

}
