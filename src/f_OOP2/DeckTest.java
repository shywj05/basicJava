package f_OOP2;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import e_oop.CardTest;

public class DeckTest {
	public static void main(String[] args) {

		// //c1기본생성자 SPADE, A
		// Card c1 = new Card();
		// System.out.println(c1.toString());
		//
		// //c2 매개변수 두개 DIAMOND, 5
		// Card c2 = new Card(2,5);
		// System.out.println(c2.toString());

		// 8. 카드 한벌을 만들어주세요 변수명 d
		Deck d = new Deck();
		System.out.println(Arrays.toString(d.c));

		// 9. d에서 0번째 카드를 가져오세요 메서드 활용

		System.out.println(d.pick(0));

		// 10. d에서 임의의 카드를 한장 꺼내주세요 메서드 활용
		System.out.println(d.pick((int) (Math.random() * 52)));

		// 11. d를 섞어주세요 - 셔플 첫 번째 것 활용
		d.shuffle();

		// 11.5 d에서 0번째 카드를 가져오세요 메서드 활용
		
		Card result = d.pick(0);
		System.out.println(result);

		// 12. d를 1000번 섞어주세요 - 셔플 두 번째 것 활용
		d.shuffle(1000);

		// 12.5 d에서 0번째 카드를 가져오세요 메서드 활용
		Card result2 = d.pick(0);
		System.out.println(result2);

		// 13. JVM 그려오기

	}
}

class Card {
	static final int KIND_MAX = 4;// 카드 무늬수
	static final int NUM_MAX = 13;// 무늬별 카드 수 52장

	static final int SPADE = 1;
	static final int DIAMOND = 2;
	static final int HEARD = 3;
	static final int CLOVER = 4;

	int kind;
	int number;

	// 매개변수 두개 생성자
	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	// 기본생성자 매개변수 두개 호출하고 1로 초기화
	Card() {
		this(SPADE, 1);
	}

	@Override
	public String toString() {// object클래스 것을 오버라이드 해서 쓰는 거다

		String kind = "";
		String number = "";

		switch (this.kind) {
		case 1:
			kind = "SPADE";
			break;
		case 2:
			kind = "DIAMOND";
			break;
		case 3:
			kind = "HEART";
			break;
		default:
			kind = "CLOVER";
			break;
		}

		switch (this.number) {
		case 1:
			number = "A";
			break;
		case 11:
			number = "J";
			break;
		case 12:
			number = "Q";
			break;
		case 13:
			number = "K";
			break;
		default:
			// number = "" + this.number;
			number += this.number;
			break;
		}

		return kind + " : " + number;

	}

}

class Deck {

	// 1. 카드의 수량을 저장할 수 있는 변수 CARD_NUM을 Card클래스의 상수를 이용해 초기화 하세요 52장이 저장되야 한대
	static final int CARD_NUM = Card.NUM_MAX * Card.KIND_MAX;

	// 2. 카드를 CARD_NUM만큼 저장해주세요 변수명 c
	Card[] c = new Card[CARD_NUM]; // 1~52개 조합은 1

	// 3. 기본생성자를 만들어주세요
	// 단, 기본생성자 내 c의 모든 방을 카드로 채워주세요 1,1 => 4,13 까지 있어야돼
	
	Deck() {
		// 한 줄로 할 수 있다고???? 가능한가?? 
		int num = 0;
		for (int i = 1; i < Card.KIND_MAX+1 ; i++) {
			for (int j = 1; j < Card.NUM_MAX+1; j++) {
				// 카드 종류랑 카드 숫자를 넣어야돼 카드 첫 번째 부터
				c[num] = new Card(i, j); // 0부터 51까지 숫자가 올라가야돼
				num++;
			}
		}
	}

	// 4. c에서 인자값으로 받은 번째방의 카드 한장을 반환해주세요 메서드명 pick
	Card pick(int a) { // 타입을 잘 지켜야 한다
		// 카드형식이 있고 c가 뭐야
		Card ca = c[a];

		return ca;
	}

	// 5. c에서 임의의 방번째 카드 한장을 반환해주세요 메서드명 pick
	// 단, 4번의 pick메서드를 활용해주세요
	Card pick() {
		Card cb = this.pick((int) (Math.random() * 52));
		// 메서드 호출 할 때
		return cb;
	}

	// 6. 카드를 섞어주세요 메서드명 shuffle
	// 단, 연습문제 5-6번을 활용해주세요
	void shuffle() {// 클래스로 만들면 안 바뀌니까 좋은건가? 반환값은 없어
		// 랜덤한 값으로 52개의 배열 중에서 뽑고...그거를 i번째 방이랑 자리를 바꾸고 또 바꾸고 이런식
		for (int i = 0; i < CARD_NUM; i++) {
			Card temp;
			int random = (int) (Math.random() * 52);
			temp = c[i];
			c[i] = c[random];
			c[random] = temp;
		}

	}

	// 7. 카드를 섞어주세요 메서드명 shuffle
	// 임의의 방의 카드와 또다른 임의의 방의 카드를 바꿔주세요
	// 인자값으로 받은 횟수만큼 반복해주세요
	void shuffle(int times) {
		for (int i = 0; i < times; i++) {
			int random1 = (int) (Math.random() * 52);
			int random2 = (int) (Math.random() * 52);
			Card temp;
			temp = c[random1];
			c[random1] = c[random2];
			c[random2] = temp;
		}
	}

}
