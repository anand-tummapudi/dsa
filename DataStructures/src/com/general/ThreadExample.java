package com.general;

public class ThreadExample {
	
	public static void main(String args[]) {
		
	SampleTh thr = new SampleTh();
	
	for(int i=0;i<5;i++) {
		Thread t = new Thread(thr);
		t.start();
	}
	
	}
}

class SampleTh implements Runnable{

	@Override
	public void run() {
		System.out.println("Anand"+Thread.currentThread().getName());
	}

}
