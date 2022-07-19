package com.lang.string;

public class StringMain1 {

	public static void main(String[] args) {
		
		//String str1 = "iu";
		//String str2 = "iu";
		//String str3 = new String("iu");
		
		//System.out.println(str1==str2);  //주소는 다르지만 결과는 true
		//System.out.println(str1==str3);  //주소가 다르기떄문에 false
		//System.out.println(str1);
		//System.out.println(str2);
		//System.out.println(str3);
		
		//str1 => 상수구역의 iu의 주소  str2 => 상수구역으로 가 똑같은 데이터가 있는지 확인 후, 그 데이터의 주소 입력
		//st3는 힙영역에 iu를 생성후 주소 입력
		
		//System.out.println("=========================");
		//System.out.println(str1.equals(str2));//주소를 비교하는 것이 아니라 내용을 비교
		//System.out.println(str2.equals(str3));


		//StringStudy ss = new StringStudy();
		//ss.studyCharAt();
		//System.out.println("");
		//System.out.println();
		
		System.out.println("=========================");
		StringStudy2 ss2 = new StringStudy2();
		//ss2.studyIndexOfEx1();
		//ss2.studyIndexOf();
		//ss2.studySubString();
		//ss2.ex2();
		StringStudy3 ss3 = new StringStudy3();
		//ss3.studySplit();
		//ss3.studySplit2();
		ss3.studySplit3();
		
	}

}
