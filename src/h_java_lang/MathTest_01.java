package h_java_lang;

import static java.lang.Math.*;//import로 써주면 아래 Math.생략해도 된다.

public class MathTest_01 {

	public static void main(String[] args) {
		//그 동안 반올림 하느라 고생하셨습니다.
		//Math클래스의 메서드를 이용하여 반올림을 해봅시다.
		
		double d = 3.1415926535;
		
		//반올림
		Math.round(d);
		System.out.println(round(d));
		
		//올림
		System.out.println(ceil(d)); //반환타입을 생각해야한다.
		
		
		//버림
		System.out.println(floor(d)); 
		
		//제곱
		System.out.println(pow(3, 3));
		
		//루트
		System.out.println(sqrt(4));
		
		//Point2메서드의 getDistance메서드를 호출하여 두점사이의 거리를 구해주세요
		Point2 po1 = new Point2(100, 200);
		Point2 po2 = new Point2(200, 200);
		
		float result = po1.getDistance(po2);
		System.out.println(result);
		
	}

}

class Point2{
	int x;
	int y;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point2 [x=" + x + ", y=" + y + "]";
	}
	
	float getDistance(Point2 po2){
		float result = (int)(sqrt(pow(x-po2.x, 2) + pow(y-po2.y, 2))*10+0.5) / 10f;
		return result;
	}
	
}


