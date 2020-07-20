/* 이차원 배열 만들기 */
public class Main {

	public static void main(String[] args) {
		
		int N = 10; // 행, 열의 길이
		int[][] array = new int[N][N]; // 이차원 형태의 배열
		for(int i = 0 ; i < N; i++) {  // 행 
			for(int j = 0 ; j < N; j++) { // 열
				array[i][j] = (int)(Math.random() * 10); // 0 ~ 9 사이의 랜덤 수
			}
		}
		for(int i = 0 ; i < N; i++) {  // 행 
			for(int j = 0 ; j < N; j++) { // 열
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
