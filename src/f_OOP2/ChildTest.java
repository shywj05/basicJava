package f_OOP2;

public class ChildTest {
	public static void main(String[] args) {

		Child ch = new Child();

		ch.volume = 10;
		System.out.println(ch.volume); // 예상결과 볼륨 : 10

		ch.volumeUp();
		System.out.println(ch.volume); // 예상결과 볼륨 : 11

		ch.channel = 15;
		System.out.println(ch.channel); // 예상결과 채널 : 15

		ch.channelUP();
		System.out.println(ch.channel); // 예상결과 채널 : 16

	}
}

class Parent {
	int channel;

	void channelUP() {
		channel++;
	}

}

class Child extends Parent {
	int volume;
	int channel;

	void volumeUp() {
		volume++;
	}

}
