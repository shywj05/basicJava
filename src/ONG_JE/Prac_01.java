package ONG_JE;

import java.util.Vector;

class Prac_01 {
	public static void main(String[] args) {
		DBClass db = new DBClass();
		Product pro = new Product("삼보", 100);
		db.addPro(pro);
		db.outPro();
		
		Customer1 cus = new Customer1("손님1", 10000000);
		db.addCus(cus);
		db.outCus();
		
		
		
	}

}

class Product {
	// 제품의 속성
	String name;
	int price;

	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "제품목록 [name=" + name + ", price=" + price + "]";
	}
	
	
}

class Customer1{
	String name;
	int money;
	int mileage;
	
	Customer1(String name, int money){
		this.name = name;
		this.money = money;
		this.mileage = 0;
	}

	@Override
	public String toString() {
		return "손님1 [name=" + name + ", money=" + money + ", mileage="
				+ mileage + "]";
	}
	
	
}



class DBClass {//각 종 데이터베이스만 묶은 클래스
	//제품들의 묶음
	Vector<Product> vPro = new Vector<>();

	boolean addPro(Product pro) {
		boolean result = vPro.add(pro);
		return result;
	}
	
	void outPro(){
		for(int i = 0; i < vPro.size(); i++){
			Product result = vPro.get(i);
			System.out.println(result);
		}
	}

	
	//고객들의 묶음
	Vector<Customer1> vCus = new Vector<>();
	
	boolean addCus(Customer1 c){
		boolean result = vCus.add(c);
		return result;
	}
	
	void outCus(){
		for(int i = 0; i < vCus.size(); i++){
			Customer1 result = vCus.get(i);
			System.out.println(result);
		}
	}
	
}