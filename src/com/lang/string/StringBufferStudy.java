package com.lang.string;

public class StringBufferStudy {

	public static void main(String[] args) {
		String str1 = "max";
		String str2 = "age";
		
		str1 = str1 + str2;
		System.out.println("num1"+"1"+"num2"+"2");
		
		StringBuffer sb = new StringBuffer();
		sb.append(str1);
		sb.append(str2);
		sb.append(10);
		
		//String result = sb.toString();  타입이 다르기 때문에 String을 호출해줘야함
		
		System.out.println(sb);

	}

}
