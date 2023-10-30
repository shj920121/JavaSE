package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadMain {
	public static void main(String[] args) {

//		FileReader 생성
		try (FileReader fr = new FileReader("Hello.txt");
			BufferedReader br = new BufferedReader(fr);) { //close 처리 ver2

			while(true) {
				String str = br.readLine();
				if(str == null) break;
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	
		
	}
}
