package com.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {
	
	//juminCheck
	public void juminCheck() {
		//주민번호 입력
		// 마지막 번호는 체크용 번호  9 7 1 1 2 4 - 1 2 3 4 5 6 7(처크용)
		//  각각의 자리수 곱       *2 3 4 5 6 7 - 8 9 2 3 4 5 x 
		// 그후 전부 합하기        18+21+4+5+12+28+8+18+6+12+20+30 = 192
		//총합을 11로 나눈 나머지 구하기
		// 192/11   17...5
		//나머지를 11에서 뺀 결과  11-5=6   체크용 숫자와 비교(같으면 올바른 번호)
		//만약 나머지가 두자리수라면 다시 10으로 나눈 나머지와 비교  ex=> 11/10  1...1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요 : ");
		String number = sc.next();
		//1. subSting(
		String[] numbers = number.split("-");
		String numb = numbers[0]+numbers[1];
		System.out.println(numb);
		char[] ch = numb.toCharArray();
		int [] count = new int [ch.length];
		int addcount =0;
		int nn =2;
		
		
		for(int i=0;i<ch.length;i++){
			count[i]=ch[i]-'0';
			addcount = addcount + count[i]*nn;
			System.out.println(addcount);
			nn++;
			if(nn==10) {
				nn=2;
			}
			
		}
		System.out.println(addcount);
		int div = addcount%11;
		System.out.println(ch[12]);
		int check = ch[12]-'0';
		if(div>=10) {
			div =div%10;
		}
		
		System.out.println(div);
		
		if (div==check) {
			System.out.println("올바른 주민등록번호입니다.");
		}else {
			System.out.println("잘못된 주민등록번호입니다.");
		}
		
		
		
		
	}
	
}
