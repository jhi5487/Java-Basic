// ������(Operand)- �ϳ��� ��ȣü��

public class Main {
	
	final static int SECOND = 10000; // �� �ð�

	public static void main(String[] args) {

	/* �ʸ� �ð��� ������ �ٲٱ� */
	int hour = SECOND  / 3600;
	int minute = (SECOND % 3600) / 60; //��
	int second = (SECOND % 3600) % 60; //������
	
	System.out.println(hour + "�ð� " + minute + "�� " + second + "��");
	
	/* ���� ������ */
	int a = 1;
	System.out.println("a��" + a + "�Դϴ�.");
	a++; // 1 ����
	System.out.println("a��" + a + "�Դϴ�.");
	System.out.println("a��" + ++a + "�Դϴ�."); // ���� �� ���
	System.out.println("a��" + a++ + "�Դϴ�."); // ��� �� ����
	System.out.println("a��" + a + "�Դϴ�."); // ������ a
	
	/* %������ */
	for (int i = 1; i<= 6; i++) 
	{
		System.out.println(i % 4); // 4�� ���� ������ ���
	}
	
	/* ��, �� ������ */
	int aa = 30;
	int bb = 40;
	
	System.out.println("aa�� bb���� ū��? " + (aa > bb));
	System.out.println("aa�� bb���� �۰� 30�̻��ΰ�? " + ((aa < bb) && (aa >= 30))); // and ������
	System.out.println("aa�� 30�� �ƴѰ�? " + (aa != 30));
	
	/* ���� ������ (���� ? ��: ����) */
	int x = 7;
	int y = 10;
	
	System.out.println("�ִ��� " + max(x, y)); // max �Լ��� ���� ���
	
	/* �ŵ����� ���� */
	double c = Math.pow(2.0, 10.0); // ���̺귯������ MathŬ������ pow�Լ� ȣ��
	System.out.println("2�� 10������ " + (int)c);
	}
	
	// ��ȯ��, �Լ� �̸�, �Ű� ����
	static int max(int a, int b) {
		int result = (a > b) ? a : b; //a�� b���� ũ�� a, �ƴϸ� b ��ȯ
		return result;
	
	}
}
