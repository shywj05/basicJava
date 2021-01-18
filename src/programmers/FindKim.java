package programmers;

public class FindKim {

	public static void main(String[] args) {
		SeoulKim sk = new SeoulKim();
		String result = sk.solution(null);
		System.out.println(result);
	}

}

class SeoulKim {
	public String solution(String[] seoul) {
		
		int rand = (int)(Math.random()*1000+1);
		String[] arr = new String[rand];
		
		int find = (int)(Math.random()*1000+1);
		arr[find] = "Kim";
		
		String i = arr[find];
		String answer = "김서방은 : " + i + "에 있다";
		
		return answer;
	}
}