// ������ - �θ� Ŭ���� Ÿ���� ���� ������ ���� Ŭ������ ��ü�� ������ �� �ְ� ���ش�.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���: 1, ������: 2 ? ");
		int input = scanner.nextInt();
		scanner.close();
		Fruit fruit;
		if(input == 1) {
			fruit = new Apple(); // �ڽ� Ŭ���� �ν��Ͻ��� ������ ���� �� ����.
			fruit.show();
		}
		else if(input == 2) {
			fruit = new Orange(); // �ڽ� Ŭ���� �ν��Ͻ��� ������ ���� �� ����.
			fruit.show();
		}
		
	}

}
