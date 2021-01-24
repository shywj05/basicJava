package ONG_JE;

public class Prac_02_interface {

	public static void main(String[] args) {

	}

}

class Unit{
	int x;
	int y;
	
	void move(int x, int y){
		
	}
	
	void stop(){
		
	}
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		super.move(x, y);
	}
}
interface Movable{//인터페이스는 구현부가 없다.
	void move(int x, int y);
}

interface Attable{
	void attack(Unit u);
}
