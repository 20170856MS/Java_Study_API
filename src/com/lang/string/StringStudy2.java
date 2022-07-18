package com.lang.string;

import java.util.Scanner;

public class StringStudy2 {
	
	public void ex2() {
		//키보드로부터 파일명을 입력 받음, abc.txt
		//파일이 이미지 파일인지 아닌지를 구별
		//확장가 jpg,png, gif, jpeg
		
		Scanner sc = new Scanner(System.in);
		System.out.println("파일을 입력하세요");
		String file = sc.next();
		int index = file.indexOf('.');
		String search =file.substring(index+1);
		System.out.println(search);
		if (search.equals("jpg") || search.equals("png") || search.equals("gif") || search.equals("jpeg")) {
			System.out.println("이미지 확인");
		}else {
			System.out.println("잘못된 파일입니다.");
		}
		///////////////////////
		String [] files = {"jpg", "png", "gif", "jpeg"};
		String result = "이미지 파일이 아닙니다.";
		for(int i=0;i<files.length;i++) {
			if(search.equals(files[i])) {
				result="이미지파일 입니다.";
				break;
			}
		}System.out.println(result);
		
	}
	
	
	public void studyIndexOfEx1() {
		String names ="iu, suji, choa, hani";
		//1. names에는 몇개의 쉼표가 있는가?
		//2. 몇명 입니까?
		int count =0;
		int index;
		for(int i=0;i<names.length();) {
			index = names.indexOf(',' , i);
			if(index == -1) {
				break;
			}else {
				i=index+1;
				count++;
			}
		}
		
		System.out.println("쉼표의 갯수"+count+"개");
		System.out.println(count+1+"명");
	}
	
	
	
	public void studyIndexOf() {
		String str = "Hello Java";
		
		String replace = str.replace('l', 'w');
		System.out.println(replace);
		System.out.println(str);
		
		
		str = "Google에 입사지원동기는...Google에 입사하면...";
		System.out.println(str);
		String replace2 = str.replace("Google", "Samsong");
		System.out.println(replace2);
		//int index = str.indexOf('j'); //ch=>char
		//System.out.println(index);
		
		str="hi";
		String str2 ="h i ";
		str2= str2.trim(); //공백없애기 ->글자 사이의 띄어쓰기는 불가
		str2 = str2.replace(" ", "");
		System.out.println(str.equals(str2));
	}
	
	public void studySubString() {
		//하나의 문자열을 분리하는 작업(parsing)
		String member = "iu/1234";  // 아이디/비밀번호
		String pw = member.substring(3);
		String id = member.substring(0 , 2);
		System.out.println(id);
		System.out.println(pw);
		
	}
	
}
