package programmers;

public class Subak {

	public static void main(String[] args) {
		Solution so = new Solution();

		String result = so.solution(5);
		System.out.println(result);
	}

}

class Solution {
	public String solution(int n) {

		String[] subak = { "수", "박" };
		String answer = "";

		for (int i = 0; i < n; i++) {
			answer += subak[i % 2];
		}
		return answer;

	}
}
