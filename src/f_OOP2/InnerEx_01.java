package f_OOP2;

public class InnerEx_01 {
	public static void main(String[] args) {
		System.out.println(InnerEx_01.StaticInner.cv);
		
		InnerEx_01.StaticInner sc = new InnerEx_01.StaticInner();
		
		InnerEx_01 ie = new InnerEx_01();
		
		InnerEx_01.InstanceInner ii = ie.new InstanceInner(); 
		
	}

	static class StaticInner {
		static int cv = 300;
		int iv = 200;
	}

	class InstanceInner {
		int iv = 50;
		// static int cv = 70; //사용 불가
		static final int CCC = 90; // 상수는 가능
	}
	
	void method(){
		class LocalInner{//메서드가 호출되어야만 로드되는 클래스
			int iv = 20;
//			static int cv = 30;// 사용불가
		}
		
	}

}
