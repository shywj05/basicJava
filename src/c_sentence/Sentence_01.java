package c_sentence;

public class Sentence_01 {
	public static void main(String args[]){
	/*
	1. 조건문(if, switch)
	  - 조건식과 문장을 포함하는 블럭{}으로 구성되어 있다.
	  - 조건식의 결과에 따라서 프로그램의 실행 흐름을 변경할 수 있다.
	   예)로그인 할때, 
	1-1. if문
		- 구조
		  (1) 기본
		  	   if(조건식1){
		  	   		조건문의 결과가 true일 때 수행하는 문장 
		  	   }
		  (2) 1단 변형
		  	   if(조건식1){
		  	   		조건문의 결과가 true일 때 수행하는 문장
		      }else{
		      		조건문의 결과가 false일 때 수행하는 문장
		      }
	*/
		int num = 10;
		if(num > 0){
			System.out.println("양수");
		}else{
			System.out.println("양수가 아님");
		}
		
		 /*
		  (3) 2단 변형
		  	   if(조건식1){
		  	   		조건문의 결과가 true일 때 수행하는 문장
		      }else if(조건식2){
		      		조건식1의 결과가 false이고 조건식2가 true일 때
		      }else{
		      		조건식1,2의 결과가 false일 때
		      }
		  */
		int num1 = 10;
		if(num1 > 0){
			System.out.println("양수");
		}else if(num1==0){
			System.out.println("0이다");
		}else{
			System.out.println("음수이다");
		}
		
		int score = (int)(Math.random()*101);
		//0이상 100이하의 형태로 바꾸고 =0이상 101미만 = 포함, 미포함
		System.out.println(score);
		
		if(score >= 90){
			System.out.print("A");
			if(score>=95){
				System.out.println("+");
			}else{
				System.out.println("-");
			}
			
		}else if(score>=80){
			System.out.print("B");
			if(score>=85){
				System.out.println("+");
			}else{
				System.out.println("-");
			}	
			
		}else if(score>=70){
			System.out.print("C");
			if(score>=75){
				System.out.println("+");
			}else{
				System.out.println("-");
			}	
			
		}else if(score>=60){
			System.out.print("D");
			if(score>=65){
				System.out.println("+");
			}else{
				System.out.println("-");
			}	
			
		}else{
			System.out.println("F");
		}
			
		/*
		평균키 측정
		 */
		int leng = (int)(Math.random()*45+155); //175이상 200미만
		
		if(leng>=175){
			System.out.print(leng + "cm" + " 평균이상입니다.");
			if(leng>=180){
				System.out.println(leng + "cm" + "와 키 대박 크시네요");
			}else{
				System.out.println(leng + "cm" + "와 키 좀 크시네요");
			}
		}else{
			System.out.println(leng + "cm" +  " 평균이하에요ㅠㅡㅠ");
		}
		
		/*
		1-2. switch문
			- 조건의 경우의 수가 많을 때는 if문 보다는 switch문을 사용한다.
			- 간결해서 알아보기 쉽다.
			- 조건의 결과값으로 int형 범위의 정수값을 허용한다.
			- 구조
				switch(){
					case 값1:
						조건식과 값1이 같을 때 수행될 문장
						break; //이걸 꼭 써줘야 돼 까먹으면 주르륵 뜬다.
					case 값2:
						조건식과 값2이 같을 때 수행될 문장
						break;
					case 값3:
						조건식과 값3이 같을 때 수행될 문장
						break;
					default : 
					       조건식과 만족하는 case가 없을 때 수행될 문장
					    break; //default 경우에는 break 생략가능
				}
		 */
			int rand = (int)(Math.random()*5+1);
			System.out.println(rand);
			
			switch(rand){
							case 1 : 
								System.out.println("아파트");
								break;
							
							case 2 : 
								System.out.println("자동차");
								break;
							
							case 3 :
								System.out.println("놋북");
								break;
								
							case 4 :
								System.out.println("자전거");
								break;
							
							default : 
								System.out.println("다음기회");
								break;
								
		
			}
			//int score1 = (int)(Math.random()*101);
			//1. season변수를 선언하고 1~12사이의 임의의 정수값 초기와
			int sea = (int)(Math.random()*101);
			
			switch(sea){
			case 12: case 1: case 2:
				System.out.println("겨울");
				break;
			case 3: case 4: case 5:
				System.out.println("봄");
				break;
			case 6: case 7: case 8:
				System.out.println("여름");
				break;
			case 9: case 10: case 11:
				System.out.println("가을");
				break;
						}
			
			int sco = (int)(Math.random()*101+0);
			System.out.println("당신의 점수 : " + sco);
			
			switch(sco/10){
			case 10: case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default:
				System.out.println("F");
			}
			
			
			}
	}

