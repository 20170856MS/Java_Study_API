package com.util.list.ex1;

import java.util.ArrayList;

public class WeatherMain {

	public static void main(String[] args) {
		// 1.클래스의 역할과 메서드의 역할, 변수의 역할
		// WeatherMain	: 프로그램실행, 테스트
		// WeatherService :	데이터가공(실질적인 로직들)
		// WeatherController : 관리
		// WeatherView	: 받아온 정보를 출력 (출력 전용)
		// CityDTO		: 데이터 저장(데이터 박스)
		
		//ArrayList<ArrayList<ArrayList<String>>> all = new W=
		
		//WeatherController wc = new WeatherController();
		//wc.start();
		
		WeatherView we = new WeatherView();
		WeatherService ws = new WeatherService();
		
		CityDTO cityDTO = new CityDTO();
		CityDTO cityDTO2 = new CityDTO();
		
		
		cityDTO.setName("ny");
		cityDTO.setGion(31.2);
		cityDTO.setHun(20);
		cityDTO.setStatus("비");
		
		cityDTO2.setName("LA");
		cityDTO2.setGion(25.2);
		cityDTO2.setHun(40);
		cityDTO2.setStatus("눈");
		
		ArrayList<CityDTO> ar = new ArrayList<>();
		ar.add(cityDTO);
		ar.add(cityDTO2);
		
		ws.add(ar);
		
		we.view(ar);
		
		
	}

}
