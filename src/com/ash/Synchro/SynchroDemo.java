package com.ash.Synchro;

public class SynchroDemo implements Runnable {
	
	public synchronized void printNum() {
		for(int a =0; a<=10; a++) {
			System.out.println(Thread.currentThread().getName() + " : " +a);
			
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	public void run() {
		printNum();
	}
	
	public static void main(String[] args) {
		SynchroDemo sd = new SynchroDemo();
		Thread th1 = new Thread (sd);
		th1.start();
		
		Thread th2 = new Thread (sd);
		th2.start();
	}

}
