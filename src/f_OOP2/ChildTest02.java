package f_OOP2;

public class ChildTest02 {
	public static void main(String[] args) {
		Child01 ch = new Child01();
		
		System.out.println("자식의 나이 : " + ch.age);
		System.out.println("부모의 나이 : " + ch.parentOld());
		System.out.println("자식의 이름 : " + ch.name);
		System.out.println("부모의 이름 : " + ch.parentOld());
		
		
	}
}

class Parent01{
	String name = "딩코박살";
	int age = 40;
	
	int parentOld() {
		return age;
	}
}

class Child01 extends Parent01{
	String name = "이쁜딸";
	int age = 5;
	
	int childOld() {
		return age;
	}
	
}
	
	
