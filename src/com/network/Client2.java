package com.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {
	//getFood
	//서버 접속 후
	//1.점심메뉴 2.저녁메뉴 3.종료
	//번호를 입력받아서 Server로 전송
	
	public void getFood() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.62", 8282);
		System.out.println("Server 접속 완료");
		//--------------------------------
		boolean check = true;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		while(check) {
			System.out.println("1. 점심메뉴");
			System.out.println("2. 저녁메뉴");
			System.out.println("3. 종	료");
			System.out.println("번호를 입력해 주세요");
			int select = sc.nextInt();
			
			os = socket.getOutputStream(); //0,1
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow); 
			bw.write(select+"\r\n");
			bw.flush();
			
			//---------------------------------------------
					
			if(select == 3) {
				break;
			}
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			String message = br.readLine();
			System.out.println(message);
			
		}
		
		bw.close();
		ow.close();
		os.close();
		
		br.close();
		ir.close();
		is.close();
		
		socket.close();
		
		
		
	}
	
	
}
