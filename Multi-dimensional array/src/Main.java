/* ������ �迭 ����� */
public class Main {

	public static void main(String[] args) {
		
		int N = 10; // ��, ���� ����
		int[][] array = new int[N][N]; // ������ ������ �迭
		for(int i = 0 ; i < N; i++) {  // �� 
			for(int j = 0 ; j < N; j++) { // ��
				array[i][j] = (int)(Math.random() * 10); // 0 ~ 9 ������ ���� ��
			}
		}
		for(int i = 0 ; i < N; i++) {  // �� 
			for(int j = 0 ; j < N; j++) { // ��
				System.out.print(array[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
