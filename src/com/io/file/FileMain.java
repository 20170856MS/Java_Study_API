package com.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		
		
		
		File file = new File("C:\\study");
		
		file = new File("C:\\study\\sub");
		if(!file.exists()) {
			file.mkdir();
		}
		
		File file2 = new File("C:\\study\\sub2\\t1");
		//file.mkdir();  중간에 폴더가 없으면 생성 x
		file2.mkdirs();
		
		file.delete();
		
		File file3 = new File("C:\\study\\sub2");
		file3.delete();   //폴더를 지울떄는 내부자 비워져있어야된다.
	}

}
