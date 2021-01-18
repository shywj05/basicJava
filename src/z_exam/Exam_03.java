package z_exam;

public class Exam_03 {
 public static void main(String args[]){
	 /*
	 1. 형변환 생략 가능?
	 byte b = 10;
	 char ch = 'A';
	 int in = 100;
	 long lo = 1000L;
	 
	 1) b = (byte) in;
	 2) ch = (char) b;
	 3) short s = (short) ch;
	 4) float f = (float) lo;
	 5) in = (int) ch;
	 
	  결과 : 2, 3, 4
	  */
	 
	 /*
	 2. 연산결과를 적으세요
	  */
	  	int x = 2;
	  	int y = 5; 
	  	char c1 = 'A';
	  	
	 System.out.println(1 + x << 33);
	 //
	 System.out.println(y >=5 || x < 0 && x > 2);
	 //
	 System.out.println(y += 10 - x++);
	 //
	 System.out.println(x += 2);
	 //
	 System.out.println(!('A' <= c1 && c1 <= 'Z'));
	 //
	 System.out.println('C' - c1);
	 // 
	 System.out.println('5' - '0');
	 //char => int, int - int = int, 5 - 0 = 5; 
	 System.out.println(c1 + 1);
	 // char = 'A' + 1, int + int = int, 65 + 1 = 66;
	 System.out.println(++c1);
	 // 전위연산자, c1 = 'B', char c1 = 'B';
	 System.out.println(c1++);
	 // 후위연산자, c1 = 'B'로 먼저 찍고(print) c1 = 'C';
	 System.out.println(c1);
	 // 그럼 c1을 프린트 하면 뭐야? 'C'가 나오지
	 
	 /*
	 3. "양수", "음수", "0"을 출력하는 코드, 삼항 연산자를 이용해 코드를 넣으세요
	  */
	 	int num = 10;
	 	String result = num > 0 ? "양수" : num < 0 ? "음수" : "0";
	 	System.out.println(result);
	 	
	 /*
	 4. 사과 담는 바구니 문제
	 	  */
//	 	int app = 123;
//	 	int buc = 10;
//	 	int numOfBucket = ;
	 	int app = 135;
	 	int buc = 10;
	 	int numOfBucket = (app/buc + (app % buc == 0 ? 0 : 1));
	 	System.out.println("바구니 갯수 : " + numOfBucket);
	 	
	 /*
	 5.
	  */
	 	int num2 = 500;
	 	int result2 = num2 / 100 * 100;
	 	System.out.println("3-5번의 결과 값 : " + result2);
	 	
	 /*
	 6.
	  */
	 	byte a = 10;
	 	byte b = 20;
	 	byte c = (byte)(a + b);
	 	char ch = 'A';
	 	ch = (char)(ch + 34);
	 	float f = (float)3 / 2;
	 	long l = (long)300000000 * 3000 * 3000;
	 	float f2 = 0.5f;
	 	double d = 0.5;
	 	boolean result3 = d == f2;
	 	System.out.println("c = " + c);
	 	System.out.println("ch = " + ch);
	 	System.out.println("f = " + f);
	 	System.out.println("l = " + l);
	 	System.out.println("result3 = " + result3);
	 	
	 /*
	 7.
	  */
	 	int num7 = 24;
	 	int result7 = (int)(num7 / 10 + 1) * 10 - num7;
	 	System.out.println(result7);
	 	
	 /*
	 8. 화씨 섭씨
	  */
	 	int fa = 100;
	 	float formu = (float)5 / 9 * (fa -32);
	 	// 
	 	System.out.println("formu의 값 : " + formu);
	 	float cel = (int)(formu*100+0.5)/100F;
	 	System.out.println("소수점 셋째에서 반올림 한 값 : " + cel);
	 
}		
	}

