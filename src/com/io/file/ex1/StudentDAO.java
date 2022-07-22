package com.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentDAO {
	//DAO : Data Access Object
	//file data에 접근
	
	//1.getList 메서드 : 파일의 내용을 읽어오는것
	// 	studentData파일의 내용을 읽어서 작업
	
	public ArrayList<StudentDTO> getList() throws IOException {
		ArrayList<StudentDTO> ar = new ArrayList<StudentDTO>();
		File file = new File("C:\\study", "studentData.txt");
		//2.파일과 연결
		FileReader fr = new FileReader(file);
		//fr.read() : 한글가씩
		//3. 파일의 내용 읽기위한 보조 스트림 연결
		BufferedReader br = new BufferedReader(fr);
		//4.내용 읽기
		
		boolean check = true;
		String str = br.readLine();
		str = br.readLine(); 
		
		//String [] info = str.split(",");
		
		while(check) { //While 시작
			String data=br.readLine();
			if(data==null) {
				break;
			}
			StringTokenizer st = new StringTokenizer(data, ",");
			while(st.hasMoreTokens()) {
				StudentDTO studentDTO = new StudentDTO();
				studentDTO.setName(st.nextToken().trim());
				studentDTO.setNum(Integer.parseInt(st.nextToken().trim()));
				studentDTO.setKor(Integer.parseInt(st.nextToken().trim()));
				studentDTO.setEng(Integer.parseInt(st.nextToken().trim()));
				studentDTO.setMath(Integer.parseInt(st.nextToken().trim()));
				ar.add(studentDTO);
			}
		
		}return ar;
		
		
	}
	
	
	//2. setList
	public int setList(ArrayList<StudentDTO> ar) {
		//예외처리는 내부에서 처리
		//list로받은 데이터들을 studentData에 작성
		//기존의 내용은 삭제
		//작성 형식은 기존 내용의 혁식과 동일하게
		// 1리턴 : 정상적인 성공, 0리턴 : 예외가 발생
		ArrayList<StudentDTO> ar2 = new ArrayList<StudentDTO>();
		int result= 1;
		File file = new File("C:\\study", "test1.txt");
		FileWriter fw;
		Scanner sc = new Scanner(System.in);
		
		String ww;
		boolean check = true;
		try {
			fw = new FileWriter(file, false);
			FileReader fr = new FileReader(file);
			while(check) {
				System.out.println("이름 입력");
				ww = sc.next();
				fw.write(ww);
				System.out.println("번호 입력");
				ww = sc.next();
				fw.write(","+ww);
				System.out.println("국어점수 입력");
				ww = sc.next();
				fw.write(","+ww);
				System.out.println("영어점수 입력");
				ww = sc.next();
				fw.write(","+ww);
				System.out.println("수학 입력");
				ww = sc.next();
				fw.write(","+ww+"\n");
				System.out.println("정보를 더 입력하시겠습니까? 1.네 2.아니요");
				int a = sc.nextInt();
				if(a==2) {
					check =! check;
					break;
				}
			}
			fw.flush();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			result = 0;
		}
		
		if(result ==0) {
			System.out.println("오류발생");
		}
		
		
		
		return result;
		
	}
	
}