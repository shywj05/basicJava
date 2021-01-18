package f_OOP2;

public class AbstractTest_01 {//모든게 같은 방식을 가지고 있지만 그 각각의 방식들이 다를 때 abstract를 쓴다 게임에서 이동하는 애들 처럼 
	public static void main(String[] args) {

			
		
	}
}

abstract class Unit {
	int x;
	int y;

	abstract void move(int x, int y);// 다 이동하지만 각각 이동하는게 다를때

	void stop() {// 어디서 멈추는 건 없으니까 그냥 메서드로

	}

}

abstract class Marine extends Unit {
	void stimPack() {

	}

	@Override
	void move(int x, int y) {//이동하지만 부모처럼 하기 싫어!그래서 내맘대로 움직일 거야 해서 오버라이드 통해서 무브를 추가한거지

	}
}

class Tank extends Unit {
	void change() {

	}

	@Override
	void move(int x, int y) {

	}

}

class DropShip extends Unit {
	void load() {

	}

	void unload() {

	}

	@Override
	void move(int x, int y) {

	}
}
