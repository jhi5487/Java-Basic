// �׻� ������Ʈ�� ��ӹ���
public class Archer {
	String name;
	String power;
	
	public Archer(String name, String power) {
		this.name = name;
		this.power = power;
	}
	
	public boolean equals(Object obj) { // �� ���� ���� ���ϴ� �޼���
		Archer temp = (Archer) obj; // ���� ������Ʈ�� archer���·� �ٲ�.
		if(name == temp.name && power == temp.power)
			return true;
		
		else
			return false;
	}
}
