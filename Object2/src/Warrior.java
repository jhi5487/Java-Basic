
public class Warrior extends Hero {
	
	public Warrior(String name) {
		super(name); // 부모 클래스의 생성자가 가지는 변수 초기화
	}
	
	public void cutting() {
		System.out.println("가르기!");
	}
	
}
