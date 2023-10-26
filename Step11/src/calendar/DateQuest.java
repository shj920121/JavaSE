package calendar;

import java.util.Calendar;

public class DateQuest {
	public static void main(String[] args) {
		//오늘 날짜 기준으로 택배가 영업일 기준 4일이 소모됩니다.
		//택배가 도착할 날짜를 계산해서 출력
		
		Calendar t = Calendar.getInstance();
		
		if(t.get(Calendar.DAY_OF_WEEK) + 3 > 5)
		t.set(Calendar.DATE, t.get(Calendar.DATE)+5);
		else
		t.set(Calendar.DATE, t.get(Calendar.DATE)+3);
		System.out.println(t.getTime());
		
	}
}
