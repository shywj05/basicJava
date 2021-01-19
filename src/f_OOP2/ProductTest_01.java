package f_OOP2;

import java.awt.event.ItemEvent;
import java.util.Vector;

public class ProductTest_01 {
	public static void main(String[] args) {

		Computer c = new Computer(80, "좋은컴퓨터");
		HandPhone h = new HandPhone(500, "좋은핸드폰");
		Styler s = new Styler(480, "좋은스타일러");

		Buyer hogang = new Buyer("호갱", 1000);
		DBClass db = new DBClass();
		boolean result = db.addBuyer(hogang);

		hogang.buy(s);
		hogang.buy(h);
		hogang.buy(s);
		hogang.buy(h);

		System.out.println(hogang.item);

		// summary
		hogang.summary();

		// refund
		hogang.refund(s);

		// summary
		hogang.summary();

	}
}

class Product {
	int price;
	String name;
	int mileage;

	public Product(int price, String name) {
		this.price = price;
		this.name = name;
		mileage = price / 20;
	}
}

class Computer extends Product {
	public Computer(int price, String name) {
		super(price, name);

	}

	@Override
	public String toString() {
		return "Computer";
	}
}

class HandPhone extends Product {
	public HandPhone(int price, String name) {
		super(price, name);
	}

	@Override
	public String toString() {
		return "HandPhone";
	}

}

class Styler extends Product {
	public Styler(int price, String name) {
		super(price, name);
	}

	@Override
	public String toString() {
		return "Styler";
	}

}

class Buyer {
	String name;
	int money;
	int mileage;

	Vector item = new Vector();// 구매내역 저장

	public Buyer(String name, int money) {
		this.name = name;
		this.money = money;

	}

	void buy(Product p) { // Product p = new 핸드폰(); <-상위 클래스가 프로덕트니까 핸드폰, 스타일러 등
							// 종속되는게 참조가능하잖아 다형성으로
		// 1.구매할 여력이 있는지 확인
		// 1.1 나가
		// 1.2 판매진행
		// 돈 -> 줄어든다.
		// 마일리지 -> 늘어난다.
		// ~상품을 구매하셨습니다. 감사합니다.
		// if(money > p.price){
		// money -= p.price;
		// mileage += p.mileage;
		// System.out.println(p.toString() + "상품을 구매했습니다. 감사합니다.");
		//
		// } else{
		// System.out.println("다시 방문해주세요");
		// }

		if (money < p.price) {
			System.out.println("다시 방문해주세요");
			return;
		}
		money -= p.price;
		mileage += p.mileage;
		item.add(p); // 업캐스팅해서 오브젝트에 넣는다
		System.out.println(p.toString());

	}

	// void buy(HandPhone h) {
	// if (money < h.price) {
	// System.out.println("다시 방문해주세요");
	// }
	// money -= h.price;
	// mileage += mileage;
	// System.out.println(h.toString() + "상품을 구매했습니다. 감사합니다.");
	// }

	// void buy(Styler s) {
	// if (money < s.price) {
	// System.out.println("다시 방문해주세요");
	// }
	// money -= s.price;
	// mileage += mileage;
	// System.out.println(s.toString() + "상품을 구매했습니다. 감사합니다.");
	// }

	// 영수증만들기
	// 구매 할 때마다 쌓여야된다

	void summary() {
		System.out
				.println("=======================================================");
		System.out.println("\t영\t수\t증");
		System.out.println();
		System.out.println("구매내역");

		int sum = 0;
		for (int i = 0; i < item.size(); i++) {
			Product pro = (Product) item.get(i);// object 이기 때문에 Product로 다운캐스팅
												// 해야된다
			System.out.println(pro.name + " : " + pro.price);
			sum += pro.price;
		}
		System.out
				.println("===================================================");
		System.out.println("총 결재금액 : " + sum);
		System.out.println();
		System.out
				.println("===================================================");
		System.out.println(name + "님의 남은 돈은 " + money + "원 이고 마일리지는 " + mileage
				+ "점 입니다.");
		System.out.println(name + "님!! 감사합니다.");
	}

	// 반품 refund
	/*
	 * 1. 구매이력이 없는 경우 2. 구매했지만 우리 매장에서 구매한 것 만!! 자신이 구매한 물건일 때만 반품 가능
	 */
	void refund(Product p) {
		if (item.isEmpty()) {
			System.out.println("구매이력이 없습니다. 환불이 불가합니다.");
			return;
		}

		// if(item.remove(p)){//true ===== remove 가 for문도 다 돌려준다 그래서 for문이
		// 필요없어진다
		// //반납
		// money += p.price;
		// mileage -= p.price;
		// System.out.println(p+"를 반납했스비나");
		//
		// }else{
		// System.out.println("해당 물품 구매 내역이 없다");
		// }

		if (item.contains(p)) {
			System.out.println("환불진행합니다.");
			money += p.price;
			mileage -= p.mileage;
			item.remove(p);
			System.out.println(this.name + "님의 환불 제품 : " + p + ", 총 환불 금액 : "
					+ p.price);
			System.out.println("환불 후 고객님의 잔고는 : " + money + ", 마일리지는 : "
					+ mileage);
			return;
		}
		System.out.println("구매이력이 없습니다. 환불이 불가합니다.");

	}

}

// 구매내역이 필요하다 아래 거 하려면( 사람들 ,물건들, 구매역)
class Sale {
	static int seq = 1;
	int mount; // 갯수? 재고
	String date; // 구매날짜
	String mem_name; // 회원이름
	String pro_name; // 상품이름

	Vector sale = new Vector();

	public void ss(int mount, String data, String mem_name, String pro_name) {
		this.mount = mount;
		this.date = data;
		this.mem_name = mem_name;
		this.pro_name = pro_name;
	}
}

class DBClass {

	public boolean addBuyer(Buyer b) {
		boolean result = buyers.add(b);
		return result;

	}

	// 1. 사람들 관리 - 사람 이름, 사람 고유번호 id, 사람 마일리지, 사람들 자금
	Vector<Buyer> buyers = new Vector<>();// 와일드 카드라는 녀석이라고??때에 따라 알아서 바뀌는 거래

	// 메서드하나 만들어 바이어의 정보를 가지고 있는
	void man(Buyer b) {
		Buyer buy = buyers.get(0);
		System.out.println(buy);
	}

	// 2. 물건들 관리
	Vector<Product> products = new Vector<>();

	// 3. 구매내역
	Vector<Sale> sale = new Vector<>();

}
