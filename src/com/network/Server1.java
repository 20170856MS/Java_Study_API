package com.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
	
	public void receive() throws Exception {
		Scanner sc = new Scanner(System.in);
		ServerSocket serverSocket = new ServerSocket(8282);
		//서버 오픈하고 Client의 접속을 기다림
		System.out.println("Client 접속 기다리는중");
		//Socket : 상대방과 1대1통신
		
		
		boolean check = true;
		
		Socket socket = serverSocket.accept();
		System.out.println("Client 접속 완료");
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		String message;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		while(check) {
			message = br.readLine();
			System.out.println("Clint : " +message);
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			//=====
			os = socket.getOutputStream(); //0,1
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow); 
			
			if(message.contains("q") || message.contains("Q")) {
				check =! check;
				break;
			}
			//=========
		
			System.out.println("클라이언트로 보낼 메세지 입력");
			message= sc.next();
		
			bw.write(message+"\r\n");
			bw.flush();
			
			if(message.contains("q") || message.contains("Q")) {
				check =! check;
				break;
			}
		}
		System.out.println("서버를 종료합니다.");
		//==========
		
		br.close();
		ir.close();
		is.close();
		socket.close();
		serverSocket.close();
		
		
	}
}
