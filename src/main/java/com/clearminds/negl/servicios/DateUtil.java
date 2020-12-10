package com.clearminds.negl.servicios;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtil {
	public static String convertirFecha(){
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		return now.format(format);
	}
}
