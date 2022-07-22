package com.io.file.ex1;

import java.io.IOException;

public class ExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentDAO stDAO = new StudentDAO();
		StudentDTO stDTO = new StudentDTO();
		
		try {
			stDAO.getList();
			stDAO.setList(null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
