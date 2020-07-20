
public class Person {
	
	private String name;
	private int age;
	private int weight;
	private int height;
	
	// Source - Generate Getters and Setters, get������ set������ �ѹ��� ���� �� ����.
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
	
	// Source - Generate Constructor using Fields, ������: �ϳ��� �ν��Ͻ��� ���� �� �ѹ��� �ʱ�ȭ���ִ� �Լ�
	public Person(String name, int age, int weight, int height) {
		super(); // �θ�Ŭ������ ������ ����
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
	
	
}
