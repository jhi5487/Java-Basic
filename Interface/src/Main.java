
// Interface(������ ����): �������̽� ��� �� ���� ��� ���� ����. ������ ���ǵ� �߻� �޼ҵ�� ����� ���� �� ����.

public class Main implements Dog, Cat { // ���� ��� ����

	public static void main(String[] args) {
		
		Main main = new Main();
		main.crying();
		main.one();
		main.two();
		
	}
	// �����ߴ� ��� �޼��带 ��������� ��.
	@Override
	public void crying() {
		
		System.out.println("Bow - Wow!");
	}

	@Override
	public void one() {
		
		System.out.println("One!");
		
	}

	@Override
	public void two() {
		
		System.out.println("Two!");
		
	}

}
