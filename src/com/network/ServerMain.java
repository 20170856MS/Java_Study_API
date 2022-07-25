package com.network;

public class ServerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Server Start");
		
		Server2 s2 = new Server2();
		try {
			s2.getFood();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Server Finish");
	}

}
