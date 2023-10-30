package file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		
		File file = new File("c:\\test\\test.txt");
		System.out.println(file);
//		현재 파일의 절대 경로 위치값을 뽑음
		System.out.println(file.getAbsolutePath());
//		부모 폴더 경로를 문자열로 받음
		System.out.println(file.getParent());
//		부모 폴더 경로를 파일객체로 뽑음
		File parent = file.getParentFile();
//		파일 생성전에 파일이 위치한 폴더 경로가 있는지 체크
		System.out.println(parent.exists()); // true or false
		if(!parent.exists()) { // 경로가 없는 상태이니까 true일 경우 실행하도록
			parent.mkdirs(); // 해당 경로까지의 폴더를 전부 생성
		}
		
		
		
		try {
			boolean result = file.createNewFile();
			System.out.println(result);
//			file.delete();
			File refile = new File(parent.getAbsolutePath() + "\\" + "abc.txt");
			file.renameTo(refile);
			System.out.println(file.getName());
			System.out.println(file.length());
			System.out.println(file.isDirectory()); // 폴더인가?
			System.out.println(file.isFile()); // 파일인가?
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
