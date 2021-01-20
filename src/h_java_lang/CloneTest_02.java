package h_java_lang;

import java.io.Serializable;
import java.util.Arrays;

public class CloneTest_02 {

	public static void main(String[] args) {

		//1. 점 3개를 저장해주세요 100,100 200,200 100,200
		Point p1 = new Point(100, 100);
		Point p2 = new Point(200, 200);
		Point p3 = new Point(100, 200);
		
		Point[] parr = new Point[]{p1, p2, p3};
		
		Point[] pcopy = parr.clone(); //얕은 복사이기 때문에 클론시키면 값만 클론하니까
		//pcopy라는 주소의 배열 모양이 똑같이 복사되고 배열 안에는 parr 처럼 배열 안에 값(int값)이 들어있는게아니고
		//pcopy에는 parr의 'p1의 주소'가 들어있다.
		
		System.out.println(Arrays.toString(parr));
		System.out.println(Arrays.toString(pcopy));
		
		
	}

}


class Point implements Serializable{
	int x;
	int y;
	
	//매개변수 두개의 생성자
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
	

	

	
	

	
	
	
	
}
