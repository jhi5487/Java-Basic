
public class Main {
	/* �Ǻ���ġ ���� */
	//����Լ�
	public static int fibo(int number) {
		if((number == 1) || (number == 2))
			return 1;
		return fibo(number - 1) + fibo(number - 2);
	}
	
	//�ݺ��Լ�
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
				two = result; // �ϳ��� �Ű���
			}	
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("�Ǻ���ġ ������ 7��° ���� " + fibo(7));
		System.out.println("�Ǻ���ġ ������ 10��° ���� " + fibo2(10));

	}

}
