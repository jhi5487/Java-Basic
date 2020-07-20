// Node Ŭ���� ����
public class Node {
	
	// private�� �ܺο��� ���� �� �ٲ� �� ���� ����
	private int x; // x��ǥ
	private int y; // y��ǥ
	
	// �ܺο��� ������ �� �ֵ���
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x; //�Ű������� �Ѿ�� ������ ������ ���� �ٲ�
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y; 
	}
	
	// ������ - ��ü�� ���� �� �ڵ����� ���� �ʱ�ȭ
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// �ٸ� ���� ���� ���� ��带 ��ȯ
	public Node getCenter(Node other) {
		return new Node((this.x + other.getX()) / 2, (this.y + other.getY()) / 2);
	}
	
}
