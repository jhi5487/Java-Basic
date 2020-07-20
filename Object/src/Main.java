
public class Main {

	public static void main(String[] args) {

		Archer archer1 = new Archer("궁수1", "상");
		Archer archer2 = new Archer("궁수1", "상");
		System.out.println(archer1 == archer2); // 두 개의 인스턴스는 다름. false 반환
		System.out.println(archer1.equals(archer2)); // 인스턴스가 갖는 값이 같은가?
	}

}
