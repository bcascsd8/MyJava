package com.bcas.thread;

public class ThreadTest extends Thread {

	static String msg = "A";

	public void run() {
		System.out.println("hi " + msg);
	}

	public static void main(String[] args) {
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		
		t1.start();		
		try {
			t2.sleep(2000);
			msg = "B";
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
	}
}
