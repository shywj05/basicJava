package z_exam;

public class Exam_02 {
	public static void main(String[] args) {
		/*
		2-1. 다음 표의 빈 칸에 8개의 기본형(primitive type)을 알 맞은 자리에 넣으세요
			크기 		1byte		2byte		4byte		8byte
			종류 		
			논리형	boolean
			
			문자형				char
			
			정수형	byte		short		int			long
			
			실수형							float		double
		
		 */
		/*
		2-2. 다음의 문장에서 리터럴, 변수, 상수, 키워드를 적으시오
			int i = 100; 
			long l = 1000L; 
			final float PI = 3.14F; 
			- 리터럴 : 100, 1000L, 3.14F
			- 변수 : i, l, PI
			- 키워드 : int, long, final float
			- 상수 : PI 
		 */
		/*
		2-3. 다음 중 기본형(primitive type)이 아닌 것은?
			1.int -- 기본형
			2.Byte -- 대문자.....ㅡㅡ;;
			3.double -- 기본형
			4.boolean -- 기본형
			
			Result 2. Byte 대문자라서 안돼
		 */
		/*
		2-4. 다음 문장들의 출력결과를 적으세요. 오류가 있는 문장의 경우, 괄호 안에 "오류"라고 적으시오
		*/
			System.out.println("첫번째 답 : " + "1" + "2");
			/*
			String + String = String
 			Result "1" + "2" = "12"
			*/
			
			System.out.println("두번째 답 : " + true + "");
			/*
			boolean + String = String
			String + String = String
			Result "true" ** String "" 이거는 주소(집)는 있지만 빈 공간(아무도 없는)이라는 뜻 : empty String
		 	*/
			
			System.out.println("세번째 답 : " + 'A' + 'B');
			char a = 'A';
			int b = (int)a;
			System.out.println("<<<<<<<<<A에 대한 int : " + b);
			char ab = 'B';
			int bc = (int)ab;
			System.out.println("<<<<<<<<<B에 대한 int : " + bc);
								
			/*
			char + char = char 가 아니다, why? 각 단항에서 int 4byte이상의 데이터가 있어야 int 4byte보다 더 높은 쪽의 타입을 취하는데
											char은 2byte기 때문에 컴파일에 오류가 생겨서 int로 인식한다.
			여기서 형변환을 이용해서 'A'에 대한 int의 값을 알아내야한다.
			char a = 'A';
			int c = (int)a;
			
			System.out.println("A에 대한 아키코드 : " + c);
			
			Result 65가 나온다 이를 통해 A는 int로 변환했을 때 65가 된다.
			그래서 int + int = int로 컴파일 되고 A는 65, B는 66인 int타입으로 바뀐다.
			따라서 65 + 66 = 131
			Result 131
			*/
			
			//자동형변환(왜?)
			
			System.out.println("네번째 답 : " + '1' + 2);
			char a1 = '1';
			int b1 = (int)a1;
			System.out.println("<<<<<<<<<1에 대한 int : " + b1);
			/*
			char + int = int
			int + int = int
			char 1에 int는 49
			따라서 49 + 2
			Result 51			 
			*/
			
			System.out.println("다섯번째 답 : " + '1' + '2');
			/*
			char + char = int
			int + int = int
			문자 1의 int는 49, 문자 2의 int는 50
		 	따라서 49 + 50
		 	Result 99
			*/
			
			System.out.println("여섯번째 답 : " + 4 + 24.3715F);
			/*
			int + float = float
			float + float = float
			4 + 24.3715
			Result 28.3715
			
			*/
			
			System.out.println("일곱번째 답 : " + 'A' + 3.14);
			/*
			char + double = double
			A는 int 65이기 때문에 65.0 + 3.14 //65라고 쓰면 안돼 타입이 double 이기 때문에 65.0이 맞다.
			Result 68.14
			*/
			
			System.out.println("여덟번째 답 : " + 'J' + "ava");
			/*
			char + String = String
			String + String = String
			Result Java
			*/
			/*
			System.out.println(true + null);
			/*
			boolean + 주소(참조형) = 계산 안돼  
			Result error!!!	
			*/
		/*
		2-5. 다음 중 키워드가 아닌 것은?(모두 고르시오)
			1. if				2. Ture
			3. NULL				4. Class
			5. System
			
			Result 2, 3, 4, 5   
		 */
			
		/*
		2-6. 다음 중 변수의 이름으로 사용할 수 있는 것은?(모두 고르시오)
			1. $System			2. channel#5
			3. 7eleven			4. If
			5. 자바				6. new(예약어)
			7. $MAX_NUM			8. hello@com
			
			Result 1, 4, 5, 7
		 */
			
		/*
		2-7. 참조형 변수(reference type)와 같은 크기의 기본형(primitive type)은?(모두 고르시오)
			[Hint] 참조형 변수의 크기는 4byte이다.
			1. int				2. long(8)
			3. short(2)			4. float
			5. double(8)
			
			Result 1, 4
		 */
			
		/*
		2-8. 다음 중 형변환을 생략할 수 있는 것은?(모두 고르시오)
			byte b = 10;
			char ch = 'A';
			int i = 100;
			long l = 1000L;
			
			1. b = (byte)i;
			2. ch = (char)b;
			3. short s = (short)ch;
			4. float f = (float)l;
			5. i = (int)ch;
			
			Result 1, 3, 4, 
		 */
			
		/*
		2-9. char타입의 변수에 저장될 수 있는 정수 값의 범위는?
			
			Result char = 2byte = 16bit = 문자형 = 부호가 없어 = 2의 16승 - 1 = 65536
		 */
			
		/*
		2-10. 다음 중 변수를 잘 못 초기화 한 것은?(모두 고르시오)
			1. byte b = 256; -----> byte는 -128 ~ 127까지
			2. char c = ''; -----> char는 무조건 문자 하나가 있어야 한다. 
			3. char answer = 'no'; -----> char는 무조건 문자 하나만 있어야 한다.
			4. float f = 3.14; -----> float은 값 뒤에 F를 붙여줘야한다.
			5. double d = 1.4e3f; -----> 
			
			Result 1, 2, 3, 4, 
		 */
		
			double d = 1.4e3f;
		System.out.println(d);
		
		
	}
}
