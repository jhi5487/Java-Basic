
/* 100���� ���� ������ ��� */

public class Main {

	public static void main(String[] args) {
		
		int [] array = new int[100];
		for(int i = 0 ; i < 100; i++) {
			array[i] = (int) (Math.random() * 100 + 1); // random�� 0�̻� 1�̸��� ��. ���� 1�̻� 100������ ���ڸ� �迭�� �ִ°�.
		}
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			sum += array[i];
		}
		System.out.println("100���� ���� ������ ��հ��� " + sum / 100 + "�Դϴ�.");
	}

}
