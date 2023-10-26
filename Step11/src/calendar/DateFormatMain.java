package calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateFormatMain {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		//날짜 서식 문자를 이용해서 원하는 형태로 날짜를 문자열로 만들어 주는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy"); // 연도 4자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("yy"); // 연도 2자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MMM"); // 월 2자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("M"); // 월 1자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("dd");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("d");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("E");//요일
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("EEE");//요일 ex) Mon , Fri
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("EEEE");//요일 , 4개가 풀네임
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("H");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("HH");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("h");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("hh");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("a");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("m");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("mm");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("s");
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("ss");
		System.out.println(sdf.format(cal.getTime()));
		
		
		//2023-05-25 14:26:30
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		//2022년 12월 05일 12시 35분 55초
		sdf.applyPattern("yyyy년 MMM dd일 HH시 mm분 ss초");
		System.out.println(sdf.format(cal.getTime()));
		//2023_05_25_14_26_30
		sdf.applyPattern("yyyy_MM_dd_HH_mm_ss");
		System.out.println(sdf.format(cal.getTime()));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy년 MMMM dd일 HH시 mm분 ss초", Locale.ENGLISH);
		System.out.println(sdf1.format(cal.getTime()));
		 
		
	}
	
}
