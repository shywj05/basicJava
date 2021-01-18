package f_OOP2;

public class Interface_01 {
	public static void main(String[] args) {

		Fight f = new Fight();
		
		System.out.println(f instanceof Fight);
		System.out.println(f instanceof Unit);
		System.out.println(f instanceof Object);
		
		System.out.println(f instanceof Fightable);
		//f는 Fightable의 구현체이다.
		Fightable ff = f;//다형성
		System.out.println(f instanceof Movable);
		Movable mv = new Fight();
		
		
		
			
		}
	}

class Fight extends Unit implements Fightable{

	@Override
	public void attack(Unit u) {
		
	}

	@Override
	public void move(int x, int y) {

	}
	
}

interface Fightable extends Movable, Attackable{
	
}

interface Movable{
	void move(int x, int y);//구현부가 없어야 한다
}

interface Attackable{
	void attack(Unit u);
}









