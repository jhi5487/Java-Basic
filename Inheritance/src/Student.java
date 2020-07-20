
public class Student extends Person { // PersonŬ������ ��� �ްڴ�
	
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

	// ������(��ӹ��� ���� ���� �ʱ�ȭ)
	public Student(String name, int age, int weight, int height, String studentID, int grade, double gPA) {
		super(name, age, weight, height);
		this.studentID = studentID;
		this.grade = grade;
		GPA = gPA;
	}
	
	public void show() {
		System.out.println("----------------------------");
		System.out.println("�л� �̸�: " + getName()); // �� ������ ���� �ҷ����� get�Լ�
		System.out.println("�л� ����: " + getAge());
		System.out.println("�л� Ű: " + getHeight());
		System.out.println("�л� ������: " + getWeight());
		System.out.println("�й�: " + getStudentID());
		System.out.println("�г�: " + getGrade());
		System.out.println("����: " + getGPA());
	}
	
}
