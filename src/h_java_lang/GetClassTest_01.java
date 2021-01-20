package h_java_lang;

import java.util.Arrays;

public class GetClassTest_01 {

	public static void main(String[] args) throws ClassNotFoundException {

		// 1. 클래스 객체로 부터 얻는 방법
		Class ca1 = new Point(100, 100).getClass();
		System.out.println(ca1.getName());
		System.out.println(Arrays.toString(ca1.getInterfaces()));

		// 2. 클래스 리터럴로 부터 얻는 방법
		Class ca2 = Point.class;
		System.out.println(ca2.getName());
		System.out.println(Arrays.toString(ca2.getInterfaces()));

		// 3. 클래스명으로 부터 얻는 방법
		Class ca3 = Class.forName("h_java_lang.Point");//db하고 연동할 때 자주 볼 수 있다.
		System.out.println(ca3.getName());
		System.out.println(Arrays.toString(ca3.getInterfaces()));

	}
}
