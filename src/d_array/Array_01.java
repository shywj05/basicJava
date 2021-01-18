package d_array;

public class Array_01 {
	public static void main(String[] args) {
		/*
		 * 1. 배열(Array) - 같은 타입의 여러변수를 하나의 묶음으로
		 * 
		 * 2. 배열의 선언 - 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는 대괄호[]를 붙인다 - 구조
		 * 변수타입[] 변수명; ==> int[] a;
		 * 
		 * 3. 변수의 생성 - 배열을 생성하기 위해 연산자'new'와 함께 배열 타입, 크기 지정 ex) a = new int[3];
		 * - 배열은 한 번 생생하면 크기 변경 X (단점)
		 */

		int[] score = new int[5]; // {0,0,0,0,0} int의 기본값 0으로 초기화 되어있다.

		for (int a = 0; a < score.length; a++) {
			System.out.println(score[a]);
		}

		// 시작0 끝 4 증가량 1
		// 반복 : score[?] = (?+1)*10
		// for(int a = 0; a < score.length; a++){
		// a[a] = (a+1)*10;
		// }
		// System.out.println(score[a]);

		//
		// int[] score2 = new int[]{10,20,30,40,50};
		int[] score2 = { 10, 20, 30, 40, 50 };

		for (int value = 0; value < score2.length; value++) {
			System.out.println(score2[value]);
		}

		int[] ss;
		ss = new int[2];

		int[] ss2;
		ss2 = new int[] { 2, 3, 4 };

		// int[] ss3 = {5,6,7};
		// ss3 = {5,6,7};

		// 변수 names에 같은 팀원의 이름을 저장해주세요
		String[] names = new String[] { "박상빈", "길민선", "성원제", "박세웅" };

		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length(); j++) {
				System.out.println(names[i].charAt(j));

			}
			System.out.println("-------");
		}

		int[] sco = new int[] { 20, 39, 59, 40, 12 };
		int cou = 0;
		for (int i = 0; i < sco.length; i++) {
			cou = sco[i];
			System.out.println("score[" + i + "] : " + cou);
		}

	}

}
