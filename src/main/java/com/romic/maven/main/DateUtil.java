package com.romic.maven.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String getTime(int time) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(Long.valueOf(time) * 1000);
	}

	public static int getTimeStemp(String timeString) {
		int time = 0;
		try {
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date = simpleDateFormat.parse(timeString);
			long timeStemp = date.getTime();
			String substring = String.valueOf(timeStemp).substring(0, 10);
			time = Integer.valueOf(substring);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return time;
	}

}
