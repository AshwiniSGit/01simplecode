package com.ash.Synchro;

public class ThreadPriority implements Runnable{
	public void run() {
		
        System.out.println(Thread.currentThread().getName());
		
		}
	
  public static void main(String[] args) {
	
	  ThreadPriority d = new ThreadPriority();
		
		Thread t1 = new Thread(d,"First Thread");
		t1.setPriority(10);  
		//t1.setName("Thread 1");
		
		Thread t2 = new Thread(d,"Second Thread");
		t2.setPriority(1);  
		//t2.setName("Thread 2");
		
		Thread t3 = new Thread(d,"Third Thread");
		t3.setPriority(8);  
		//t3.setName("Thread 3");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
}
}
