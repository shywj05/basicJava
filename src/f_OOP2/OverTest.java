package f_OOP2;

public class OverTest {
	public static void main(String[] args) {
		
		OverGo og = new OverGo(); //og의 주소가 있어~객체생성
		
		String result = og.upMethod(); 
		System.out.println(result);
		
		// og.???? 뭐시기 써서 "OverUpMethod"가 찍히게 해와라
		String result2 = og.overMethod();
		System.out.println(result2);
		
	}
}

class OverUp{ //클래스..부모클래스
	String upMethod(){
		return "OverUpMethod";
		
	}
}


class OverGo extends OverUp{ //자식클래스
	//부모의 속성을 그대로 받아서 사용하지
	@Override
	String upMethod(){ //덮어씌우지
		return "OverGoMehtod";
		
	}
	
//	String overMethod(){
//		return super.upMethod();
//	}

	String overMethod(){
		String r = super.upMethod();
		return r;
	}
	
	
	String upMethod(int a){
		return a + "OverGo";
	}
	
}


