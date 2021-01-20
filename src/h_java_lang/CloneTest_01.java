package h_java_lang;

public class CloneTest_01 {

	public static void main(String[] args) {

		CloneEx ce = new CloneEx(10, 20);
		CloneEx ceClone = (CloneEx) ce.clone();// 다운캐스팅 해준다.

		System.out.println(ce);
		System.out.println(ceClone);

		ce.x = 50;

		System.out.println(ce);
		System.out.println(ceClone);

		CloneEx ce1 = new CloneEx(0, 0);
		CloneEx ce2 = new CloneEx(0, 0);
		CloneEx ce3 = new CloneEx(0, 0);

		// CloneEx[] carr = new

	}

}

class CloneEx implements Cloneable { // 임플리먼트 클론어블을 통해 가져올 수 있다.
	// 클론 접근 제어자 프로텍티드라서 접근이 어려워 인터페이스 통해 접근

	int x;
	int y;

	public CloneEx(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	@Override //오버라이드 알 + 쉬 + v + 스페이스 + 알텝 + 엔터
	protected Object clone() {// 클론이엑스 객체에 대한 클론
		Object oc = null;
		// 초기화가 안되니까
		// 리턴에 바로 쓰면 확장을 할 수가 없다.

		try {
			oc = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return oc;
	}

	@Override
	public String toString() { // 투스트링 alt + shift + s + s, enter
		return "CloneEx [x=" + x + ", y=" + y + "]";
	}

}
