package com.thread;

public class ThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadTest1 t1 = new ThreadTest1();
		ThreadTest2 t2 = new ThreadTest2();
		//Thread t = new Thread(t2);
		try {
			t1.getNum();
			t2.getAlpa();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//개발자ㅏㄱ 직접 호출이 아니라 OS에게 실행 부탁
		//t1.start();
		//t2.start();

	}

}
