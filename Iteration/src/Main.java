
public class Main {
	
	final static int N = 10; // ��� ����
		
	public static void main(String[] args) {
		/* while �� */
		int i = 1, sum = 0;
		while(i <= 100)
		{
			sum += i++; // sum�� i�� ���� �� 1����
		}
		System.out.println("1���� 100������ ��: " + sum);
		
		
		/* for�� : �ʱ�ȭ, ���� ����, ���� */
		for(int j = N; j > 0; j--)
		{
			for(int k = j; k > 0; k--) { // ���� for��
				System.out.print("*"); // 30������ 1������ ���
			}
			System.out.println(); //�ٹٲ�
		}
		
	
		/* �� ����ϱ� */
		for(int a= -N; a <= N; a++)
		{
			for(int b = -N; b <= N; b++)
			{
				if (a * a + b * b <= N * N) // ���� ������ ���ο� ������ "*" ���
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(); // �ٹٲ�
		}
		
		
		/* ���� ����, break */
		int count = 0;
		
		for(;;) // while(True)�� ����
		{
			System.out.println("count");
			count++;
			if(count == 10)
			{
				break; // ���� ���� �� �ݺ��� Ż��
			}
		}
	}
}
