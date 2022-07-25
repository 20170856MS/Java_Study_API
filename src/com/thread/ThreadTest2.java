package com.thread;

public class ThreadTest2 {

	public void getAlpa() {
		
		for(int i='a';i<'z';i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
