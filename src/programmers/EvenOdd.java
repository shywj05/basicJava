package programmers;

public class EvenOdd {
	public static void main(String[] args) {
		
		EvenOdd ev = new EvenOdd();
		
//		String result = ev.Evodd(4);
//		System.out.println(result);
		
		System.out.println(ev.Evodd(4));
	}

	String Evodd(int num) {
		if (num % 2 == 0) {
			return "Even";
		} else {
			return "Odd";
		}
	}
}
