
public class Main {

	public static void main(String[] args) {
		
		/* Ư�� ���ڿ��� �����ϴ��� Ȯ���ϴ� If�� */
		String a = "I Love You.";
		if(a.contains("Love")) // Ư�� ���ڿ��� �����ϴ��� �˻�
		{
			// ���� ���
			System.out.println("Me too.");
		}
		else
		{
			// ������ ���
			System.out.println("I don't like you.");
		}
		
		
		/* ������ ���� ���� ��� */
		int score = 98;
		
		if(score >= 90)
		{
			System.out.println("A�Դϴ�.");
		}
		else if(score >= 80)
		{
			System.out.println("B�Դϴ�.");
		}
		else if(score >= 70)
		{
			System.out.println("C�Դϴ�.");
		}
		else
		{
			System.out.println("F�Դϴ�.");
		}	
		
		
		/* ���ڿ��� ������ ���ǹ� */
		String c = "Man";
		int d = 3;
		
		if(c.equals("Man")) // string �� �� equal()�̶�� �����Լ� �̿�. string�� class��� �ڷ����̱� ����
		{ 
			System.out.println("�����Դϴ�.");
		}
		if(c.equalsIgnoreCase("man")) // ��ҹ��� ������� ������ ��
		{
			System.out.println("�����Դϴ�.");
		}
		
		if(d == 3)
		{
			System.out.println("d�� 3�Դϴ�.");
		}
		else
		{
			System.out.println("d�� 3�� �ƴմϴ�.");
		}
	}

}
