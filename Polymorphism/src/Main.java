// 다형성 - 부모 클래스 타입의 참조 변수로 하위 클래스의 객체를 참조할 수 있게 해준다.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("사과: 1, 오렌지: 2 ? ");
		int input = scanner.nextInt();
		scanner.close();
		Fruit fruit;
		if(input == 1) {
			fruit = new Apple(); // 자식 클래스 인스턴스를 변수로 넣을 수 있음.
			fruit.show();
		}
		else if(input == 2) {
			fruit = new Orange(); // 자식 클래스 인스턴스를 변수로 넣을 수 있음.
			fruit.show();
		}
		
	}

}
