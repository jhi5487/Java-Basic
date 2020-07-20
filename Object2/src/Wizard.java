
public class Wizard extends Hero {
	
	public Wizard(String name) {
		super(name); // 부모 클래스의 생성자가 가지는 변수 초기화
	}
	
	public void freezing() {
		System.out.println("얼리기!");
	}
	
}
