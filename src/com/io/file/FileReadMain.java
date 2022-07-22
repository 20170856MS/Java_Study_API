package com.io.file;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileRead fr = new FileRead();
		FileWrite fw = new FileWrite();
		try {
			fr.read();
			fw.write();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
