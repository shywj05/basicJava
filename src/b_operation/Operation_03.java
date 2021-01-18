package b_operation;

public class Operation_03 {
	public static void main(String args[]){
		/*
	 	1. 산술연산자
	 	   - 사칙연산자(+,-,*,/), 나머지연산자(%), 쉬프트연산자(<<, >>, >>>)
   	 	          피연산자를 두개를 필요로 하기 때문에 이항연산자라고 불린다.
   	 	          
   	 	2. 사칙연산자
   	 	   - 두개의 피연산자 중 자료형의 표현범위가 큰 쪽에 맞춰서 변경한 후 연산을 수행한다.
   	 	   	: int + float => float + float = float
   	 	   - 두개의 피연사자 모두 4byte보다 크기가 작을 때 둘다 4byte 인 int 형으로 형변환 후 연산한다.
   	 	    : byte + char => int + int = int
   	 	   - 0으로 나누는 것은 금지되어 있다. 
   	 	  
		 */
		
		
		byte b1 = 80;
		byte b2 = 100;
		long lo1 = 642;
		long result1 = lo1 + b1;
		System.out.println(result1);
		
		int result2 = b1 + b2;
		System.out.println(result2);
		
		byte result3 = (byte)result2; //byte result3 = (byte)(b1+b2);
		System.out.println(result3);
		
		long lo2 = (long)60000 * 80000;
		System.out.println(lo2);
		
		/*
		3. 나머지 연산자(%)
		   - 왼쪽의 피연산자를 오른쪽읜 피연산자를 나누고 난 나머지 값을 돌려준다.
		   - boolean 타입에는 사용할 수 없다.!!!!!!!!!!!!!!!!!!!!
		    
		 */
		int num1 = 57;
		int num2 = 547867;
		
		//몫
		int share = num1 / num2;
		//나머지
		int remain = num1 % num2;
		
		System.out.println(num1 + "을(를) " + num2 + "로 나눈 몫은 " + share + "이고 나머지는 " + remain + "이다.");
		
		/*
		4. 쉬프트 연산자(<<, >>, >>>)
		  - 정수형 변수에만 사용할 수 있다.
		  - 연산 속도가 매우 빠르기 때문에 사용한다.
		  - x << n : x * 2^n
		  - x >> n : x / 2^n
		   
		 */
		
		int i4 = 10;
		int result4 = i4 << 4; // 10*2^4 
		System.out.println("i4 << 4 : " + result4);
		System.out.println("i4 >> 2 : " + (i4 >> 2));
		
		/*
		5. 비교연산자
		   - 두 개의 변수 또는 리터럴을 비교하는데 사용
		   - 주로 조건문과 반복문(잘 알아야돼) 조건식에 사용되며 연산결과로는 true false의 값을 가진다.
		   - 이항연산자 이다.
		   
		6. 대소비교연산자( <, >, <=, >= )
		   - 기본형 중 boolean을 제외한 나머지 자료형에 사용가능
		
		7. 등가비교연산자( ==, != )
		   - 모든 자료형에 사용가능
		   
		   
		   수식                        |       연산결과
		  x > y 		|       x가 y보다 클 때만 true, 그 외는 false
		  x < y         |       x가 y보다 작을 때만 true, 그 외는 false
		  x >= y        |       x가 y보다 크거나 같을 때만 true, 그 외에는 false
		  x <= y        |       x가 y보다 작거나 같을 때만 true, 그 외에는 false
		  x == y        |       x와 y가 같을 때만 true, 그 외에는 false
		  x != y        |       x와 y가 다를때만 true, 그 외에는 false
		   
		   
		 */
		 boolean result6 = 5 < 10;
		 
		 System.out.println(result6);
		 System.out.println(0.1 == 0.1f); // double에서 0.1 은 0.1999같은 근사치지 확실한 값이 아니다. float은 그냥 보이는 0.1 그래서 다르다.
		 System.out.println(0.5 == 0.5f); //2^n으로 이루어진 것은 같다고 하는겨~/710;
		 
		 /*
		 8. 비트연산자(&, |, ^)
		 	- 이진 비트연산을 수행한다.
		 	- 실수형 제외하고 모든 기본형에 사용할 수 있다.

			|(or연산) : 피연산자 중 어느 한쪽이 값이 1이면  1의 결과를 가져온다.
			&(and연산) : 피연산자가 둘다 값이 1이어야 1의 결과를 가져온다.
			^(xor연산) : 피연산자가 서로 다르면 1의 결과를 가져온다.
		  */
		 
		 /*
		 9. 논리연산자(&&, ||)
		 	- 피연산자로 boolean형 값 또는 boolean형을 결과로 하는 조건식만 허용한다.
		 	- &&연산이 ||보다 연산우선순위가 높다
		 	
		 	||(or결합) : 피연산자 중 어느한 쪽한 True면 True결과를 가져온다.
		 	&&(and결합) : 피연산자 양쪽 모두 True이면 True결과를 가져온다.
		 */
		 
		 	int input = 12;
		 	boolean result = 3<input && input<=15;
		 	System.out.println(result);
		 	
		 	char ch01 = 'i';
		 	boolean ch02 = 'A'<=ch01 && ch01<='Z';
		 	System.out.println("ch02에 대한 결과 값 : " + ch02);
		 	
		 	boolean ch03 = 'a'<=ch01 && ch01<='z';
		 	System.out.println("ch03에 대한 결과 값 : " + ch03);
		 	
		 	boolean ch04 = 'A'<=ch01 && ch01<='Z' || 'a'<=ch01 && ch01<='z';
		 	System.out.println("ch04에 대한 결과 값 : " + ch04);
		 	
		 	int ch05 = (int)ch01;
		 	boolean ch06 = 'A'<=ch01 && ch01<='Z' || 'a'<=ch01 && ch01<='z';
		 	System.out.println("ch06에 대한 결과 값 : " + ch06);
		 	
		 	//6. 변수 ch01의 값이 영문자 또는 숫자일때 true조건식을 작성
		 	
		 	boolean ch07 = 'A' <= ch01 && ch01 <='Z' || 'a'<=ch01 && ch01<='z' || '0'<=ch01 && ch01<='9';
		 	System.out.println(ch07);
		 	
		 
		 	
		 	
		 	
		 
		
		
		
	}

}
