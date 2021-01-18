package d_array;

public class Array_04 {
	public static void main(String[] args) {
		/*
		1. 다차원 배열
		  - 자바에서는 2차원 이상의 배열 허용
		  - 2차원 배열 선언방법
		  	선언방법 					선언예
		  	변수타입[][] 변수명;    int[][] arr;
		  	변수타입[] 변수명[];    int[] arr[];
		  	변수타입 변수명[][];    int arr[][];
		  	
		  
		 */
		int[][] arr = new int[2][3];
		
		for(int flor = 0; flor < 2; flor++){
			for(int bang = 0; bang < 3; bang++){
				System.out.println(arr[flor][bang]);
			}
		}
	
		
//		1.
		int [][] apt = new int[3][];
		apt[0] = new int[3];
		System.out.println(apt[0][0]);
		System.out.println(apt[0][1]);
		System.out.println(apt[0][2]);
		
		apt[1] = new int[4];
		System.out.println(apt[1][0]);
		System.out.println(apt[1][1]);
		System.out.println(apt[1][2]);
		System.out.println(apt[1][3]);

		apt[2] = new int[2];
		System.out.println(apt[2][0]);
		System.out.println(apt[2][1]);

		
		
		
		
		
		
		
	}

}
