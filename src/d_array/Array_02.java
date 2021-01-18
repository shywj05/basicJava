package d_array;

import java.util.Random;

public class Array_02 {
	public static void main(String[] args) {
		//2-26 p.72
		//(1)
		int[] score = new int[7];
		
		//(2)
		for(int i = 0; i < score.length; i++){
			score[i] = (int)(Math.random()*101);
			System.out.println("임의의 숫자 값 : " + score[i]);
		}
		
		//(3)
		int sum = 0;
		for(int i = 0; i < score.length; i++){
			sum += score[i];
		}
		System.out.println("더한 값 : " + sum);
		
		//(4)
//				score[0] = rand값
//				score[1] = rand
//				score[2] = rand
//				score[3] = rand
//				score[4] = rand
//				score[5] = rand
//				score[6] = rand
//				
//				다 더한게 sum = rand sum
		
		float av = 0;
		for(int i = 0; i < score.length; i++){
			av = (int)((float)sum / score.length * 100 + 0.5) / 100F;
		}
		System.out.println("각  평균 값의 총 합 : " + av);
		
		//(5)
		int max = 0;
		int com = 0;
		for(int i = 0; i < score.length; i++){
			max = score[i];
//			com = score[i+1];
			if(max <= com){
				max = com;
			}else{
				break;
			}
		}
		System.out.println("최댓값" + max);
		
		//(6)
		int min = 101;
		for(int i = 0; i < score.length; i++){
			if(min > score[i]){
				min = score[i];
			}
		}
		System.out.println("최솟값" + min);
		
		
	}

}
