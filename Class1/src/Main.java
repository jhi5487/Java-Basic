/* 두 점의 중점 좌표 출력 */

public class Main {

	public static void main(String[] args) {

		Node one = new Node (1, 20);
		Node two = new Node (31, 10);
		Node result = one.getCenter(two);
		System.out.println("x: " + result.getX() + ", y: " + result.getY());

	}

}
