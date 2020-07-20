
public class Main {
	
	/* 숫자의 k번째 약수 찾기 */
	public static int function(int number, int k) {
		for(int i = 1; i <= number; i++)
		{
			if(number % i == 0)
				{
					k--; // 약수를 찾으면 k 감소
					if(k == 0) return i; // k가 0이 될 때의 i가 k번째 약수
				}
		}
		return -1; // k번째 약수가 없다면 -1 반환
	}
	
	public static void main(String[] args) {
		int result = function(3000, 10);
		if(result == -1) 
			System.out.println("3000의 10번째 약수는 없습니다.");
		else 
			System.out.println("3000의 10번째 약수는" + result + "입니다.");

	}

}
