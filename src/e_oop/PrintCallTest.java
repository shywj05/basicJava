package e_oop;

public class PrintCallTest {
	public static void main(String[] args) {
		
		// 9. 3번의 메서드 호출
		int result1 = MyAdd.add(3);
		System.out.println(result1);
		
		
		//10. 4번의 메서드 호출 // 인스턴스화를 시켜야 인스턴스메서드를 부른다
		MyAdd my = new MyAdd();
		int result2 = my.add(3, 4);
		System.out.println(result2);
		
		//11. 5번의 메서드 호출
		long result3 = my.add(5, 6L);
		System.out.println(result3);
		
		//12. 6번의 메서드 호출
		float result4 = my.add('a', 123.34F);
		System.out.println(result4);
		
		
		//13. 8번 호출
		float result5 = my.add(5, 5L, 5F);
		System.out.println(result5);
		
	}
}


class MyAdd{
	//1. 클래스변수 a를 선언하고 20 값으로 초기화
	static int a = 20;
	
	//2. 인스턴스 변수 b선언, 15값 초기화
	int b = 15;
	
	//3. int 타입의 매개변수 하나
	static int add(int a){
		int result = a + a;
		return result;
	}
	
	//4. int타입 매개변수 두개, 합 반환, 인스턴스메서드 add
	int add(int a, int b){
		int result = a + b;
		return result;
	}
	
	//5. int타입, long타입 두개 매개변수, 매개변수 합 반환, 인스턴스메서드  add
	long add(int a, long b){
		long result = a + b;
		return result;
	}
	
	//6. char타입, float타입 두개 매개변수, 매개변수의 합 반환, 인스턴스메서드 add
	float add(char a, float b){
		float result = a + b;
		return result;
	}
	
	//7. int타입의 매개변수 두개, 매개변수 합 반환, long인 인스턴스 메서드 add
//	long add(int a, int b){ //4번하고 메서드명과 매개변수 갯수 타입이 같아서 에러나
//		int result = a + b;
//		return result;
//	}
	
	//8. int, long, float타입의 세개 매개변수, 매개변수 합 반환, 클래스메서드 add
	float add(int a, long b, float c){
		float result = a + b + c;
		return result;
	}
	
}
