package com.io.file.ex1;

import java.util.ArrayList;

import com.util.list.ex1.CityDTO;

public class StudentView {
	
	//view
	//1.String 출력
	//2.StudentDTO 출력
	//3.ArrayList<StudentDTO> 출력
	
	public void view(String message) {
		System.out.println(message);
	}
	
	public void view(ArrayList<StudentDTO> ar) {
		for(int i=0; i<ar.size(); i++) {
			StudentDTO studentDTO =ar.get(i);
			//this.view(studentDTO);
		}
		
	}
}
