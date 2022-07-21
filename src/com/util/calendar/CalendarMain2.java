package com.util.calendar;

import java.sql.Date;
import java.util.Calendar;


public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		//Calendar future = Calendar.getInstance();
		//future.set(Calendar.MINUTE, 15);
		
		long n = now.getTimeInMillis();
		//long f = future.getTimeInMillis();
		
		//long result = f-n;
		//System.out.println(result/1000);
		
		Calendar birth = Calendar.getInstance();
		birth.set(Calendar.YEAR, 1998);
		birth.set(Calendar.MONTH, 11);
		birth.set(Calendar.DATE, 17);
			
		long b = birth.getTimeInMillis();
		
		long result = (n-b)/1000;
		System.out.println(result/(60*60*24*365)+"년");
		
	}

}
