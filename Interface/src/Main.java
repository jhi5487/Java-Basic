
// Interface(설계의 본질): 인터페이스 사용 시 다중 상속 구현 가능. 사전에 정의된 추상 메소드와 상수만 가질 수 있음.

public class Main implements Dog, Cat { // 다중 상속 가능

	public static void main(String[] args) {
		
		Main main = new Main();
		main.crying();
		main.one();
		main.two();
		
	}
	// 설계했던 모든 메서드를 구현해줘야 함.
	@Override
	public void crying() {
		
		System.out.println("Bow - Wow!");
	}

	@Override
	public void one() {
		
		System.out.println("One!");
		
	}

	@Override
	public void two() {
		
		System.out.println("Two!");
		
	}

}
