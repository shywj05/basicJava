package d_array;

public class Array_03 {
	public static void main(String[] args) {
		/*
		 * 1. 정렬(sort) - 여러 데이터를 빠르고 쉽게 찾기 위해 일정한 순서대로 데이터를 가지런히 나열하는 작업이다. - 종류
		 * 세가지 : 버블정렬, 선택정렬, (삽입정렬)
		 * 
		 * 2. 버블정렬(bubble sort) - 인접한 데이터 간에 교환이 계속해서 일어나면서 정렬이 이루어진다. - 가장 큰 값이
		 * 맨 뒤에 위치한다.
		 */
		// 1. 5개의 정수 5,2,3,1,4 변수 sortNum에 저장해주세요

		int[] sortNum = { 5, 2, 3, 1, 4 };

		// 2. 버블 정렬을 이용하여 정렬해주세요

		// if(sortNum[0]>sortNum[1]){
		// int num = sortNum[1];********************5를 임시 저장해
		// sortNum[1]=sortNum[0];
		// sortNum[0]=num;
		// }
		// for(int i=0;i<sortNum.length;i++){
		// System.out.print(sortNum[i]+",");
		// }
		// System.out.println();
		//
		// if(sortNum[1]>sortNum[2]){
		// int num = sortNum[2];
		// sortNum[2]=sortNum[1];
		// sortNum[1]=num;
		// }
		// for(int i=0;i<sortNum.length;i++){
		// System.out.print(sortNum[i]+",");
		// }
		//
		// System.out.println();
		//
		// if(sortNum[2]>sortNum[3]){
		// int num = sortNum[3];
		// sortNum[3]=sortNum[2];
		// sortNum[2]=num;
		// }
		// for(int i=0;i<sortNum.length;i++){
		// System.out.print(sortNum[i]+",");
		// }
		//
		// System.out.println();
		//
		// if(sortNum[3]>sortNum[4]){
		// int num = sortNum[4];
		// sortNum[4]=sortNum[3];
		// sortNum[3]=num;
		// }
		// for(int i=0;i<sortNum.length;i++){
		// System.out.print(sortNum[i]+",");
		// }
		//
		// 시작 0 끝 3 증가 1
		// 반복
		// if(sortNum[?]>sortNum[?+1]){
		// int num = sortNum[?+1];
		// sortNum[?+1]=sortNum[?];
		// sortNum[?]=num;
		// }
		// for(int i=0;i<sortNum.length;i++){
		// System.out.print(sortNum[i]+",");
		// }
		//
		// System.out.println();

		// for(int i=0;i<sortNum.length-1;i++){
		// if(sortNum[i]>sortNum[i+1]){
		// int num = sortNum[i+1];
		// sortNum[i+1]=sortNum[i];
		// sortNum[i]=num;
		// }
		// for(int j=0;j<sortNum.length;j++){
		// System.out.print(sortNum[j]+",");
		// }
		// System.out.println();
		// }
		//
		// System.out.println();

		// if(sortNum[0]>sortNum[1]){
		// int num = sortNum[1];
		// sortNum[1]=sortNum[0];
		// sortNum[0]=num;
		// }
		// for(int i=0;i<sortNum.length;i++){
		// System.out.print(sortNum[i]+",");
		// }
		// System.out.println();
		//
		// if(sortNum[1]>sortNum[2]){
		// int num = sortNum[2];
		// sortNum[2]=sortNum[1];
		// sortNum[1]=num;
		// }
		// for(int i=0;i<sortNum.length;i++){
		// System.out.print(sortNum[i]+",");
		// }
		//
		// System.out.println();
		//
		// if(sortNum[2]>sortNum[3]){
		// int num = sortNum[3];
		// sortNum[3]=sortNum[2];
		// sortNum[2]=num;
		// }
		// for(int i=0;i<sortNum.length;i++){
		// System.out.print(sortNum[i]+",");
		// }
		//
		// System.out.println();
		//
		// if(sortNum[3]>sortNum[4]){
		// int num = sortNum[4];
		// sortNum[4]=sortNum[3];
		// sortNum[3]=num;
		// }
		// for(int i=0;i<sortNum.length;i++){
		// System.out.print(sortNum[i]+",");
		// }
		//
		//
		//

		// for(int count=0;count<sortNum.length-1;count++){//회전수
		// System.out.println(count+1+"회전");
		// for(int i=0;i<sortNum.length-1-count;i++){//버블의 수//-count 맨끝 5가 확정되면
		// 그만 둬라
		// if(sortNum[i]>sortNum[i+1]){
		// int num = sortNum[i+1];
		// sortNum[i+1]=sortNum[i];
		// sortNum[i]=num;
		// }
		// for(int j=0;j<sortNum.length;j++){
		// System.out.print(sortNum[j]+",");
		// }
		// System.out.println();
		// }
		//
		// System.out.println();
		// }
		//
		//
		// /*
		// 3. 선택정렬(select sort)
		//
		//
		// */
		//
		int[] sort = { 5, 2, 3, 1, 4 };
		//
		// int bang = 0;
		// int min = sort[0];
		// for(int num=1;num<sort.length;i++){
		// if(min > sort[num]){
		// min = sort[num];
		// bang = num;
		// }
		// }
		// System.out.println(min);
		//
		//
		// //방바꾸기
		//
		// int temp = sort[0];
		// sort[0] = sort[bang];
		// sort[bang] = temp;
		//
		//
		//
		// for(int j=0;j<sort.length;j++){
		// System.out.print(sort[j]+",");
		// }
		//
		//
		// //2회전 시작
		//
		//
		// int bang = 1;
		// int min = sort[1];//기준!!!이제 1번
		// for(int num=1+1;num<sort.length;i++){//비교는 1번방 다음부터 하면되니까 +1 추가!!!!!/
		// 기준방을 0번으로 가지고 있던게 1번으로 바뀐 것 , 총 5개 바뀐다
		// if(min > sort[num]){
		// min = sort[num];
		// bang = num;
		// }
		// }
		// System.out.println(min);
		//
		//
		// //방바꾸기
		//
		// int temp = sort[1];
		// sort[1] = sort[bang];
		// sort[bang] = temp;
		//
		//
		// for(int j=0;j<sort.length;j++){
		// System.out.print(sort[j]+",");
		// }
		//

		// 시작 0 끝 3 증가량 1
		// 반복구문
		// int bang = 1;
		// int min = sort[1];//기준!!!이제 1번
		// for(int num=1+1;num<sort.length;i++){//비교는 1번방 다음부터 하면되니까 +1 추가!!!!!/
		// 기준방을 0번으로 가지고 있던게 1번으로 바뀐 것 , 총 5개 바뀐다
		// if(min > sort[num]){
		// min = sort[num];
		// bang = num;
		// }
		// }
		// System.out.println(min);
		//
		//
		// //방바꾸기
		//
		// int temp = sort[1];
		// sort[1] = sort[bang];
		// sort[bang] = temp;
		//
		//
		// for(int j=0;j<sort.length;j++){
		// System.out.print(sort[j]+",");
		// }

		for (int i = 0; i < sort.length - 1; i++) {// 회전 이면서 기준방
			int bang = i;
			int min = sort[i];// 기준!!!이제 1번
			for (int num = 1 + i; num < sort.length; num++) {// 비교는 1번방 다음부터
																// 5개 바뀐다
				if (min > sort[num]) {
					min = sort[num];
					bang = num;
				}
			}

			int temp = sort[i];
			sort[i] = sort[bang];
			sort[bang] = temp;

			for (int j = 0; j < sort.length; j++) {
				System.out.print(sort[j] + ",");
			}
			System.out.println();
		}

	}

}
