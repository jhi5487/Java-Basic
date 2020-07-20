
/* 100개의 랜덤 정수의 평균 */

public class Main {

	public static void main(String[] args) {
		
		int [] array = new int[100];
		for(int i = 0 ; i < 100; i++) {
			array[i] = (int) (Math.random() * 100 + 1); // random은 0이상 1미만의 값. 따라서 1이상 100이하의 숫자를 배열에 넣는것.
		}
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			sum += array[i];
		}
		System.out.println("100개의 랜덤 정수의 평균값은 " + sum / 100 + "입니다.");
	}

}
