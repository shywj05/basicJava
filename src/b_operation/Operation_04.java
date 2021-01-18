package b_operation;

import java.util.Scanner;

public class Operation_04 {
	public static void main(String args[]){
		/*
		1. 삼항연산자
		  - 세 개의 피연산자를 필요로 하기 때문에 삼항 연산자 라고 한다.
		  - 삼항연산자의 조건식에는 연산결과가 true또는 false인 식이 사용되어야 한다.
		  - 기본구조
		  	(조건식)? 식1 : 식2
		 */
			int x = 10;
			int absx = x>0 ? x : -x; //absolute x => 절대값 x의 식, 그리고 식1 : 식2의 타입은 같아야 한다.
			
			//1. 변수 K를 선언하고 50의 값으로 초기화 하여라
			int k = 50;
			
			//2. 변수 k의 값이 0보다 크면 "양수", 0보다 작으면 "음수", 0이면 "0"의 결과를 re에 저장해주세요.
			String re = k > 0 ? "양수" : k < 0 ? "음수" : "0";
			System.out.println(re);
			
		/*
		2. 대입연산자(=, op=)
		  - 변수에 값 또는 수식의 연산결과를 저장하는데 사용한다.
		  - 연산 수선순위가 가장 낮다.
		  
		 */
			int i = 0;
			i += 3; //i = i + 3;
			
			char c = 'A';
//			c = (char)(c + 3);
			c += 3;//c = ++3;
			System.out.println(c);
			
			
		/*
		1. 반올림
		   - 
		
		
		*/
		double d = 3.141592;
		float re1 = (int)(d*1000+0.5)/1000f; //요거 많이 쓰니까 잘 알아두자공~
		System.out.println(re1);
			
		/*
		2. Math.random() //수학 계산을 위해 만들어진 class
		  - 주사위 굴리기
		 */
		int dice = (int)(Math.random()*25+1);
		System.out.println(dice);
		/*
		3. 사용자로부터 입력받기
		  -
		
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 문자를 입력하세요");
		String input1 = sc.nextLine();
		System.out.println("두번째 문자를 입력하세요");
		String input2 = sc.next();
		System.out.println(input1+input2);
		
//		System.out.println("첫번째 숫자를 입력하세요");
//		int num1 = sc.nextInt();
//		
//		System.out.println("두번째 숫자를 입력하세요");
//		int num2 = sc.nextInt();
//				
//				System.out.println("두 수의 합계는"+(num1+num2));
				
			
				
				
			
				
		
		
	}

}
