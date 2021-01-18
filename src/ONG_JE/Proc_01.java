package ONG_JE;

import java.util.Arrays;
import java.util.Scanner;

import sun.security.util.Length;

public class Proc_01 {
	public static void main(String[] args) {
		// 2-21. 배열 자리 바꾸기
		// String[] names = { "김씨", "이씨", "박씨", "성씨" };
		// System.out.println("변경 전 : " + Arrays.toString(names));
		//
		// String exchan = names[1];
		// names[1] = names[3];
		// names[3] = exchan;
		// System.out.println("변경 후 : " + Arrays.toString(names));

		// int[] ascen = new int[]{5,2,3,1,4};
		// for(int i = 0; i < ; i--){
		// ascen[i] <

		// int i = 8;
		// int ans = 0;
		// while (i != 0) {
		// i = i / 2;
		// ans++;
		// }
		// System.out.println(ans);

		// 선택정렬

		// char ch01 = 'j';
		// boolean ch02 = (int)'a' <= ch01 && ch01 <= 'z';
		// System.out.println(ch02);
		//
		// boolean ch03 = 'A' <= ch01 && ch01 <= 'Z';
		// System.out.println(ch03);
		//
		// boolean ch04 = (int)'a' <= ch01 && ch01 <= 'z' || (int)'A' <= ch01 &&
		// ch01 <= 'Z';
		// System.out.println(ch04);
		//
		// boolean ch05 = (int)'a' <= ch01 && ch01 <= 'z' || 'A' <= ch01 && ch01
		// <= 'Z';
		// boolean ch05 = ch01 == ch04;
		// System.out.println(ch05);

		// char result = ' ';
		// int score = (int) (Math.random() * 101);
		// if (score > 95) {
		// result = 'S';
		// } else if (score > 89) {
		// result = 'A';
		// } else if (score > 79) {
		// result = 'B';
		// } else if (score > 69) {
		// result = 'C';
		// } else if (score > 59) {
		// result = 'D';
		// } else {
		// result = 'F';
		// }
		//
		// System.out.println("당신의 점수는 : " + score + "\t학점은 : " + result);

		// int score = (int)(Math.random()*46+55);
		// String result = "";
		// if(score > 94){
		// result = "A+";
		// }else{
		// switch(score / 10){
		// case 9:
		// result = "A";
		// break;
		// case 8:
		// result = "B";
		// break;
		// case 7:
		// result = "C";
		// break;
		// case 6:
		// result = "D";
		// break;
		//
		// default:
		// result = "F";
		// }
		// }
		// System.out.println("당신 점수는 : " + score + " 학점은 : " + result);

		// int result = 0;
		// for(int i = 8; i < 57; i++){
		// if(i % 2 == 0 || i % 3 == 0){
		// result += i;
		// System.out.println(i + "일 때 : " + result);
		// }
		// }
		// System.out.println("정답은 : " + result + "입니다");

		// int result = 0;
		// for(int i = 2; i < 10; i++){
		// if(i % 2 == 0){
		// System.out.println("짝수단 : " + i + "단");
		// System.out.println("홀수 곱");
		// for(int j = 1; j < 10; j++){
		// if(j % 2 != 0){
		// result = i * j;
		// System.out.println(i + "*" + j + "=" + result);
		// }
		// }
		// System.out.println();
		// }
		// }

		// for (int j = 0; j < 5; j++) {
		// for (int i = 0; i < j+1; i++) {
		// System.out.print("*");
		// }
		// System.out.println();
		// }

		// int sum = 0;
		// int j = 0;
		// while(j < 101){
		// sum += j+1;
		// j++;
		// }
		// System.out.println(sum);
		//
		// int sum1 = 0;
		// for(int i = 0; i < 101; i++){
		// sum1 += i + 1;
		// }
		// System.out.println(sum1);

		// int sum = 0;
		// int i = 0;
		// while(sum + i < 200){
		// sum += ++i;
		// }
		// System.out.println(sum);
		// System.out.println(i);

		// Scanner num = new Scanner(System.in);
		//
		// System.out.println("숫자를 입력하세요");
		// int numbers = num.nextInt();
		//
		// int sum = 0;
		// while(numbers != 0){
		// sum += numbers % 10;
		// numbers /= 10;
		// }
		// System.out.println("입력받은 숫자의 각 자리의 합 : " + sum);

		// Scanner n1 = new Scanner(System.in);
		//
		// System.out.println("시작 숫자를 입력해주세요");
		// double num1 = n1.nextInt(); // 2
		//
		// System.out.println("끝 숫자를 입력해주세요");
		// double num2 = n1.nextInt(); // 4
		//
		// double numSub = 1;
		// while(num1<=num2){
		// numSub *= num1;
		// num1++;
		// }
		// System.out.println("입력한 숫자의 곱 입니다 : " + numSub);

		// Scanner count = new Scanner(System.in);
		// System.out.println("몇 번째 수를 알고 싶나요? : ");
		// int user = count.nextInt();
		//
		// int d1 = 1;
		// int d2 = 1;
		// int sum = 0;
		//
		// int a = 2;
		// while (a < user) {
		// sum = d1 + d2;
		// a++;
		// if (a == user) {
		// break;
		// }
		// d1 = d2 + sum;
		// a++;
		// if (a == user) {
		// break;
		// }
		// d2 = sum + d1;
		// a++;
		// if (a == user) {
		// break;
		// }
		// }
		// System.out.println(sum);

//		String str = "12o34"; // str[0] = '1' str[1] = '2' ....
//		char cha = ' ';
//		boolean isNumber = true;
//
//		for (int i = 0; i < str.length(); i++) {
//			cha = str.charAt(i);
//			if (cha <= '1' && cha <= '9' || 'a' <= cha && cha <= 'z') {
//				i
//			}
//		}
//		if (cha == isNumber) {
//			System.out.println(str + " 숫자입니다");
//		}
//		System.out.println(str + " 숫자가 아닙니다");
		
		int[] ballArr = {1,2,3,4,5,6,7,8};
		int[] ball3 = new int[3];
		
		//ballArr의 index순서대로 index의 요소와 임의의 요소를 골라서 값을 바꾼다
		int bang1 = 0;
		
		for(int i = 0; i < ballArr.length; i++){//이거 자리 바꾸는거 구나? 템프방 주고 순서 바꾸는거
			int rand = (int)(Math.random()*8);
			ballArr[bang1] = ballArr[i];
			ballArr[i] = ballArr[rand];
			ballArr[rand] = ballArr[bang1];
		}
		for(int j = 0; j < ball3.length; j++){
			ball3[j] = ballArr[j];
			System.out.println(ball3[j]);
		}
		
		
		

	}
}
