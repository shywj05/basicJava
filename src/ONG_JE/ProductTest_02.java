package ONG_JE;

import java.util.Arrays;
import java.util.Vector;

class ProductTest_02 {

	public static void main(String[] args) {

		Customer custom = new Customer("손님1", 1000000, 10);
		

	}

}

// 손님관리
class Customer {
	String name;
	int money;
	int mileage;

	Vector<Customer> customCount = new Vector<>();

	public Customer(String name, int money, int mileage) {
		this.name = name;
		this.money = money;
		this.mileage = mileage;
		
	}
	
	

	@Override
	public String toString() {
		return "Customer [name=" + name + ", money=" + money + ", mileage="
				+ mileage + "]";
	}
}

// 영수증
class Resit {
	// 제품이름 불러오기, P

}

// 환불
class Refund {
	// 고객명 불러오기

	// 고객이 산 제품 불러오기

	// 환불 가능여부 확인하기

	// 환불 가능한 제품 환불해주기

}

// 거스름돈 주기
class ExChange {
	// 고객 현금 불러오기(현금 전부 줬다는 가정 하)

	// 제품가격 불러오기

	// 제출한 현금에서 제품 가격을 뺀 나머지 돌려주기

}
