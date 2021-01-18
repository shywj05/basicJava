package f_OOP2;

public class PointTest {
	public static void main(String[] args) {

		
		
	}
}


class Point2{
	int x;
	int y;
	
	Point2(int x, int y){
		
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point2{
	int z;
	Point3D(int x, int y, int z){
		super(x, y); //모든 생성자는 기본 부모의 생성자를 호출하게 되어있다
		this.z = z;
		
	}
	
	
}
