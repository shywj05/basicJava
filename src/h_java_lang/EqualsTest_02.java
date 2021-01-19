package h_java_lang;

public class EqualsTest_02 {

	public static void main(String[] args) {

		Person p1 = new Person(9101021194551L);
		Person p2 = new Person(9101021194551L);

		Value v1 = new Value(10);

		System.out.println(p1 == p2);

		System.out.println(p1.equals(p2));// p2의 주소값

	}

}

class Person {
	long id;

	Person(long id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// Person pp = (Person)obj;
		// return this.id == pp.id;

		// 1.인자값 null
		// 2.인자값이 Person의 객체인지 확인
			boolean re = false;
			if (obj != null && obj instanceof Person) {
				Person p = (Person) obj;
				re = p.id == this.id;
			}
		return re;

	}
}
