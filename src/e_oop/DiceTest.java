package e_oop;

public class DiceTest {
	public static void main(String[] args) {
		// 2. throwDice메서드를 호출
		DoubleDice dd = new DoubleDice();
		int sum = dd.throwDice();

		System.out.println(sum + "칸 이동하세요!");

		// 3. JVM 3-3, 4-4, 3-1 나온거 그리기

	}
}

class DoubleDice {

	// 1. 주사위 두개를 던지는 throwDice 메서드 만들기
	// 주사위 두개 던져서 그 합을 반환하는 ... 단 두개의 주사위가 같으면 한 번 더 던진다

	
	int throwDice() {

		int a = (int) (Math.random() * 6 + 1);
		int b = (int) (Math.random() * 6 + 1);

		int sum = a + b;

		System.out.println("첫 번째 주사위 : " + a);
		System.out.println("두 번째 주사위 : " + b);

		if (a == b) {
			System.out.println("와 더블! 한 번 더!");
			return sum + throwDice();
		} 
		return sum;
	}
}
