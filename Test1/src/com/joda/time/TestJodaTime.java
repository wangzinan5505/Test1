package com.joda.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.GJChronology;


public class TestJodaTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 以 Joda 的方式向某一个瞬间加上 90 天并输出结果 
		DateTime dateTime = new DateTime(2000, 1, 1, 0, 0, 0, 0);
		System.out.println(dateTime.plusDays(90).toString("E MM/dd/yyyy HH:mm:ss.SSS"));
		
		// 以 JDK 的方式向某一个瞬间加上 90 天并输出结果
		Calendar calendar = Calendar.getInstance();
		calendar.set(2000, Calendar.JANUARY, 1, 0, 0, 0);
		SimpleDateFormat sdf =
		  new SimpleDateFormat("E MM/dd/yyyy HH:mm:ss.SSS");
		calendar.add(Calendar.DAY_OF_MONTH, 90);
		System.out.println(sdf.format(calendar.getTime()));
		
		DateTimeZone zone = DateTimeZone.forID("Asia/Tokyo");
		Chronology gregorianJuian = GJChronology.getInstance(zone);
	}

}
