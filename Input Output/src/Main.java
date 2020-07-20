import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; // ����� �����ϰ� �ϴ� ���̺귯�� import

public class Main {

	public static void main(String[] args) {
		
		/* ���� �Է¹޾� ��� */
		Scanner sc = new Scanner(System.in); // System.in�� �ܼ�â���� �Է��ϴ� ������
		System.out.print("������ �Է��ϼ���: ");
		int i = sc.nextInt(); // ����ڰ� �Է��� ������ i�� ����
		System.out.println("�Էµ� ������ " + i + "�Դϴ�.");
		sc.close(); // ���������� ����
		
		/* ���� ����� */
		File file = new File("input.txt"); //File Ŭ������ file����
		try {
			Scanner sc2 = new Scanner(file); // file�� ���� ������ �о��.
			while(sc2.hasNextInt()) // �������� ���� ������ ���� ��
			{
				System.out.println(sc2.nextInt() * 100); // ������ �о� 100 ���� ���
			}
			sc2.close(); // ��ĳ�� �Լ� ����
		} catch (FileNotFoundException e) {
			System.out.println("������ �о���� ���߿� ������ �߻��߽��ϴ�."); // file�� ���� �� ���ܱ���
		}
	}

}
