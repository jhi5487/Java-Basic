
public class Main {
	/* �ִ� ������� ã�� �Լ� */
	// ����� ���� �Լ� - ��ȯ��, �Լ��̸�, �Ű�����
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
		for(int i = min; i > 0; i--) // ���� ���� �� ���� 1�� ����
		{
			if( a % i == 0 && b % i == 0 && c % i == 0) // �� ���� ������ �� ��� �������� 0�̸� �ִ�����
				return i;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("40, 60, 80�� �ִ� �����:" + function(40, 60, 80));

	}
	

}
