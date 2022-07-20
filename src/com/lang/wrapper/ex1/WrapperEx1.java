package com.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {

		
		public  void ex1() {
		//ex1
		//주민등록번호 입력
		//1. 남자 여자 판단 (홀수 짝수)
		//2. 현재 나이 출력
		//3. 3월~5월 : 봄,  6월~8월 : 여름, 9월~11월 : 가을, 12월 ~2월 : 겨울
	
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요 : ");
		String number = sc.next();
		System.out.println(number);
		check1(number);
		age(number);
		season(number);
		}
		
		private void check1(String number) {
			char ch = number.charAt(7);
			if(ch=='0'||ch=='2') {
				System.out.println("여자입니다");
			}else if(ch=='1'||ch=='3') {
				System.out.println("남자입니다");
			}
		}
		
		private void age(String number) {
			String year = number.substring(0,2);
			char ch = number.charAt(7);// 1900,2000
			String cen = "20";
			if (ch=='1' || ch=='2') {
				cen = "19";
			}
			year=cen+year;
			int yea= Integer.parseInt(year);
			yea=2022-yea;
			System.out.println("나이 : "+yea);
		}
		
		private void season(String number) {
			String month = number.substring(2,4);
			int num = Integer.parseInt(month);
			if(num>=3 && num<=5) {
				System.out.println("봄");
			}else if(num>=6 && num<=8) {
				System.out.println("여름");
			}else if(num>=9 && num<=11) {
				System.out.println("가을");
			}else if(num==12 && num<=2) {
				System.out.println("겨울");
			}
			
		}
		
	

}
