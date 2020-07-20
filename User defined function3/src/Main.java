
public class Main {
	
	/* 문자열의 마지막 문자 반환*/
	public static char function(String input) {
		return input.charAt(input.length() - 1); // String의 내부함수, charAt = 문자를 뽑아오는 함수.(인덱스 0부터 시작)
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello world의 마지막 문자는 " + function("Hellow world"));

	}

}
