package k_thread;

public class Test2 extends Thread{

	int seq;	
	
	public Test2(int seq) {
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
		for(int i = 0; i < 10; i++) {
			Thread th = new Test2(i);
			th.start();
		}
		System.out.println("main 종료");
	}
}
