package file;

import java.io.File;

public class FileList {
	public static void main(String[] args) {
		
		File root = new File("c:\\");
		File[] list = root.listFiles();
		
		for(File file : list) {
			System.out.println(file.getName());
			
		}
		
		System.out.println("=======================");
		
		for(File file : list) {
			String fileName = file.getName();
			long fileSize = file.length(); // 파일 크기 변수 선언
			String etc = file.isDirectory() ? "<DIR>" : ""; // 폴더면 옆에 <DIR> 붙여라
			System.out.println(fileName + " " + fileSize + " " + etc);
		}
		
		
		
	}
}
