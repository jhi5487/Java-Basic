
public class Main {
	
	final static double PI = 3.141592; // ����� main�Լ� �ٱ��ʿ� ����
	// final = �ٲ� �� ����(���), static = �ϳ��� Ŭ�������� �����ϴ� �ڿ�
	
	final static int INT_MAX = 2147483647; // ������ ���
	
	public static void main(String[] args) {
		
		/* ���� �����ϰ� ����ϱ� */
		int intType = 100; // ������ ���� ����
		double doubleType = 150.5; // �Ǽ���
		String stringType = "������";
		
		System.out.println(intType); // ��ȣ ���� ���� ��� �� �ٹٲ�
		System.out.println(doubleType);
		System.out.println(stringType);
		
		/* ���� ������ ���ϱ� */
		int r = 30; // ������
		System.out.println(r * r * PI); // ���� ����
		
		/* �����÷ο�: ������ �Ѿ������ ���ڸ� ��Ʈ�� ���� ���� ���� �߻� */
		int a  = INT_MAX;
		System.out.println(a); // �������� �ִ밪
		System.out.println(a + 1); // �ִ��� ������ ���� ���� ������ ���ư��� ��ȯ������ ����.
		
		/* ��Ģ���� */
		int b = 1;
		int c = 2;
		
		System.out.println("a + b = " + (b + c)); // ���ڿ��� ����� ���� ���
		System.out.println("a - b = " + (b - c));
		System.out.println("a * b = " + (b * c));
		System.out.println("a / b = " + (b / c));
		
		/* �� ��ȯ�� ���� �ݿø� */
		double e = 0.7;
		int f = (int) (e + 0.5); // 0.5�� ���� �μ������� ��ȯ
		System.out.println(f); 
	}

}
