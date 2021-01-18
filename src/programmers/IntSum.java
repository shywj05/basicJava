package programmers;

public class IntSum {
	public static void main(String[] args) {
		sumsum solu = new sumsum();
		long result = solu.solution(-7, -7);
		System.out.println(result);
	}
}

class sumsum {
	public long solution(int a, int b) {
		long answer = 0;

		// while (a != b) {
		// if (a < b) {
		// a = ++a;
		// result += a;
		// } else if (a > b) {
		// a += --a;
		// }
		// }
		// answer = a;
		if (a < b) {
			for (int i = a; i < b + 1; i++) {
				answer += i;
			}
		} else if (a > b) {
			for (int i = b; i < a + 1; i++) {
				answer += i;
			}
		} else {
			answer = a;
		}
		return answer;
	}
}
