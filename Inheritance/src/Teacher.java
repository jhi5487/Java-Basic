
public class Teacher extends Person {
	
	private String teacherID;
	private int monthSalary;
	private int workedYear;
	
	public String getTeacherID() {
		return teacherID;
	}
	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}
	public int getMonthSalary() {
		return monthSalary;
	}
	public void setMonthSalary(int monthSalary) {
		this.monthSalary = monthSalary;
	}
	public int getWorkedYear() {
		return workedYear;
	}
	public void setWorkedYear(int workedYear) {
		this.workedYear = workedYear;
	}
	
	public Teacher(String name, int age, int weight, int height, String teacherID, int monthSalary, int workedYear) {
		super(name, age, weight, height);
		this.teacherID = teacherID;
		this.monthSalary = monthSalary;
		this.workedYear = workedYear;
	}
	
	public void show() {
		System.out.println("----------------------------");
		System.out.println("교사 이름: " + getName()); // 각 변수의 값을 불러오는 get함수
		System.out.println("교사 나이: " + getAge());
		System.out.println("교사 키: " + getHeight());
		System.out.println("교사 몸무게: " + getWeight());
		System.out.println("교직원 번호: " + getTeacherID());
		System.out.println("월급: " + getMonthSalary());
		System.out.println("연차: " + getWorkedYear());
	}
}
