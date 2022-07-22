package com.io.exception;

public class ExceptionMain {
	public static void main(String []args) throws MyException {
		System.out.println("메인 시작");
		Test test = new Test();
		
		
		test.t3();
		System.out.println("메인 종료");
		
	}
}
