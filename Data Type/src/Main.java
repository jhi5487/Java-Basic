
public class Main {

	public static void main(String[] args) {
		
		/* double���� �̿��� ��� ���ϱ� */
		double a = 10.5; 
		double b = 9.6;
		double c = 7.8;
		
		System.out.println((a + b + c)/3);
		System.out.format("������: %e\n", (a + b + c)/3);
		
		/* �ƽ�Ű�ڵ� ����� char�� */
		for (char i = 'a'; i<= 'z'; i++)
		{
			System.out.print(i + " "); // a���� z���� ���
		}
		
		/* ���� ǥ�� �ٲ� ��� */
		int d = 200;
		
		System.out.println("10����: " + d);
		System.out.format("8����: %o\n", d); 
		System.out.format("16����: %x\n", d);
		
		/* �� ������ �ڷ��� String */
		String name = "John Park";
		System.out.println(name);
		System.out.println(name.substring(0, 1)); // ���� �Լ� substring(java���� ����)
		System.out.println(name.substring(3, 8));
		System.out.println(name.substring(5, 9));
	}

}
