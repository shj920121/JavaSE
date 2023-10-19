package section15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtil06 {
	
	public static String dataCalc(
			String strDate,
			String format,
			int addYear,
			int addMonth,
			int addDate,
			int addHour,
			int addMinute,
			int addSecond
			) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = sdf.parse(strDate);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date); // Date 객체 -> Calendar 객체로
		
		cal.add(Calendar.YEAR, +addYear);
		cal.add(Calendar.MONTH, +addMonth);
		cal.add(Calendar.DATE, +addYear);
		cal.add(Calendar.HOUR_OF_DAY, +addYear);
		cal.add(Calendar.MINUTE, +addYear);
		cal.add(Calendar.SECOND, +addYear);
		                
		
	
		return sdf.format(cal.getTime());
	
}	
	
		public static void main(String[] args) throws ParseException {
			String strDate = "2023-10-19 20:22:00";
			String format = "yyyy-mm-dd HH:mm:ss";
			
			String result = dataCalc(strDate, format, 0, 0, 100, 0, 0, 0); 
			
			System.out.println("100일 후 날짜 : " + result);

		}
}
