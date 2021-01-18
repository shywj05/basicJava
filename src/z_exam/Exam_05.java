package z_exam;

public class Exam_05 {
	public static void main(String[] args) {
		// 5-6. ballArr의 index순서대로 index의 요소와 임의의 요소를 골라서 값을 바꾼다
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int[] ball3 = new int[3];

		int bang1 = 0;
		for (int i = 0; i < ballArr.length; i++) {
			int rand = (int) (Math.random() * 8);
			bang1 = ballArr[i];
			ballArr[i] = ballArr[rand];
			ballArr[rand] = bang1;
		}
		for (int j = 0; j < ball3.length; j++) {
			ball3[j] = ballArr[j];
			System.out.println(ball3[j]);
		}

		// 5-7. answer에 담긴 데이터를 읽고 각 숫자의 갯수만큼 * 찍어라
		int[] answer = { 1, 4, 3, 2, 1, 2, 3, 2, 1, 4 };
		int[] counter = new int[4];

		for (int i = 1; i < counter.length + 1; i++) {
			for (int j = 0; j < answer.length; j++) {
				if (answer[j] == i) {
					counter[i - 1]++;
				}
			}
			System.out.print(i + " : " + counter[i - 1] + "개\t");
			for (int sta = 1; sta < counter[i - 1] + 1; sta++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 5-8.
		int money = 3500;

		int[] coinUnit = { 500, 100, 50, 10 };
		int[] coin = { 5, 5, 5, 5 };
		for (int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;
			money -= coinUnit[i] * coin[i];
			
			if (money == 0) {
				System.out.println(coinUnit[i] + "원 : " + coinNum + "개");
				break;
			} else if(money != 0){
				System.out.println(coinUnit[i] + "원 : " + coinNum + "개");
				continue;
			}
		}
		System.exit(0);
		System.out.println(" = 남은 동전의 개수  = ");
	}
}
