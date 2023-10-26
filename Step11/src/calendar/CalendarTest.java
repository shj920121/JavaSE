package calendar;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime()); //월은 0부터 시작
		
		System.out.println(calendar);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH)+1);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.DATE));
		System.out.println(calendar.get(Calendar.HOUR));
		System.out.println(calendar.get(Calendar.AM_PM));
		System.out.println(calendar.get(Calendar.MINUTE));
		System.out.println(calendar.get(Calendar.SECOND));
		System.out.println(calendar.getTimeZone());
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		System.out.println(calendar.getTime());
		 
		
		calendar.set(calendar.YEAR, 2024);
		System.out.println(calendar.getTime());
		calendar.set(calendar.MONTH, 6);
		System.out.println(calendar.getTime());
		calendar.set(calendar.YEAR, 1965);
		System.out.println(calendar.getTime());
		
		 
		
	}
	
}
