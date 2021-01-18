package e_oop;

public class OOP_01 {
	public static void main(String[] args) {
		/*
		OOP(Object Oriented Programming) - 객체지향 프로그래밍
		
		1. 객체지향 언어
		  - 기존의 프로그래밍 언어의 많은 새로운 규칙을 추가한 보다 발전된 형태
		  - 객체지향 언어의 특징
		    : 코드의 재사용성이 높다
		    : 코드의 관리가 용이하다
		    : 신뢰성이 높은 프로그래밍이 가능하다
		    
		2. 클래스와 객체
		  - 클래스란?
		    : 음식의 레시피 같은 놈
		    : 객체의 설계도 / 음...약간 설명서 갬성
		  
		  - 클래스의 선언
		    [접근제어자][지정예약어] class 클래스명 [extends 클래스][implements 인터페이스]{}
		    public abstract class child extends parents implements serializable{}
		  
		  - 객체란?
		    : 레시피로 만들어진 음식의 결과물, 사물 또는 실존하는 것(눈으로 볼 수 있는 것) / 다른말 인스터스로 부르기도 해
		    : 구성요소
		      => 속성 : 멤버변수!!, 특성, 필드, 상태...
		      	-> 전원(boolean), 채널, 볼륨...
		      => 기능 : 메서드!!, function, 행위, 함수...
		        -> 전원 켜기 / 끄기, 채널 올리기 / 내리기...	
		        
		 3. 인스턴스란?
		   - 클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화 라고 한다
		   - Tv클래스로부터 만들어진 객체를 Tv클래스의 인스턴스라고 한다
		   - 인스턴스 생성방법
		   	 클래스명 변수명; // 클래스 타입의 참조변수를 선언
		   	 변수명 = new 클래스명(); // 클래스의 객체를 생성 후 객체의 주소를 참조변수에 저장
		   	 
		   	 인스턴스는 참조변수를 통해서만 다룰 수 있으며 참조변수의 타입은 인스턴스의 타입과 일치해야한다
		   	 
		 4. 선언위치에 따른 변수의 종류
		   - 전역변수(클래스 변수, 인스턴스변수), 지역변수
		     : 인스턴스 변수 
		              클래스의 영역에 선언되며, 클래스의 인스턴스가 생성될 때 같이 만들어진다
		              인스터스변수의 값을 읽어오거나 저장하기 위해 인스턴스를 먼저 생성해야 한다
		              인스터스는 독립적 저장공간을 가지므로 서로 다른 값을 가질 수 있다
		              
		   - 클래스변수
		   	 : 클래스영역에 선언된다
		   	 : 모든 인스턴스가 공통된 저장공간(변수)을 공유하게 된다
		   	 : 한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야 하는 경우 클래스 변수로 선언한다
		   	 : 인스턴스 변수에 static만 붙이면 된다
		   - 지역변수
		   	 : 메서드 내에 선언, 해당 메서든 내에서만 사용가능
		   	 : 메서드 종료 시 소멸되게 된다
		   	 : for, while문의 블럭내에서 선언된 변수는 해당 반복문이 종료되면 사라짐
		   	 
		 5. 메서드
		   - 어떤 작업을 시행하기 위한 명령문의 집합
		   - 주로 어떤 값을 입력받아서 처리하고 그 결과를 돌려준다
		   - 입력값이 없을 수도 결과를 반환하지 않을 수도 있다
		   - 반복적으로 사용되는 코드를 줄이기 위해 사용된다 => 유지보수가 용이하다
		   ****** 작성방법
		   순서 : 메서드명 - 매개변수확인 - 명령확인 - 리턴값확인 - 반환타입 맞추기
		   반환타입 메서드명(변수타입 변수명,변수타입 변수명,변수타입 변수명,.....=> 매개변수, 타입과 갯수가 중요하다 ){
		   //처리내용
		     return 값; //반환 값에 따라 반환타입이 결정된다
		  }
		   
		  int add(int a, int b){ 
		   int result = a + b;
		  	return result;
		  }
		   	 
		  6. return
		    - 메서드가 정상적으로 종료되는 경우
		      : 메서드 블럭{}내의 마지막 문장까지 수행하였을 경우
		      : 메서드의 블럭{}내에서 return문을 만났을 때
		    - 반환값
		      : 반환값이 있는 경우 return 문 뒤에 반환값을 지정해 주면된다
		        ->반환값의 타입과!~ 메서드의 반환타입이 같아야한다
		      : 반환값이 없는 경우
		        -> return; => 생략가능
		        -> 메서드의 반환타입에 void라고 적어준다
		        
		  7. 메서드의 호출
		    - 클래스메서드
		      : 클래스명.메서드명(값,값)
		    - 인스턴스메서드
		      : 인스턴스화 -> 참조변수명.메소드명()
	        - 메서드 호출
	          OOP_01 op = new OOP_01();
	          int result = op.add(10,50);
	          syso(result);
		
		  8. JVM메모리 구조
		    - 메서드 영역(Method Area)
		      : 클래스가 로드됨, 이때 클래스 변수, 클래스 메서드 함께 로드 됨
		      
		    - 호출스택(Call Stack)
		      : 메서드 수행에 필요한 메모리 공간 제공
		      
		    - 힙영역(Heap Area)
		      : 인스턴스가 로드됨, 이때 인스터스 변수, 인스턴스 메서드가 함께 로드 됨
		      
		  9. 재귀호출(Recursive call)
		    - 메서드 내부에서 메서드 자기 자신을 다시 호출하는 것
		    
		  10. 메서드의 종류
		    - 클래스 메서드
		      : 객체생성없이 클래스가 로드될 때 함께 로드된다
		      : 클래스명.메서드명(인자값)
		      : 인스턴스 멤버와 관련 없는 작업 수행
		      : 클래스 메서드 내에서는 인스턴스 멤버를 호출 할 수 없다 
		      
		    - 인스턴스 메서드
		      : 인스턴스가 생성될 때 로드된다
		      : 참조변수명.메서드명(인자값)
		      : 인스턴스 멤버와 관련된 작업 수행
		      : 인스턴스 메서드 내에서는 모든 멤버를 호출 할 수 있다
		      
		  11. 메소드 오버로딩
		    - 한 클래스 내에 같은 이름의 메서드를 여러개 정의하는 것
		    - 가장 대표적인 예 : println()
		    - 조건
		      : 메서드의 이름이 같아야 한다
		      : 매개변수의 갯수 또는 타입이 달라야 한다
		      : 반환타입은 상관없다
		    - 오버로딩의 장점
		      : 메서드의 이름으로만 구분이 된다면 모든 메서드의 이름이 달라야 한다
		      : 근본적으로 같은 기능을 하는 것인데 다른 이름으로 표현되면 기억하기 어렵다
		      : 메서드의 이름을 짓는 고민을 덜 수 있다
		    
		  12. 매개변수
		    - 메서드를 호출할 때 매개변수로 지정한 값을 메서드의 매개변수에 복사해서 넘겨준다
		    - 기본형 매개변수
		      : 단순히 저장된 값만 복사한다
		      : 변수의 값을 읽기만 한다
		       
		    - 참조형 매개변수
		      : 인스턴스의 주소가 복사된다
		      : 주소를 따라가서 변수의 값을 변경할 수 있다
		      
		  13. 생성자
		    - 인스턴스가 생성될 때 호출되는 인스턴스 초기화 메서드	
		    - 특징
		      : 메서드처럼 클래스 내에 선언된다
		      : 반환값이 없다 => 생성자도 메서드 이기 때문에 반환타입 적어줘야 되는데 모든 생성자가 반환이 없으니까 생략한다
		    - 작성방법
		      : 기본생성자
		        	클래스명(){
		        	}
		      : 매개변수 있는 생성자
		      		클래스명(매개변수){
		      		}
		  14. 변수의 초기화
		    - 변수를 선언하고 처음으로 값을 저장하는 것
		    - 초기화 방법
		      : 명시적 초기화
		                변수의 선언과 동시에 초기화
		      : 생성자를 이용한 초기화
		      : 초기화 블럭을 이용한 초기화
		        	수식계산
		        }
		
		
		
		
		
		
		
		 */
	}
}