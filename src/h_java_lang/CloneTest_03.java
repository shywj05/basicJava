package h_java_lang;

public class CloneTest_03 {
	public static void main(String[] args) {

		Circle c = new Circle(50, new Point(100, 100));

		System.out.println(c);

		Circle cCopy = (Circle) c.deepCopy();

		System.out.println(cCopy);

		c.r = 300;
		c.p.x = 1051;

		System.out.println(c);
		System.out.println(cCopy);

	}
}

class Circle implements Cloneable {
	int r;
	Point p;

	Circle(int r, Point p) {
		this.r = r;
		this.p = p;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", p=" + p + "]";
	}

	protected Object shallowCopy() {
		Object oc = null;
		try {
			oc = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return oc;
	}

	protected Object deepCopy() {
		Object oc = null;
		try {
			oc = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		//문제점 : 점을 공유하기 때문에
		Point newp = new Point(p.x, p.y);
		((Circle)oc).p = newp; //다운캐스팅을 해야된다
		
		return oc;
	}

}
