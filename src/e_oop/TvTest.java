package e_oop;

public class TvTest {//tv test가 호출된다
	public static void main(String[] args) {//main 메서드 호출
		// 클래스 변수 : 클래스명.변수명
		System.out.println(Tv.color);//

		//내가 직접 바꾼거고
		Tv.color = "red";
		System.out.println(Tv.color);
		
		//메서드 일시킨거고
		Tv.changeColor();
		System.out.println(Tv.color);
		
		
		//===================여기까지 클래스 친구들 부르는 것============//클래스 인지 인스터스 친구인지 확인
		
		Tv t = new Tv(); //인스턴스화, 인스터스생성 \\ 메인메서드의 지역변수 t가 선언됨
		//인스터스는 힙 영역에 
		//t의 주소
		
		//인스터스 친구들 접급
		//참조변수명.변수명
		System.out.println(t.power);//t의 주소에 가면 파워에 들어있는거 출력해라
		
		t.power();
		System.out.println(t.power);
		
		//1. tv의 채널을 15번을 바꿔주세요
		t.channel = 15;
		System.out.println(t.channel);		
		
		//2. tv의  채널을 하나 증가시켜주세요
		t.channelUp();
		System.out.println(t.channel);
		
		
		
		
	}
}

class Tv {

	// 멤버변수(전역변수)
	static String color;// 색상 - static이 붙어서 class변수

	boolean power;// 전원 - 인스터스변수

	int channel;// 채널 - 인스터스변수

	// 클래스메서드
	static void changeColor() {
		color = "black";

	}

	// 인스턴스메서드
	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

}