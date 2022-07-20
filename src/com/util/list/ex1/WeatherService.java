package com.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {

	
		private StringBuffer sb;
		
		public WeatherService() {
			sb = new StringBuffer();
			sb.append("Seoul, 30.2, 70, 맑음");
			sb.append("Daegu-38.9-90-흐림");
			sb.append("Jeju, 12.1, 10, 눈");
			sb.append("Busan-38.9-90-태풍");
		}
		
		public void init(ArrayList<CityDTO> ar) {
			String data = sb.toString();
			data = data.replace("-",",");
			StringTokenizer st = new StringTokenizer(data);
			
			while(st.hasMoreTokens()) {
				Scanner sc = new Scanner(System.in);
				CityDTO cityDTO = new CityDTO();
				cityDTO.setName(st.nextToken());
				cityDTO.setGion(Double.parseDouble(st.nextToken()));
				cityDTO.setHun(Integer.parseInt(st.nextToken()));
				cityDTO.setStatus(st.nextToken());
				ar.add(cityDTO);
			}
		}
		
		public void add(ArrayList<CityDTO> ar) {
			CityDTO cityDTO = new CityDTO();
			Scanner sc = new Scanner(System.in);
			System.out.println("도시 이름 : ");
			cityDTO.setName(sc.next());
			
			cityDTO.setName("test");
			cityDTO.setGion(20.3);
			cityDTO.setHun(80);
			cityDTO.setStatus("비");
			ar.add(cityDTO);
			
		}
		
		
}
