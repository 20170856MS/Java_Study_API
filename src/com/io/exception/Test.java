package com.io.exception;

import java.util.Random;
import java.util.Scanner;

public class Test {
	public void t1() {
		System.out.println("t1 메서드 실행");
		Random random = new Random();
		
		String str= null;
		if(random.nextInt(10)%2==0) {
			str="10";
		}
		
		int num = Integer.parseInt("10");  //new NumberException() 오류 발생시 비정상적으로 종료
		try {
			num = num/0;
			System.out.println(num);
		}catch (ArithmeticException e) {
			System.out.println("예외처리");
		}
		
		System.out.println(str.toString());
		new NullPointerException();
		System.out.println("t1 메서드 종료");
	}
	
	public void t2() {
		
		String [] str = {"10", "five", "3.14", "0"};
		Scanner sc = new Scanner(System.in);
		for(String s: str) {
			try {
				System.out.println("숫자를 입력하세요");
				int n = sc.nextInt();
				
				int num = Integer.parseInt(s);
				num = 10/n;
				System.out.println(num);
			}catch(NumberFormatException e) {
				//예외처리
				System.out.println("예외처리");
			}catch(ArithmeticException e) {
				//예외처리
				System.out.println("수학오류");
			}
		}
		
		
	}
	
	public void t3() throws NullPointerException {
		String str = null;
		System.out.println(str.toString());
		
	}
	
	public void t4() throws MyException {
		
		int num1 = 48;
		int num2 = 82;
		int num3 = num1+num2;
		int num4 = num1-num2;
		
		if(num3>99) {
			throw new MyException("???");
		}
		if(num4<0) {
			throw new MyException("그런 숫자 몰라요");
		}
		
	}
	
}
