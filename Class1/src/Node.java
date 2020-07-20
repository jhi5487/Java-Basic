// Node 클래스 정의
public class Node {
	
	// private은 외부에서 접근 해 바꿀 수 없는 형태
	private int x; // x좌표
	private int y; // y좌표
	
	// 외부에서 접근할 수 있도록
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x; //매개변수로 넘어온 값으로 변수의 값을 바꿈
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y; 
	}
	
	// 생성자 - 객체를 만들 때 자동으로 값을 초기화
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// 다른 노드와 비교해 중점 노드를 반환
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}
	
}
