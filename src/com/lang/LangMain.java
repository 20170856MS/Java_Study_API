package com.lang;

import java.util.Scanner;  //java.util.*  유틸안의 모든 파일

public class LangMain {

	public static void main(String[] args) {
		Object obj = new Object();
		String str = obj.toString();
		System.out.println(str);
		
		Member member = new Member();
		str = member.toString();
		System.out.println(str);
		
		MemberClient mc = new MemberClient();
		Car car = new Car();
		Car car2 = new Car();
		obj = member;
		
		
		boolean check = car.equals(car2);
		System.out.println(car.toString());
		System.out.println(check);
		
		String name ="iu";
		System.out.println(name);
	}

}
