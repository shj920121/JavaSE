package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteMain {
	public static void main(String[] args) {
		FileWriter fw = null; // try, finally 모두 사용하기 위해 미리  전역변수
		PrintWriter pw = null;
//		1. 노드 스트림 초기화
		try {
			fw = new FileWriter("Hello.txt",true); //저장할 파일경로, 추가모드
//		2. 프로세스 스트림 초기화
			pw = new PrintWriter(fw);
//		3. 출력
			pw.println("Hello World");
			pw.println("안녕하세요");
			pw.flush(); // 밀어줘야 한다.
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
//		4. close
//			pw.close(); // 닫아줘야 한다.
			try {
				if(pw != null) pw.close();
				if(fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
