package k_thread;

import com.sun.corba.se.impl.orb.ParserTable.TestAcceptor1;

public class Test extends Thread{
	public void run() {
		System.out.println("스레드 시작");
	}
	
	public static void main(String[] args) {
		Test threadTest = new Test();
		threadTest.start();
	}
}
