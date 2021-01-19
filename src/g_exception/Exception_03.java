package g_exception;

public class Exception_03 {
	public static void main(String[] args) {//콜스택이 두개다??
		int a = 3;
		int b = 0;

		System.out.println(a); // 문제없는애는 밖으로 빼주고 , 상관없는애는 try 안에 있으면 안돼
		try {
			System.out.println(a / b); //문제생길 것 같은애 넣어주고
			System.out.println(b); //윗줄이 고쳐져야 돌아간다
			
		} catch (ArithmeticException e) {
//			e.printStackTrace();//터졌을 때 왜 터진지 알려주는 문자를 출력해주는
			System.out.println(e.getMessage());//오류 원인을 알려준다
			
		} catch (Exception e) {
			
			
		}
		
		System.out.println("완료");
		
		
	}
}
