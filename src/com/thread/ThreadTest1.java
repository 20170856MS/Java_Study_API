package com.thread;

public class ThreadTest1 {

		public void getNum() throws InterruptedException {
			for(int i=0;i<25;i++) {
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
}
