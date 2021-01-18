package f_OOP2;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

public class DrawShape extends Frame {
	public static void main(String[] args) {

		DrawShape ds = new DrawShape();

	}

	DrawShape() { // 생성자
		super("밥신청하세요");
		setSize(500, 500);
		setBackground(Color.PINK);
		setVisible(true);
		setResizable(false);
	}

	public void paint(Graphics g) {
		// 1. 매개변수가 두개인 생성자를 이용하여 원을 만들어주세요 변수 이름 c
		Point pp = new Point(100, 100);
		Circle c = new Circle(50, pp);
		
		// 2. g.drawOval()를 이용하여 원을 그려주세요
		g.drawOval(c.p.x, c.p.y, c.r * 2, c.r * 2); // x, y, 반지름, 반지름
		
		// 3. 매개변수가 하나인 생성자를 이용하여 삼각형을 만들어 주세요 : 변수 p
		// 100, 100 200, 200 100, 200
		Point p1 = new Point(100, 100);
		Point p2 = new Point(200, 200);
		Point p3 = new Point(100, 200);

		Point[] p4 = new Point[] { p1, p2, p3 };

		Triangle t = new Triangle(p4);
		// 4. g.drawLine() 3개를 이용하여 삼각형을 그려주세요
		g.drawLine(100, 100, 200, 200);
		g.drawLine(200, 200, 100, 200);
		g.drawLine(100, 100, 100, 200);
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle {
	// 1. 반지름(정수)를 저장할 수 있는 변수 r을 선언해주세요
	int r;
	// 2. 중심점을 저장할 수 있는 변수 p를 선언해주세요
	Point p;

	// 3. 매개변수가 두개인 생성자를 만들어주세요
	Circle(int r, Point p) {
		this.r = r;
		this.p = p;
	}

	// 4. 기본생성자를 만들어주세요
	// 단, 매개변수가 두개인 생성자를 이용하여 100,100반지름 50으로 초기화해주세요 // 인스턴스 메서드를 초기화 할 방법으로
	// 사용한다.
	Circle() {
		this(50, new Point(100, 100));
	}
}

class Triangle {
	// 1. 점3개를 저장할 수 있는 변수 p를 선언해주세요.
	Point[] p;

	// 2. 매개변수가 한개인 생성자를 만들어 주세요.
	Triangle(Point[] p) {
		this.p = p;
	}

	// 3. 매개변수가 세개인 생성자를 만들어 주세요.
	Triangle(Point x, Point y, Point z) {
		Point[] p = new Point[] { x, y, z };
	}
}