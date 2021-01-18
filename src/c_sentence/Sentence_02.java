package c_sentence;

import java.util.Scanner;

public class Sentence_02 {
	public static void main(String[] args) {
		/*
		1. 반복문(for, while, do-while)
			- 어떤 작업을 반복적 수행할 때
			- 주어진 조건 만족하는 동안 주어진 문장을 반복적으로 수행함으로 조건식 포함
			- for문은 반복횟수를 알 때, while문은 반복횟수 모를 때 사용한다.
		*/
		/*
		1-1, for문
			-구조
				for( 초기화 ; 조건식 ; 증감식 ){ **어디서 시작하고 어디까지 하고 얼마씩 증가하냐**
					조건식 만족할 경우 수행하는 문장
				}
		 	초기화 ==> (조건식 ==> 수행 ==> 증감식)
		 	 			**이 부분 반복** 만족 안하면 빠져나옴		 	 			
		 */
//		0~10 까지 출력
//		System.out.println(0);
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);
//		System.out.println(7);
//		System.out.println(8);
//		System.out.println(9);
//		System.out.println(10);
//		시작 : 0; 끝  : 10; 증가량 : 1
//		수행문장 : syso(??);
		for(int f = 0; f < 101; f++){
			System.out.println(f);
		}
		
//		Hello Java 
		for(int i = 1; i < 4; i++){
			System.out.println("Hello Java");
		}
		
//		합계 저장 5~17
//		int sum = 0;
//		sum += 5;     
//		sum += 6;
//		sum += 7;
//		sum += 8;
//		sum += 9;
//		sum += 10;
//		sum += 11;
//		sum += 12;
//		sum += 13;
//		sum += 14;
//		sum += 15;
//		sum += 16;
//		sum += 17;
//		초기화 int sum = 5;
//		조건식 sum < ;
//		증감식 sum++
//		시작 : 5; 끝 : 17; 증가량 : 1
//		반복구문 : sum += ??
		
		int sum = 0;
		for(int count = 5; count < 18; count++){
			sum += count;
						}
		System.out.println(sum);
		
		
//		연습문제 p.55
//		1.
		for(int i=0; i < 6; i++){
			System.out.println(i);	
		}
//		2.
		for(int i= 5; i > -1; i--){
			System.out.println(" 2번의 답" + i);	
		}
//		3.
//		시작 : 2 ; 끝 : 10, 증가량 : 1
//		반복구문 : i += 1
		int d = 0;
		for(int k = 2; k < 11; k++){
			d += k;
		}
			System.out.println("3번의 답" + d);
			
//		4.
//		시작 : 5; 끝 : 15; 증가량 : 1
//		반복구문 : i1 *= ??;
			long k = 1;
			for(long i1 = 5; i1 < 15; i1++){
				k *= i1;
			}
			System.out.println(k);
		
//		5.
//		시작 : 3; 끝 : 4462; 증가량 : 1
//		반복 : 
			int j = 0;
			for(int i = 3; i < 4463; i++){
				if(i % 2 == 0){
					j += i;
				}
				}System.out.println("5) " + j);
	

//		6.
//		시작 : 8; 끝 : 56; 증가량 :1
		int h = 0;
		for(int i = 8; i < 67; i++){
			if(i % 2 ==0 || i % 3 == 0){
			h += i;
			}
		}System.out.println("6) " + h);
		
//		구구단 출력
//		2 * 1 = 2;
//		System.out.println("2 * 1 = " + 2);
//		System.out.println(2 + "*" + 1 + "=" + 2 * 1);
//		System.out.println(2 + "*" + 2 + "=" + 2 * 2);
//		System.out.println(2 + "*" + 3 + "=" + 2 * 3);
//		System.out.println(2 + "*" + 4 + "=" + 2 * 4);
//		System.out.println(2 + "*" + 5 + "=" + 2 * 5);
//		System.out.println(2 + "*" + 6 + "=" + 2 * 6);
//		System.out.println(2 + "*" + 7 + "=" + 2 * 7);
//		System.out.println(2 + "*" + 8 + "=" + 2 * 8);
//		System.out.println(2 + "*" + 9 + "=" + 2 * 9);
		
//		시작 : 1; 끝 : 9; 증가 : 1
//		반복 : syso(2 + "" + ?? + "" + 2 * ??);
		
//		구구단을 구하고 짝수단의 홀수의 결과를 뽑아라
		for(int i = 2; i < 10; i++){
			for(int in = 1; in < 10; in++){
				if(i % 2 ==0 && in % 2 !=0){
				System.out.println(i + "*" + in + "=" + i * in);
				}
			}
					
		}
		
//		1-2. while문
//			- 조건식과 수행해야할 블럭{}만으로 구성됐다
//			- 기본구조
//				while(조건식){
//					조건식이 true일 때 수행될 문장	
//				}
//				}
		//1. 0~10까지 출력
//		초기화
//		while(조건식){
//			수행문장
//			증감식
//		}
		
		int count = 0; //for문에서 while문으로 쓰면 변수를 못 쓰잖아
		while(count < 10){
			System.out.println(count);
			count++;
		}
		
		//5~15까지의 합
		
		int hap = 0;
		int count1 = 5;
		while(count1 < 16){
			hap += count1;
			count1++;
		}		System.out.println(hap);
		
		//구구단 while문으로 만들어주세요
		for(int i = 2; i < 10; i++){
			for(int in = 1; in < 10; in++){
				System.out.println(i + "*" + in + "=" + i * in);
				}
			}
					
//		}
//		int dan1 = 2;
//		while(dan < 10){
//				System.out.println(dan1 + "*" + dan1 + "=" + i * in);
//				dan1++;
//		}
//		int gob1 = 1;
//			while(gob<10){
//				System.out.println(i + "*" + in + "=" + i * in);
//				gob++;
//			}
//		}
			
		// 7~? 합이 200 이상 될 때 ?의 값을 구해
		
			
//		int a = 0;
//		int i = 6;
//			while(a < 200){
//				i++;
//				a += i;
//			}
//			System.out.println("? 의 값 "+i);
//							
			int a = 0;
			int i = 7;
				while(true){//true 쓰면 무한히 반복한다
					a += i;
					if(a >= 200){
						break;
					}
					i++;
					
				}
				System.out.println(i);
			
			/*
			4. do-while
			  - 최초 1회는 무조건 반복문 실행
			  - 구조
			    do{
			    	실행문장
			    }while(조건문);
			 */
			
				
//			1. 사용자로부터 문자를 입력받는다.
				Scanner sc = new Scanner(System.in);
//		    2. 입력받은 문자 출력한다.
				String input = null;
				do{
				System.out.println("문자를 입력해주세요 단, exit 입력 시 종료됩니다.");
				input = sc.next();
//			3. 단, 입력받은 문자가 "exit"이면 반복 멈춘다 
				System.out.println(input);
				} while(!"exit".equals(input));
				
				
				for(int i3 = 1; i3 < 100; i3++){
					if(i3 % 2 == 0){
						System.out.println(i3);
					}
				}
		
				for(int i2 = 1; i2 < 100; i2++){
					if(i2 % 2 != 0){
						continue;
					}
					System.out.println(i2);
				}
				
		
		
	}
	}
	

