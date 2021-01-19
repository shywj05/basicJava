package g_exception;

public class Exception_04 {

	public static void main(String[] args) {

		Exception ee = new Exception("누구 때문이냐");// 예외의 이유를 잡는다

		try {
			throw ee;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");

		RuntimeException run = new RuntimeException("🕶");//이게 런타임 익셉션 이유,,, 맘대로 바꾸는 거야?

		try {
			throw run;
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		//컴파일러가 예외처리를 강제하지 않는 경우
		//1. 에러의 경우 
		//2. RuntimeException은 개발자가 잘 못 한 경우
		// 이런 것들은 unChecked예외 라고한다.
		
		
		
	}
	
	
	
}
