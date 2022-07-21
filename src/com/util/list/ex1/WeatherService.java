package com.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {

	
		private StringBuffer sb;
		Scanner sc = new Scanner(System.in);
		
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
			StringTokenizer st = new StringTokenizer(data, ",");
			
			while(st.hasMoreTokens()) {
				CityDTO cityDTO = new CityDTO();
				cityDTO.setName(st.nextToken());
				cityDTO.setGion(Double.parseDouble(st.nextToken()));
				cityDTO.setHun(Integer.parseInt(st.nextToken()));
				cityDTO.setStatus(st.nextToken());
				ar.add(cityDTO);
			}
		} //init 메서드 끝
		
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
			
			//return cityDTO;
			
		} //add메서드 끝
		
		public void remove (ArrayList<CityDTO> ar) {
			System.out.println("삭제할 도시명 입력");
			String name = sc.next().toUpperCase();
			
			//for문
			for(int i=0; i<ar.size();i++){
					if(name.equals(ar.get(i).getName().toUpperCase())){
					ar.remove(i);
						break;
					}
			}
			
			//향상된 for문
			//for(CityDTO cityDTO : ar){
			//	if(name.equals(cityDTO.getName())){
			//		ar.remove(cityDTO);
			//		break;
			// }
			//}
			
		} //remove 메서드 끝
		
		public CityDTO find(ArrayList<CityDTO> ar) {
			CityDTO cityDTO = null;
			
			System.out.println("도시명 입력");
			String name = sc.next().toLowerCase();
			
			//향상된 for문
			for(CityDTO cityDTO2 : ar ) {
				if(name.equals(cityDTO2.getName().toLowerCase())){
					cityDTO = cityDTO2;
					break;
				}				
			}
			
			return cityDTO;
		}
		
		
}
