package f_OOP2;

public class PolyTest {
	public static void main(String[] args) {
		// 1. SmartTv 2대 저장해주세요
		SmartTv st1 = new SmartTv();
		SmartTv st2 = new SmartTv();

		SmartTv[] sm = new SmartTv[2];
		sm[0] = st1;
		sm[1] = st2;

		// 2. AfreecaTv 3대 저장
		AfreecaTv af1 = new AfreecaTv();
		AfreecaTv af2 = new AfreecaTv();
		AfreecaTv af3 = new AfreecaTv();

		AfreecaTv[] aft = new AfreecaTv[3];
		aft[0] = af1;
		aft[1] = af2;
		aft[2] = af3;

		// 3. ThreeTv 4대 저장
		ThreeTv tt1 = new ThreeTv();
		ThreeTv tt2 = new ThreeTv();
		ThreeTv tt3 = new ThreeTv();
		ThreeTv tt4 = new ThreeTv();

		ThreeTv[] ttv = new ThreeTv[4];
		ttv[0] = tt1;
		ttv[1] = tt2;
		ttv[2] = tt3;
		ttv[3] = tt4;
		
		Tv[] t = new Tv[9];
		t[0] = st1;
		t[1] = st2;
		
		t[2] = af1;
		t[3] = af2;
		t[4] = af3;
		
		t[5] = tt1;
		t[6] = tt2;
		t[7] = tt3;
		t[8] = tt4;
		
		AfreecaTv a = (AfreecaTv)t[3]; //다운캐스팅
		a.starBallon();
		

	}
}

class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;

	}

}

class SmartTv extends Tv {
	void interNet() {

	}
}

class AfreecaTv extends Tv {
	void starBallon() {

	}
}

class ThreeTv extends Tv {
	void dizzy() {

	}
}
