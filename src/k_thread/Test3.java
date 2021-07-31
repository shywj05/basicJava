package k_thread;

import java.util.ArrayList;

public class Test3 implements Runnable{
	
	int seq;

	public Test3(int seq) {
		this.seq = seq;
	}

	public void run() {
		System.out.println("thread 시작 " + this.seq);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thread 종료 " + this.seq);
	} 
	
	public static void main(String[] args) {
		ArrayList<Thread> threads = new ArrayList<Thread>();
		for(int i = 0; i < 10; i++) {
			Thread th = new Thread(new Test3(i));
			th.start();
			threads.add(th);
		}
		
		for(int i = 0; i <threads.size(); i++) {
			Thread t = threads.get(i);
			
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("main 종료");
		}
	}
	
}
