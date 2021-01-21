package h_java_lang;

public class JavaLang_01 {
	public static void main(String[] args) {
		/*
		1. java.lang패키지
		  - java.lang 패키지는 자바프로그래밍에 기본이 되는 클래스들을 포함하고 있다.
		    ex) String, Object, System.....
		    
		2. Object 클래스
		  - Object 클래스는 멤버변수는 없이 11개의 메서드로 이루어져 있다.
		  
		  - boolean equals(Object obj)
			: 매개변수로 객체의 참조변수를 받아서 비교하여 그 결과를 boolean값으로 알려준다.
			: 참조변수가 저장하고 있는 주소가 같은지를 비교할 수 밖에 없다.
			: equals()가 오버라이드 되어 있는 클래스들
				=> String, Data, File, wrapper클래스...
				 
			- hashCode() : 10진수로 이루어져 있다.
				: 객체의 주소값을 이용해서 해시코드를 만들어 반환한다.//해시코드가 같으면 주소가 같은 것
				: String 클래스는 문자열의 내용이 같으면 같은 해시코드를 반환하도록 만들어져 있다.
			
			- toString()
				: 인스턴스의 정보를 문자열로 반환할 목적으로 만들어져 있다.
				: 기본 toString()
					-> return getClass().getName()+"@"+Integer.toHexString(hashCod());
	
			- clone()
				: 얕은 복사
					-> 자신을 복제하여 새로운 인스턴스를 생성한다.
					-> 단순히 인스턴스변수의 값만을 복사한다.
					-> 객체가 참조하고 있는 객체까지 복제하지 않는다.
				
			- getClass()
			 	: 자신이 속한 클래스의 Class객체를 반환하는 메서드
			 	: class 객체를 얻는 방법
			 		1) 생성된 객체로 부터 얻는 방법
			 			Class ca = new Card().getClass();
			 			
			 		2) 클래스 리터럴로 부터 얻는 방법
			 		 //클래스 자체를 값으로 인지해버린다.
			 			Class ca = Card.class;
			 			
			 		3) 클래스명으로 부터 얻는 방법
			 		 //주의사항 : 이름으로 가져오는 경우 오타를 낼 수 있다. 그래서 try, catch를 꼭 써야한다.
			 			Class ca = Class.forName("Card");
				
		3. String 클래스
			- 다른 언어에서는 문자열을 char형 배열로 다룬다. 그러나, 자바에서는 문자열을 위한 클래스가 존재한다.
			- 문자열을 합치게 되면 새로운 문자열을 가진 String 인스턴스가 생성된다.
			- 문자열 간의 결합 시에는 StringBuffer클래스를 사용한다.
			
			- 문자열의 비교
				: 문자열 리터럴을 지정하는 방법과 String클래스의 생성자를 사용해서 만드는 방법이 있다.
				: !!!문자열 리터럴은 클래스가 메모리에 로드 될 때 자동적으로 미리 생성된다.!!!
			
			- String 클래스의 생성자와 메서드
				: 자주 사용되는 것만 보자
				
			- String 인코딩
				: 한글 윈도우의 경우 인코딩 CP949방식을 가지고 있다.
				 	우리는 UTF-8사용 중
				
			- String format
				: 기본형 값을 String으로 변환
					(1) valurOf();
						int a = 10;
						String str = String.valueOf(a);
						
					(2) 빈 문자열을 더하는 방법
						int a = 10;
						String str = a + "";
						
				: String을 기본형 값을 변환
					(1) wrapper클래스를 이용하는 방법
						String str = "100"; //"중간에 문자 들어있으면" 예외처리해야된대
						int a = Integer.parseInt(str);
						int a = byte.valueOf(str); *******
						
					(2) 여러가지 진수
						String str = "100";
						int a = Interger.parseInt(str, 4); //str에 있는게 4진수다
						//트라이 캐치 무조건 같이 다녀야 된다
						 
						
		4. StringBuffer클래스와 StringBuilder클래스
			- String 클래스는 인스턴스를 생성할 때 지정된 문자열을 변경할 수 없다.
			- StringBuffer를 사용하는 것이 좋다.
			
			
		 */
		
		
	}
}
