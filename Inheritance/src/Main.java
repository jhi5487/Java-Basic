import java.util.Scanner;

/* ��ü������ ���� - ��� */
public class Main {

	public static void main(String[] args) {
		
		// �л�
		Scanner scan = new Scanner(System.in);
		System.out.print("�� ����� �л��� �����մϱ�? ");
		int number = scan.nextInt();
		Student [] students = new Student[number];
		
		for(int i = 0; i < number; i++) {
			String name;
			int age;
			int height;
			int weight;
			String studentID;
			int grade;
			double gPA;
			System.out.print("�л��� �̸��� �Է��ϼ���: ");
			name = scan.next();
			System.out.print("�л��� ���̸� �Է��ϼ���: ");
			age = scan.nextInt();
			System.out.print("�л��� Ű�� �Է��ϼ���: ");
			height = scan.nextInt();
			System.out.print("�л��� �����Ը� �Է��ϼ���: ");
			weight = scan.nextInt();
			System.out.print("�л��� �й��� �Է��ϼ���: ");
			studentID = scan.next();
			System.out.print("�л��� �г��� �Է��ϼ���: ");
			grade = scan.nextInt();
			System.out.print("�л��� ������ �Է��ϼ���: ");
			gPA = scan.nextDouble();
			students[i] = new Student(name, age, height, weight, studentID, grade, gPA);
		}
		scan.close();
		
		for(int i = 0; i < number; i++) {
			students[i].show();
		}
		
		// ������
		Teacher teacher1 = new Teacher("John Park", 50, 170, 70, "ABC532", 3000000, 5);
		teacher1.show();
		
	}

}
