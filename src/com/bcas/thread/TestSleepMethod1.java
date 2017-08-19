package com.bcas.thread;

class TestSleepMethod1 extends Thread {
	System.out.println("Intiate Thread");
	public void run() {
		for (int i = 1; i < 10; i++) {
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {

		TestSleepMethod1 t1 = new TestSleepMethod1();
		TestSleepMethod1 t2 = new TestSleepMethod1();

		t2.setPriority(MAX_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		System.out.println("Good Morning");
		t1 .start();
		System.out.println("Good Evening");
		t2.start();
		// t1.stop();
		System.out.println("Thread Id t1 : " + t1.getName());
		System.out.println("Thread Id t2 : " + t2.getName());
		t1.setName("Demon");
		t2.setName("BCAS");
		System.out.println("Good Nignt");

		System.out.println("This line for github test");
		
		System.out.println("Thread Id t1 : " + t1.getName());
		System.out.println("Thread Id t2 : " + t2.getName());
		System.out.println("Priority of t1 : " + t1.getPriority());
		System.out.println("Priority of t2 : " + t2.getPriority());
	}
}