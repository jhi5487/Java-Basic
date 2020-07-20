import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner; // 입출력 가능하게 하는 라이브러리 import

public class Main {

	public static void main(String[] args) {
		
		/* 정수 입력받아 출력 */
		Scanner sc = new Scanner(System.in); // System.in은 콘솔창에서 입력하는 데이터
		System.out.print("정수를 입력하세요: ");
		int i = sc.nextInt(); // 사용자가 입력한 정수를 i에 저장
		System.out.println("입력된 정수는 " + i + "입니다.");
		sc.close(); // 안정적으로 종료
		
		/* 파일 입출력 */
		File file = new File("input.txt"); //File 클래스의 file변수
		try {
			Scanner sc2 = new Scanner(file); // file에 쓰인 변수를 읽어옴.
			while(sc2.hasNextInt()) // 다음으로 읽을 정수가 있을 때
			{
				System.out.println(sc2.nextInt() * 100); // 정수를 읽어 100 곱해 출력
			}
			sc2.close(); // 스캐너 함수 종료
		} catch (FileNotFoundException e) {
			System.out.println("파일을 읽어오는 도중에 오류가 발생했습니다."); // file이 없을 시 예외구문
		}
	}

}
