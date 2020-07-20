
public class Person {
	
	private String name;
	private int age;
	private int weight;
	private int height;
	
	// Source - Generate Getters and Setters, get변수와 set변수를 한번에 만들 수 있음.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	// Source - Generate Constructor using Fields, 생성자: 하나의 인스턴스를 만들 때 한번에 초기화해주는 함수
	public Person(String name, int age, int weight, int height) {
		super(); // 부모클래스에 생성자 실행
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	
}
