package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateAndTimeClassesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1st class to find Date information 
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		//2nd class to find Time information 
		LocalTime lt =LocalTime.now();
		System.out.println(lt);
		//3rd class date and time 
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		
		// display Date in custom format 
		
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:ms");
//			String myCustomDateAndTime = ldt.format(dtf);
//			System.out.println(myCustomDateAndTime);
			//ZoneId.getAvailableZoneIds().forEach(zone->System.out.println(zone));
			LocalDateTime ldt1 = LocalDateTime.now(ZoneId.of("America/Toronto"));
			System.out.println(ldt1.format(dtf));
			//Asia/Calcutta
			LocalDateTime ldt2 = LocalDateTime.now(ZoneId.of("Asia/Calcutta"));
			System.out.println(ldt2.format(dtf));
		
	}

}