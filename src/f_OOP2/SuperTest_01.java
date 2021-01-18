package f_OOP2;

public class SuperTest_01 {
	public static void main(String[] args) {
		
		
		
	}
}


class Parent2{
	int x = 10;
	int y = 20;
	
	int getAdd(){
		
		return x + y;
	}
	
}

class Child2 extends Parent2{
	int x = 30;
	int z = 40;
	
	
	int getAdd(int x){ //선언부가 같아야 오버라이드 되는거야
		System.out.println(x); // 인자값x
		System.out.println(this.x); // 30
		System.out.println(super.x); // 10
		
		return super.getAdd();
	}
	
	
}

