package com.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConvertTime {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		
		ZonedDateTime parisDateTime = ldt.atZone(ZoneId.of("Europe/Paris"));
		ZonedDateTime laDateTime = ldt.atZone(ZoneId.of("America/Los_Angeles"));
		ZonedDateTime shanghaiDateTime = ldt.atZone(ZoneId.of("Asia/Shanghai"));
		
		System.out.println(ldt);
		System.out.println(parisDateTime);
		System.out.println(laDateTime);
		System.out.println(shanghaiDateTime);
	}
}
