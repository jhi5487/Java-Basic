import java.util.Scanner;

/* 배열 생성 및 최댓값을 구하는 함수*/
public class Main {

	public static int max(int a, int b)
	{
		return (a > b) ? a : b;
	}
		
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // 외부의 라이브러리를 가져옴
		System.out.print("생성할 배열의 크기를 입력하세요: "); // 배열의 크기를 입력받음
		int number = scanner.nextInt();
		int [] array = new int[number]; // 입력된 배열의 크기만큼 배열 생성
		for(int i = 0; i < number; i++)
		{
			System.out.print("배열에 입력할 양의 정수를 하나씩 입력하세요: ");
			array[i] = scanner.nextInt();
		}
		scanner.close();
		int result = -1;
		for(int i = 0; i < number; i++)
		{
			result = max(result, array[i]);
		}
		System.out.println("입력한 정수 중 가장 큰 수는 " + result + "입니다.");
	}

}
