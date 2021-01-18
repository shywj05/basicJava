package d_array;

public class Array_02_01 {
	public static void main(String[] args) {
		int[] score = new int[7];
		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * 101 + 0);
			System.out.println("각 score의 값 : " + score[i]);
		}

		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("====================");
		System.out.println("각 score의 총 합 : " + sum);
		System.out.println("====================");

		double ave = 0d;
		for (int i = 0; i < score.length; i++) {
			ave = (int) ((double) sum / score.length * 100 + 0.5) / 100d;
		}
		System.out.println("각 score의 평균 : " + ave);
		System.out.println("====================");

		int max = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
		}
		System.out.println("score의 값 중 최댓값 : " + max);
		System.out.println("====================");

		int min = 0;
		for (int i = 0; i < score.length; i++) {
			if (score[i] < min) {
				min = score[i];
			}
		}
		System.out.println("score의 값 중 최솟값 : " + min);
		System.out.println("====================");

	}
}
