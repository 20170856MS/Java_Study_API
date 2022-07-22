package com.io.file;

import java.io.File;
import java.io.FileWriter;

public class FileWrite {
	public void write() throws Exception {
		
		File file = new File("C:\\study","text.txt");
		
		FileWriter fw = new FileWriter(file, true);
		
		fw.write("Today's String\r\n");
		fw.flush();
		
		fw.write("tommorow saturday\r\n ");
		fw.flush();
	}
}
