package com.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Server2 {

	//getFood
	//Server에서 메세지를 기다림
	//1. 점심메뉴 중 랜덤하게 하나를 Client로 전송
	//2. 저녁메뉴 중 랜덤하게 하나를 Client로 전송
	//3. 프로그램 종료
	//그외 나머지 : "잘못 입력된 번호입니다" Client로 전송
	
	private ArrayList<String> lunch;
	private ArrayList<String> dinner;
	
	public Server2() {
		lunch = new ArrayList<>();
		dinner = new ArrayList<>();
		
		lunch.add("자장면");
		lunch.add("라면");
		lunch.add("햄버거");
		lunch.add("피자");
		lunch.add("오늘은 다이어트 안먹어");
		
		dinner.add("삼겹살");
		dinner.add("치킨");
		dinner.add("샐러드");
		dinner.add("볶음밥");
		dinner.add("물");
	}
	
	public void getFood() throws Exception {
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
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			message = br.readLine();
			System.out.println("고른번호 : " +message);
			int select = Integer.parseInt(message);
			
			//=====
			Random rd = new Random(Calendar.getInstance().getTimeInMillis());
			
			if(select == 1) {
				int num =rd.nextInt(lunch.size());
				message= "오늘의 점심 : "+lunch.get(num);
			}else if(select == 2) {
				int num =rd.nextInt(dinner.size());
				message= "오늘의 저녁 : "+dinner.get(num);
			}else if(select == 3) {
				message= "종료합니다.";
				break;
			}else {
				message= "잘못 입력된 번호입니다";
			}
			
			os = socket.getOutputStream(); 
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow); 

			bw.write(message+"\r\n");
			bw.flush();
			//=========
			
			
		}
		System.out.println("서버를 종료합니다.");
		//==========
		
		br.close();
		ir.close();
		is.close();
		
		os.close();
		ow.close();
		bw.close();
		
		socket.close();
		serverSocket.close();
	}


}
