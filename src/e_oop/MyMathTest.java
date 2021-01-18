package e_oop;

public class MyMathTest {
	public static void main(String[] args) {
		// 8.
		MethodTest.add01();
		
		// 9.
		MethodTest.add02(10);

		// 10.
		MethodTest mt = new MethodTest();
		mt.add03(10);
		
		// 11
		mt.add04();
		
	}
}

class MethodTest {

	// 1.
	static int a = 10;

	// 2.
	static int b = 20;

	// 3.
	int c = 50;

	// 4.
	static void add01(){
		int result = a + b;
		System.out.println(result);
	}

	// 5.
	static int add02(int c){
		int result = a + b + c;
		return result;
	}
	
	// 6.
	int add03(int c){
		int result = this.c + c;
		return result;
	}
		
	//	7.
	void add04(){
		int result = c + (int)(Math.random()*101);
		System.out.println(result);
	}
	
		
	}
