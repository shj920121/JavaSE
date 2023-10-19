package section15;

import java.util.Calendar;

/*
 * Calender 클래스
 * 	시간과 날짜 정보를 다루는 클래스
 * 	날짜 시간 계산으로 자주 사용된다.
 * 	date 객체와 호환가능
 * 
 */
public class JavaUtil04 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); // 객체 생성을 new가 아닌 getInstance() 메서드를 통해 해야한다.
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1; // Calendar 클래스는 월의 시작이 0부터 시작
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.println("오늘 날짜는 " + year + "년" + month + "월" + day + "일 입니다.");
	}
}
