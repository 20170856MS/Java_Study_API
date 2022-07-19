package com.lang.string.ex1;

public class WorkerService {
	
	private String info;

	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	private StringBuffer sb;
	public WorkerService() {
		sb.append("iu-인사과-과장-0101111");
		sb.append(", suji-IT부서-대리-0102222");
		sb.append(", choa-영어부서-부장-0103333");
		sb.append(", hani-마케팅부서-사원-0104444");
		
	}
	
	public WorkerDTO [] init() {
		//info 데이터를 파싱해서 WorkDTO에 대입하고
		//WorkerDTO를 모은 데이터를 리턴
		System.out.println(this.sb);
		String info = sb.toString();
		String newInfo = info.replace(",", "-");
		
		String [] infos = newInfo.split(",");
		for(String str:infos) {
			System.out.println(str);
		}
		
		WorkerDTO [] workerDTOs = new WorkerDTO[info.length()/4];
		
		for(int i=0;i<info.length(); i++) {
			WorkerDTO workerDTO = new  WorkerDTO();
			workerDTOs[i/4] = workerDTO;
			workerDTO.setName(infos[i].trim());
			workerDTO.setDepartment(infos[++i].trim());
			workerDTO.setJob(infos[++i].trim());
			workerDTO.setPhone(infos[++i].trim());
		}
		
		
		
		return workerDTOs;
		
	
	
	}
		
		
	
}
