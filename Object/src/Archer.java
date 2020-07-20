// 항상 오브젝트를 상속받음
public class Archer {
	String name;
	String power;
	
	public Archer(String name, String power) {
		this.name = name;
		this.power = power;
	}
	
	public boolean equals(Object obj) { // 두 가지 값을 비교하는 메서드
		Archer temp = (Archer) obj; // 들어온 오브젝트를 archer형태로 바꿈.
		if(name == temp.name && power == temp.power)
			return true;
		
		else
			return false;
	}
}
