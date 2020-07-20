
public class Main {

	public static void main(String[] args) {
		
		/* 특정 문자열을 포함하는지 확인하는 If문 */
		String a = "I Love You.";
		if(a.contains("Love")) // 특정 문자열을 포함하는지 검사
		{
			// 참인 경우
			System.out.println("Me too.");
		}
		else
		{
			// 거짓인 경우
			System.out.println("I don't like you.");
		}
		
		
		/* 점수에 따른 학점 출력 */
		int score = 98;
		
		if(score >= 90)
		{
			System.out.println("A입니다.");
		}
		else if(score >= 80)
		{
			System.out.println("B입니다.");
		}
		else if(score >= 70)
		{
			System.out.println("C입니다.");
		}
		else
		{
			System.out.println("F입니다.");
		}	
		
		
		/* 문자열과 정수형 조건문 */
		String c = "Man";
		int d = 3;
		
		if(c.equals("Man")) // string 비교 시 equal()이라는 내부함수 이용. string은 class기반 자료형이기 때문
		{ 
			System.out.println("남자입니다.");
		}
		if(c.equalsIgnoreCase("man")) // 대소문자 상관없이 같은지 비교
		{
			System.out.println("남자입니다.");
		}
		
		if(d == 3)
		{
			System.out.println("d는 3입니다.");
		}
		else
		{
			System.out.println("d는 3이 아닙니다.");
		}
	}

}
