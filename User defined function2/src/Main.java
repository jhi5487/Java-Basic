
public class Main {
	
	/* ������ k��° ��� ã�� */
	public static int function(int number, int k) {
		for(int i = 1; i <= number; i++)
		{
			if(number % i == 0)
				{
					k--; // ����� ã���� k ����
					if(k == 0) return i; // k�� 0�� �� ���� i�� k��° ���
				}
		}
		return -1; // k��° ����� ���ٸ� -1 ��ȯ
	}
	
	public static void main(String[] args) {
		int result = function(3000, 10);
		if(result == -1) 
			System.out.println("3000�� 10��° ����� �����ϴ�.");
		else 
			System.out.println("3000�� 10��° �����" + result + "�Դϴ�.");

	}

}
