package section19;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * I/O (Input/Output)
 *	데이터를 읽고 쓰는 작업을 의미한다.
 *	자바에서는 java.io 패키지를 통해 i/o 프로그래밍을 할 수 있다.
 * 
 * File Class
 * 	경로 정보를 받아 파일 또는 디렉토리 정보를 객체화 한다.
 * 
 */

public class IO01 {
	public static void main(String[] args) {
		
		File f = new File("C:\\"); // \\ -> C:\
		
		// C 드라이브 하위에 있는 모든 디렉토리 및 파일 리스트 반환
		String[] list = f.list();
		
		// Calendar 날짜관련 객체
		Calendar c = Calendar.getInstance();
		
		for(String temp : list) {
			// temp명의 디렉토리 또느 파일을 객체화
			File f2 = new File(f, temp);
			
			// 1970년 1월 1일부터 현재 수정한 날짜를 밀리세컨드로 반환(Timestamp)
			long lastMod =f2.lastModified();
			
			// 파일 또는 디렉토리 마지막 수정날짜 Calendar 객체로 변환
			c.setTimeInMillis(lastMod);
			
			// 마지막 수정날짜 포맷변환
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String day1 = sdf.format(c.getTime());
						
			// isDirectory() - 디렉토리이면 true, 파일이면 false
			if(f2.isDirectory()) {
				System.out.print(f2.getName()+"(디렉토리) - ");
				System.out.println(day1);
			}
		}
		
		for(String temp : list) {
			// temp명의 디렉토리 또느 파일을 객체화
			File f2 = new File(f, temp);
			
			// 1970년 1월 1일부터 현재 수정한 날짜를 밀리세컨드로 반환(Timestamp)
			long lastMod =f2.lastModified();
			
			// 파일 또는 디렉토리 마지막 수정날짜 Calendar 객체로 변환
			c.setTimeInMillis(lastMod);
			
			// 마지막 수정날짜 포맷변환
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
			String day1 = sdf.format(c.getTime());
						
			// isFile() - 디렉토리이면 false, 파일이면 true
			if(f2.isFile()) {
				long fileSizeByte = f2.length();
				double fileSizeMB = (double)fileSizeByte / (1024*1024);
				System.out.printf("%s(%.2fMB) - %s\n", f2.getName(), fileSizeMB, day1);
			}
		}
		
	}

}















