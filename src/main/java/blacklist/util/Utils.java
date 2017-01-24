package blacklist.util;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Utils {


	private Utils() {
		super();
	}


	public static String getDateASFormatedString() {
		Date dNow = new Date();
		SimpleDateFormat sdf01 = new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat sdf02 = new SimpleDateFormat("HH:mm:ss");
		return sdf01.format(dNow) + "T" + sdf02.format(dNow);
	}
	public static Date getDateFROMFormatedString(String dateInFormatedString) {
		Calendar objCalendar = Calendar.getInstance();
		objCalendar.clear();
		objCalendar.set(Calendar.YEAR, Integer.parseInt(dateInFormatedString.substring(0,4)));
		objCalendar.set(Calendar.MONTH, Integer.parseInt(dateInFormatedString.substring(5,7))-1);
		objCalendar.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dateInFormatedString.substring(8,10)));
		objCalendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(dateInFormatedString.substring(11,13)));
		objCalendar.set(Calendar.MINUTE, Integer.parseInt(dateInFormatedString.substring(14,16)));
		objCalendar.set(Calendar.SECOND, Integer.parseInt(dateInFormatedString.substring(17,19)));
		return objCalendar.getTime();
	}

}
