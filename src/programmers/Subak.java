package programmers;

public class Subak {

	public static void main(String[] args) {
		Solution so = new Solution();

		String result = so.solution(3);
		System.out.println(result);
	}

}

class Solution {
	public String solution(int n) {

		String answer = "";
		String[] subak = {};

		for (int i = 0; i < n; i++) {
			
			answer += subak[i];
		}

		return answer;
	}
}
