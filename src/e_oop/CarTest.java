package e_oop;

public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();
		
		Car c2 = new Car("white","auto",4);
		
		Car c3 = new Car("auto4");
		
		Car c4 = new Car("pupple","4matic");
		
		
	}
}


class Car{
	String color;
	String geartype;
	int door;
	
	Car(){
		color = "black";
		geartype = "stick";
		door = 4;
	}
	
	Car(String color, String gearType, int door){
		 this.color = color;
		 this.geartype = gearType;
		 this.door = door;
	}

	Car(String gearType){
		this();
		this.geartype = gearType;
	}
	
	Car(String color, String gearType){
		this();
		this.color = color;
		this.geartype = gearType;
		
	}
	
	
	
	
}