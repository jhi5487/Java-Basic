
public class Main {
	
	/* ���ڿ��� ������ ���� ��ȯ*/
	public static char function(String input) {
		return input.charAt(input.length() - 1); // String�� �����Լ�, charAt = ���ڸ� �̾ƿ��� �Լ�.(�ε��� 0���� ����)
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hello world�� ������ ���ڴ� " + function("Hellow world"));

	}

}
