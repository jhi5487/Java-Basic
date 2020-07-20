
// 추상 클래스 - 직접적으로 객체 인스턴스를 생성할 수는 없지만,  
// 어느 정도 미리 설계로서 틀을 갖추고 클래스를 작성할 수 있게 한다는 기능적 측면에 의미가 있다.

abstract class Player {
	
	// 추상 메서드
	abstract void play(String songName); // 곡 실행
	abstract void pause(); // 곡 일시정지
	abstract void stop(); // 곡 중지
	
}
