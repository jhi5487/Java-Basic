
public class Student extends Person { // Person클래스를 상속 받겠다
	
	private String studentID;
	private int grade;
	private double GPA;
	
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	// 생성자(상속받은 변수 또한 초기화)
	public Student(String name, int age, int weight, int height, String studentID, int grade, double gPA) {
		super(name, age, weight, height);
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}
	
	public void show() {
		System.out.println("----------------------------");
		System.out.println("학생 이름: " + getName()); // 각 변수의 값을 불러오는 get함수
		System.out.println("학생 나이: " + getAge());
		System.out.println("학생 키: " + getHeight());
		System.out.println("학생 몸무게: " + getWeight());
		System.out.println("학번: " + getStudentID());
		System.out.println("학년: " + getGrade());
		System.out.println("학점: " + getGPA());
	}
	
}
