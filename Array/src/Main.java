import java.util.Scanner;

/* �迭 ���� �� �ִ��� ���ϴ� �Լ�*/
public class Main {

	public static int max(int a, int b)
	{
		return (a > b) ? a : b;
	}
		
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // �ܺ��� ���̺귯���� ������
		System.out.print("������ �迭�� ũ�⸦ �Է��ϼ���: "); // �迭�� ũ�⸦ �Է¹���
		int number = scanner.nextInt();
		int [] array = new int[number]; // �Էµ� �迭�� ũ�⸸ŭ �迭 ����
		for(int i = 0; i < number; i++)
		{
			System.out.print("�迭�� �Է��� ���� ������ �ϳ��� �Է��ϼ���: ");
			array[i] = scanner.nextInt();
		}
		scanner.close();
		int result = -1;
		for(int i = 0; i < number; i++)
		{
			result = max(result, array[i]);
		}
		System.out.println("�Է��� ���� �� ���� ū ���� " + result + "�Դϴ�.");
	}

}
