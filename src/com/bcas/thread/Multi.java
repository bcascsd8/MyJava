package com.bcas.thread;

class Multi extends Thread{
	
	public void run() {
		System.out.println("thread is running... by extends Thread");
	}	
	
	public static void main(String args[]) {
		Multi t1 = new Multi();
		t1.start();
	}
}