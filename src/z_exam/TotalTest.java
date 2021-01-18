package z_exam;

public class TotalTest {//TotalTest라는 이름을 가진 class를 MethodArea에 로드시킨다. 이때 클래스멤버변수인 클래스변수와 클래스 메서드를 확인해서 같이 로드시킨다

		public static void main(String[] args) {//로드 된 class에 클래스메서드인 main메서드를 로드시킵니다.

			TvMaker.color = "Blue"; //대입연산자를 먼저 읽고 왼쪽 부터 TvMaker클래스의 로드여부를 확인합니다. TvMaker클래스가 로드 되고 그 안에 멤버변수를 확인합니다.
			//static String color변수와 int inch가 멤버변수로 로드가 되면서 초기값(null,0)으로 초기화가 됩니다. 그 후 color라는 클래스변수에 문자열 형태인 Blue를 대입합니다.
									  
			TvMaker tm = new TvMaker();//인스턴스를 만들어주기 위해 인스터스화를 진행합니다. TvMaker(클래스명) tm(변수명) = new TvMaker(생성자); 의 형식으로 만들어주며
			//이미 로드된 TvMaker의 참조변수이자 main메서드의 지역변수 tm을 new(만들어)해주고 tm의 주소 안에 멤버변수(인스턴스 변수, 인스턴스 메서드)를 확인합니다.
			//TvMaker클래스에 가서 String name = ""; int age(초기값 0); TvMaker(), 	TvMaker(String name, int age)를 로드시킵니다.
			//그 후 TvMaker의 생성자를 CallStack영역에 로드시켜줍니다.
			//TvMaker 기본형 생성자의 메서드를 실행합니다. this를 통해 TvMaker(str,int)의 매개변수를 가지고 있는 생성자를 오버로딩해줍니다. 이때 CallStack영역에 로드시킵니다.
			//인자값으로 "man"과 25를 대입합니다. 초기값이었던 인스턴스 변수 name과 age를 man과 25로 변경해주고  일을 마치고 콜스택에서 삭제
			//수행중이었던 TvMaker()로 다시 돌아와 {}를 만났기 때문에 이 또한 콜스택에서 삭제시켜줍니다.
			//tm의 주소를 main()의 지역변수 tm에 참조시켜줍니다.
			
			tm.age = 30; //대입연산자, 왼쪽부터 tm의 주소 안에 있는 age의 값 초기값 0에 30을 대입해줍니다.
			// 3. 메서드 호출
			// 3.1
			System.out.println(TvControll.channel);//출력구문, TvControll 클래스가 로드가 안 되었기 때문에 로드시켜주고 멤버변수를 찾습니다.
			//멤버변수로는 static final int MAX_CHANNEL = 50; static final int MIN_CHANNEL = 1; static int channel = 15; static int volumeDown()을 로드시킵니다.
			//TvControll 클래스 안에 있는 클래스변수 static int channel = 15;를 출력합니다.
			
			
			TvControll.volumeDown();//TvControll안에 있는 클래스 변수 volumeDown()를 콜스택영역에 로드시킵니다.
			//매개변수를 확인하니 없고 계속 진행하여 if 조건문을 시행합니다. 
			//만약 인스턴스변수 int volume = 99;와 TvControll클래스안에 인스턴스 변수 final int MAX_VOLUME = 100;이 다르기 때문에 else에서  volume++된 값을 리턴해줍니다
			System.out.println(TvControll.channel);
			//TvControll클래스 안에서의 channel값인  static int channel = 15를 출력합니다.

			// 3.2
			TvControll tc; //TvControll클래스의 참조변수 tc라는 이름의 변수를 선언합니다.
			tc = new TvControll(); //main()안에 지역변수 tc를 로드시키고 멤버변수를 찾습니다.
			//final int MAX_VOLUME = 100; final int MIN_VOLUME = 0; int volume = 99; int volumeUp()을 tc의 주소에  new(생성)합니다.
			//TvControll()를 콜스택 영역에 로드시키고 실행합니다.
			//따로 생성자를 만들어 주지 않았기 때문에 컴파일러가 TvControll()의 기본형으로 알아서 생성해주고 tc의 주소를 main()의 지역변수인 tc에 참조시켜줍니다.
			
			
			System.out.println(tc.volume);//출력구문, tc의 주소에 있는 int volume = 99;를 출력해줍니다.
			tc.volumeUp();//tc의 주소에 있는 volumeUp()를 콜스택영역에 로드시킵니다.
			//매개변수가 없음을 확인하고 실행합니다. if문을 실행합니다. final int MAX_VOLUME = 100;이 다르기 때문에 else에서  volume++실행하고 반환해줍니다.
			//volumeUp()을 콜스택에서 삭제
			
			System.out.println(tc.volume);//위에서 반환된 값을 출력합니다.
			tc.volumeUp();//tc주소에 서 volumeUp()를 콜스택에 로드시킵니다.
			//if문에서 volume == MAX_VOLUME이기 때문에 volume = MIN_VOLUME을 실행하고  volume값을 리턴합니다.
			System.out.println(tc.volume);
			//volume의 값을 출력합니다.

			//
			Calc cc = new Calc();//Calc클래스를 로드시킵니다. 멤버변수를 같이 로드시킵니다.
			//메인 메서드에 cc의 지역변수를 로드시킵니다.ㅍ
			System.out.println(cc.add(Integer.MAX_VALUE, 4));
			System.out.println(cc.add(3L, Integer.MAX_VALUE));

		}
	}

	class TvMaker {
		// 1.
		// 1.1
		static String color;
		static int inch;
		// 1.2
		String name = "";
		int age;

		// 2.
		// 2.1
		TvMaker() {
			this("man", 25);
		}

		// 2.2
		TvMaker(String name, int age) {
			this.name = name;
			this.age = age;
		}
	}

	class TvControll {
		final int MAX_VOLUME = 100;
		final int MIN_VOLUME = 0;
		static final int MAX_CHANNEL = 50;
		static final int MIN_CHANNEL = 1;

		static int channel = 15;
		int volume = 99;

		// 4. return문
		int volumeUp() {
			if (volume == MAX_VOLUME) {
				volume = MIN_VOLUME;
			} else {
				volume++;
			}

			return volume;
		}

		static int volumeDown() {
			if (channel == MAX_CHANNEL) {
				channel = MIN_CHANNEL;
			} else {
				channel++;
			}
			return channel;
		}
	}

	class Calc {
		// 5.
		int add(int a, int b) {
			return a + b;
		}

		long add(long a, int b) {
			return a + b;
		}

		int minus(int a, int b) {
			return a + b;
		}
	}
