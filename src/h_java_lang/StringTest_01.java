package h_java_lang;

public class StringTest_01 {

	public static void main(String[] args) {

		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1 == str2);
		//주소가 같은거다
		
		System.out.println(str1.equals(str2));//이퀄스는 주소를 비교
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));//이퀄스 매서드가 오버라이드 되어있다.
		
		
	}

}
