package z_exam;

import java.util.Scanner;

public class Exam_04 {
	public static void main(String[] args) {
		// 4-1-1.
		int x = 15;
		if (x > 10 && x < 20) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// 4-1-2.
		char ch = ' ';
		if (ch == ' ' && ch != '\t') {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// 4-1-3.
		char ch1 = 'x';
		if (ch1 == 'x' || ch1 == 'X') {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		// 4-1-4.
		char ch4 = '1';
		if (ch4 >= '0' && ch4 <= '9') {
			System.out.println("4번 답 true");
		} else {
			System.out.println("4번 답 false");
		}
		// 4-1-5
		char ch5 = '1';
		if ((int) ch5 >= 97 && (int) ch5 <= 122) {
			System.out.println("5번의 답 true");
		} else if ((int) ch5 >= 65 && (int) ch5 <= 90) {
			System.out.println("5번의 답 true");
		} else {
			System.out.println("5번의 답 false");
		}
		// 4-1-6
		boolean pow = false;
		if (pow == false) {// !pow 도 가능
			System.out.println("6번의 답 true");
		} else {
			System.out.println("6번의 답 false");
		}
		// 4-1-7
		String str = "yes";
		if (str == "yes") {// <==이렇게 쓰는건 사실 안 맞아 되게만 해놨을 푼이지 원래는
							// str.equals("yes")가 맞는 표현이다 근데 str은 기본 값이 null이기
							// 때문에
							// 앞에는 확실한 값 오게하고 "yes".equals(str)쓰는게 확실하다
			System.out.println("7번의 답 true");
		} else {
			System.out.println("7번의 답 false");

		}
		// 4-2-1.

		for (int i = 0; i < 6; i++) {
			System.out.println(i);
		}

		int k = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 != 0) {
				continue;

			} else {
				k = i * 1;
				System.out.println("답답답" + k);
			}
		}

		// 4-2-1(1)
		int hap = 0;
		for (int jun = 1; jun < 21; jun++) {

			if (jun % 2 != 0 && jun % 3 != 0) { // !(jun % 2 == 0 || jun % 3 ==
												// 0) 똑같다
				hap += jun;

			}
		}
		System.out.println("1~20까지 중 2의 배수 또는 3의 배수의 합 " + hap);

		// 4-3
		// for(int dan = 2; dan < 10; dan++){
		// for(int gob = 1; gob < 10; gob++){
		// System.out.println(dan + "*" + gob + "=" + dan*dan);
		// }
		// }

		// ===>

		int dan = 2;
		while (dan < 10) {
			int gob = 1;
			while (gob < 10) {
				System.out.println(dan + "*" + gob + "=" + dan * gob);
				gob++;
			}
			dan++;
		}

		// 4-4 두 개 주사위 던졌을 때(눈 6), 모든 경우의 수 출력! 눈의 합이 6이 되는

		for (int fir = 1; fir < 7; fir++) {
			for (int sec = 1; sec < 7; sec++) {
				if (fir + sec == 6) {
					System.out.println("주사위문제의 답 : " + fir + "하고" + sec);
				}
			}
		}

		// 4-5 방정식 2x+4y=10의 모든해를 구해 x,y 모두 정수, 범위 0 <= x,y <= 10,
		for (int x5 = 0; x5 < 11; x5++) {
			for (int y5 = 0; y5 < 11; y5++) {
				if (2 * x5 + 4 * y5 == 10) {
					System.out.println(x5 + "와" + y5);
				}
			}
		}

		// 4-6 두개의 정수(시작, 끝) 입력받아 시작, 끝 포함 까지 곱을 출력
		// Scanner sc = new Scanner(System.in);
		// long finsum = 1;
		// System.out.println("시작 숫자를 입력하세요");
		// int scc = sc.nextInt();
		//
		// System.out.println("끝 숫자를 입력하세요");
		// int j = sc.nextInt();
		//
		// for(int a = scc; 0 < j + 1; a++){
		// scc *= j;
		//
		// }
		// System.out.println(finsum);

		//
		// System.out.println("시작과 끝 숫자의 곱은 " + scc * j);

		// 4-7-1. 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)의 결과 계산
		// 합 변수 주고
		// 뭐로 계산하지? 얼마나 반복하는지 몰라 while로 하자
		// 그럼 어떻게 하지? 1+3+6+10 ==> 2, 3, 4 씩해서 열번 더하면 끝나 증가되는 변수는 0부터하고 1부터 늘어나는
		// 변수도 있어야

		int i7 = 1;
		int j7 = 0;
		int h7 = 0;
		while (true) {
			if (i7 < 11) {
				j7 += i7;
				h7 += j7;
				i7++;
			} else {
				break;
			}
		}
		System.out.println("4-7) 다 더한 값은 " + h7);

		// 4-8
		int num = 0;
		int sum = 0;

		while (sum < 101) {
			if (num % 2 == 0) {// 짝수
				sum -= num;
			}
			if (num % 2 != 0) {// 홀수
				sum += num;
			}
			if (sum == 100) {
				break;
			}
			num++;
		}
		System.out.println("sum의 값 " + sum);
		System.out.println("4-8-1번의 답 " + num + "번째");

		// 4-9
		// Scanner.scan = new1.Scanner(System.in);
		// System.out.println("숫자를 입력하세요");

		// int sum9 = 0;
		// int last = 0;
		//
		// System.out.println("원하는 정수값을 입력하세요 : ");
		// Scanner sc = new Scanner(System.in);
		// int user = sc.nextInt();
		//
		// while(user % 10 != 0){
		// sum9 += user % 10;
		// user = user / 10;
		//
		// if(user / 10 == 0){
		// last = user % 10;
		// sum9+= last;
		// break;
		// }
		//
		// }
		// System.out.println(sum9);

		// 4-10
		System.out.println("몇번째 숫자가 궁금하세요? :  ");
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();

		int a = 0;
		int i = 1;
		int su = 1;
		int fsum = 0;

		while (a < user + 1) {
			fsum = i + su;
			a++;
			if (a == user) {

				break;
			}
			i = su + fsum;
			a++;
			if (a == user) {
				break;
			}
			su = fsum + i;
			a++;
			if (a == user) {
				break;
			}

		}
		System.out.println(i);

		// 4-11
		String value = "12o34";
		char ch11 = ' ';
		boolean isNumber = true;
		// 반복문과 charAt(int i)를 이용해서 문자열의 문자를
		// 하나씩 읽어서 검사한다.
		for (int i11 = 0; i11 < value.length(); i11++) {
			char ch12 = value.charAt(i11);

			int isNumber2 = (int) ch12;

		}
		if (isNumber) {
			System.out.println(value + "는 숫자입니다.");
		} else {
			System.out.println(value + "는 숫자가 아닙니다.");
		}

		/*
		 * 팰린드롬
		 */

	}
}
