package com.io.file.ex1;

import java.io.IOException;

public class ExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO stDAO = new StudentDAO();
		StudentDTO stDTO = new StudentDTO();
		StudentService service = new StudentService();
		
		try {
			stDAO.getList();
			stDAO.setList(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		StudentDTO studentDTO = new StudentDTO();
		studentDTO.setName("add");
		studentDTO.setNum(6);
		studentDTO.setKor(70);
		studentDTO.setEng(80);
		studentDTO.setMath(85);
		ar.add(studentDTO);
		
		try {
			int result = service.setList(ar);
			System.out.println("Result : "+result);
			
		}
		
	}

}
