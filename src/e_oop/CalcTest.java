package e_oop;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {
		// 5.
		Scanner sc = new Scanner(System.in);
		int firstNum;

		// 6.
		String buho; 

		// 7.
		int secondNum;

		Calc ccalc = new Calc();

		// 8.

		while (true) {
			
			
			System.out.println("첫번째 수를 입력해주세요");
			firstNum = sc.nextInt();
			
			System.out.println("부호를 입력해 주세요");
			buho = sc.next();
			
			if("c".equals(buho)){
				System.out.println("연산종료");
				break;
			}
			
			System.out.println("두번째 수를 입력해주세요");
			secondNum = sc.nextInt();
			
			if ("+".equals(buho)) {
				int result1 = ccalc.add(firstNum, secondNum);
				System.out.println(result1);
			} else if ("-".equals(buho)) {
				int result1 = ccalc.substract(firstNum, secondNum);
				System.out.println(result1);

			} else if ("*".equals(buho)) {
				long result1 = ccalc.multiply(firstNum, secondNum);
				System.out.println(result1);

			} else if ("/".equals(buho)) {
				float result1 = ccalc.divide(firstNum, secondNum);
				System.out.println(result1);

			}
		}
	}

}

class Calc {
	// 1.
	int add(int firstNum, int secondNum) {
		int result01 = firstNum + secondNum;
		return result01;
	}

	// 2.
	int substract(int firstNum, int secondNum) {
		int result02 = firstNum - secondNum;
		return result02;
	}

	// 3.
	long multiply(int firstNum, int secondNum) {
		long result03 = firstNum * secondNum;
		return result03;
	}

	// 4.
	float divide(int firstNum, int secondNum) {
		float result04 = (int)((float) firstNum / secondNum * 10 + 0.5) / 10f;
		return result04;
	}

}
