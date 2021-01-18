package e_oop;

public class CardTest {
	public static void main(String[] args) {
	
//		1.Card클래스의 너비를 출력해
		System.out.println(Card.heigth);
		
//		2.Card 클래스의 높이 출력
		System.out.println(Card.width);
		
//		3.Card 클래스의 객체를 만들어주세요(cd1) -- 인스턴스화를 시키고 인스턴스가 되니까
		Card cd1 = new Card();//card 클래스에 card 인스턴스
		
//		4.cd1의 문양을 Heart로 변경해주세요
		cd1.kind = "heart";
		
//		5.cd1의 숫자를 7로 변경
		cd1.number = 7;
		
//		6.Card 클래스의 객체를 만들어주세요(cd2)
		Card cd2 = new Card();
		
//		7.cd2의 문양을 Spade로 변경해주세요
		cd2.kind = "spade";
		
//		8.cd2의 숫자를 3로 변경
		cd2.number = 3;
//		9.아래와 같이 출력해주세요
		//cd1의 모양 : xx, 숫자 : xx, 너비 : xx, 높이 : xx;
		System.out.println("cd1의 모양 : " + cd1.kind + "숫자 : " + cd1.number + "높이 : " + cd1.heigth + "너비 : " + cd1.width);
		
		//cd2의 모양 : xx, 숫자 : xx, 너비 : xx, 높이 : xx;
		System.out.println("cd2의 모양 : " + cd2.kind + "숫자 : " + cd2.number + "높이 : " + cd2.heigth + "너비 : " + cd2.width);
		
//		10.cd1의 너비를 70으로 변경
		cd1.width = 70;
		
//		11.cd1읜 높이를 90으로 변경
		cd1.heigth = 90;
		
//		12.아래와 같이 출려
//		cd1의 모양 : xx, 숫자 : xx, 너비 : xx, 높이 : xx;
		System.out.println("cd1의 모양 : " + cd1.kind + "숫자 : " + cd1.number + "높이 : " + cd1.heigth + "너비 : " + cd1.width);
		
//		cd2의 모양 : xx, 숫자 : xx, 너비 : xx, 높이 : xx;
		System.out.println("cd2의 모양 : " + cd2.kind + "숫자 : " + cd2.number + "높이 : " + cd2.heigth + "너비 : " + cd2.width);
	
	
	
	}

}


class Card{
	//인스턴스 변수
	String kind; //문양	
	int number; //숫자

	//여러개 만들어도 공통적 요소는 클래스 변수
	static int width = 100;
	static int heigth = 250;
	
	void method(){
		int v = 3; //지역변수
	}
		static void method2(){
			
	}
	
}
