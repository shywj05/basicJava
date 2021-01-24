package ONG_JE;

public class Prac_03_equals {

	public static void main(String[] args) {
		Person p1 = new Person(121241248884L);
		Person p2 = new Person(121241248884L);
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		//오버라이드를 하기 전에는 주소값을 비교하기에 false였는데
		//오버라이드를 통해서 주소값에 있는 인스턴스의 
		
	}

}

class Person{
	long regNO;
	Person(long regNo){//매개변수 1개의 생성자
		this.regNO = regNo;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person){
			Person p = (Person)obj;//형변환이 가능하면 새로운 주소를 만들고 넣어주자
//			this.regNO = p.regNO;
//			return true;
			return this.regNO == p.regNO;//이 방법이 더 맞겠다
			//위에껀 값을 넣어서 억지로 true를 뽑은거고
			//이 방법은 this.과 p.의 주소안에 있는 값의 비교 결과에 따라 true나 false를 반환하기 때문에
			//지금은 어떤 주소안에 있는 결과에 대한 비교를 원하기 때문에 이게 더 맞다.
			
		}
		return false;
	}
	
	
}
