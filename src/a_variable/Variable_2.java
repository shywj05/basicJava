package a_variable;

public class Variable_2 {
	public static void main(String[] args){
		/*
		변수의 타입
		
		1.기본형 타입,primitive type> 글자 하나 숫자 논리
		 -boolean, char, byte, short, int, long, float, double
		 		 
		2.참조형 타입,reference type>
		 -주소를 저장한다
		 
		3.기본형 변수의 종류
		  -논리형 : boolean
		  -문자형 : char
		  -정수형 : byte   short   int    long
		  -실수형 : float double(대표자료형)
		  
		4.기본형 변수의 크기
		  -1byte : boolean, byte
		  -2byte : char, short
		  -4byte : int, float
		  -8byte : long, double
		  
		5.논리형 - boolean : 기본값 false
		  - boolean 변수에는 true, false값만 저장할 수 있다
		  - boolean 변수는 대답 (yes/no), 스위치(on/off)등 논리구조에 주로 사용된다
			
		 */
		
		//1. 변수 power를 선언하고 true의 값으로 초기화 하여라
		boolean power = true; //타입+명 : 선언, 타입+명=값 : 초기화
		
		
		System.out.println(power);
		
		/*
		6.문자형 - char
		  - 문자하나를 저장하는 용도
		  - java는 unicode문자체계이용 16진수
		  - 빈공간도 한 글자로 인식한다
		 */
		//1. 자신의 성을 변수 sung에 저장해 주세요
		char sung ='A';
		char sung1 = 65;
		char sung2 = '\u0041'; //대문자 'A'를 나타내는 방식 ㄴ유니코드 사용
		
		System.out.println(sung);
		System.out.println(sung1);
		System.out.println(sung2);
		
		/*
		7.정수형 - byte, short, int, long
		  - 기본자료형 : int
		  - 저장하려는 정수값의 크기에 따라 4개의 정수형 중 하나 선택
		  - 
		*/
		//1.변수 b2에 50의 값을 저장해주세요
		byte b2 = 50;
		//2.변수 s2에 32000의 값을 저장해주세요
		short s2 = 32000;
		//3.변수 i2에 40만의 값을 저장해주세요
		int i2 = 400000;
		//4.변수 l2에 100억의 값을 저장해주세요
		long l2 = 10000000000L;
		
		int i = 50;
		long ip2 = i;
		System.out.println(i);
		
		/*
		8.실수형 - float(소수점7자리), double(소수점13자리)
		  - 기본 자료형은 double이다.(float이 계산이 더 편하다)
		  - 자료형을 선택할 때 크기도 중요하지만!! 정밀도가 더 중요하다(소수점 자리 때문에)
		  - float -> 1(부호의미):8:32(32bit)
		  - double -> 1(부호의미):11:52(64bit)
		  
		 */
		
		//1. float 타입 변수 f1에 3.141592342355456의 값을 저장해주세요
			float f1 = 3.141592342355456F;
			System.out.println(f1);
		//2. double 타입 변수 d1에 3.141592342355456의 값을 저장해주세요
			double d1 = 3.1415923423554561231254256;
			System.out.println(d1);
		/*
		9. String 문자열 이기 때문에 첫글자 대문자
		   - 문자열을 다루기 위해 만들어진 class이다 
		
		
		 */
		String name = "=======----\n----";
		System.out.println(name);
//		\다음 문자는 /u 유니코드 처럼 특수문자로 인식한다
//		특수문자 넣을 수 있는데 \는 안들어가진다
//		t 탭 만큼 띄워라
//		n new line 이다
//		String은 "" 이것도 된다
//		null 주소 자체가 없다는 것, "" 주소는 있는데 아무도 없어
		
		int i3 = 20;
		String str = "3";
		
		String result = i3 + str;
		// int + String => String + String => String
		// 20 + "3" => "20" + "3" => "203"
		System.out.println(result);
		
		
		
		
		
		
		/*
		10. overflow
		    - 변수가 자신의 저장할 수 있는 범위를 넘었을 때 최솟값부터 다시 표현
		 */

		byte b3 = 126;
		System.out.println("b3의 값은 : "+b3);
		
		b3++;
		
		System.out.println(b3);
		
		b3++;
		
		System.out.println(b3);
//		값 저장 크기를 벗어나면 최솟값으로 돌아간다 = 이게 overflow
		
		/*
		11. 캐스팅(casting)
		    - 변수 또는 리터럴(값 자체)의 타입을 다른 타입으로 변환하는 것이다.
		    - 작성방법
		      (type)피연산자
		    
		 */
		char c = 'a';
		int ii = (int) c;
		//값의 크기가 포함되기 때문에 타입 생략해도 가능
		System.out.println("char을 int 타입으로 뽑은 " + ii);
		
		byte bb = (byte) ii;
		System.out.println("int 타입을 byte 타입으로 뽑은 "+ii);
		
		
		
		
		
		
	}
}
