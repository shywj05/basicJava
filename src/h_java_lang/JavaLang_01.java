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
				 
		3. hashCode() : 10진수로 이루어져 있다.
			: 객체의 주소값을 이용해서 해시코드를 만들어 반환한다.//해시코드가 같으면 주소가 같은 것
			: String 클래스는 문자열의 내용이 같으면 같은 해시코드를 반환하도록 만들어져 있다.
			
		4. toString()
			: 인스턴스의 정보를 문자열로 반환할 목적으로 만들어져 있다.
			: 기본 toString()
				-> return getClass().getName()+"@"+Integer.toHexString(hashCod());
				
		
		
		 */
		
		
	}
}
