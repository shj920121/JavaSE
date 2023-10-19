package section15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 
 * Date 클래스
 * 	시간과 날짜 정보를 다루는 클래스
 * 
 */
public class JavaUtil03 {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println(date);
		
		//날짜 포맷 변경하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		String strDate = sdf.format(date); // sdf를 format이 문자열로 반환
		System.out.println(strDate);
		
		// 문자열 날짜 시간을 Date 객체로 변환
		String yesterday = "2023-10-18 19:41:00";
		Date yDate = sdf.parse(yesterday); // 예외처리 던져야함 - throws ParseException
		System.out.println(yDate);
		
		
		
		
	}
	
}
