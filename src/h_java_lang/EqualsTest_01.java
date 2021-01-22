package h_java_lang;

public class EqualsTest_01 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		
		System.out.println(v1 == v2);
		//v1과 v2의 주소값을 비교했을 때 다르니까 false
		
		System.out.println(v1.equals(v2));
		//비교문자열.equals(변수값)
		//equals메서드에 오버라이드가 안되어있다.
		//주소를 비교해서 false
		
		
	
	}
	

}


class Value{
	
	int value;
	
	public Value(int value){
		this.value = value;
	}
}
