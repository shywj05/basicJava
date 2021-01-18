package f_OOP2;

public class Interface_01 {
	public static void main(String[] args) {

		Fight f = new Fight();
		
		System.out.println(f instanceof Fight);//instanceof는 형변환 가능한지 확인해 주는 녀석이다.
		System.out.println(f instanceof Unit);
		System.out.println(f instanceof Object);
		
		System.out.println(f instanceof Fightable);
		//f는 Fightable의 구현체이다.
		Fightable ff = f;//다형성
		System.out.println(f instanceof Movable);
		Movable mv = new Fight();
		
		System.out.println(f instanceof Attackable); //형변환 가능 
		Attackable at = new Fight();
		
		
			
		}
	}

class Fight extends Unit implements Fightable{//인터페이스 구현 시 implement를 쓴다.

	@Override
	public void attack(Unit u) {//Fightable의 implement니까 
		
	}

	@Override
	public void move(int x, int y) {//인터페이스 Fightable을 구현하고  Unit의 클래스를 상속받는 Fight클래스니까 오버라이드해서 사용
									// 
	}
	
}

interface Fightable extends Movable, Attackable{//인터페이스는 다중 상속이 가능하다. 어차피 몸통에 아무것도 없으니까  상관없지
	
}

interface Movable{
	void move(int x, int y);//인터페이스 구현부는 추상메서드로 만들어져야 하기 때문에 구현부가 없어야 한다.
}

interface Attackable{
	void attack(Unit u);//접근 제어자가 생략되어 있지? public abstract
}









