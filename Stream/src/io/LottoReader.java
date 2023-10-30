package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LottoReader {
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("Lotto.txt");) {
			
			while(true) {
				
//				char ch = (char) fr.read(); // 한글자씩 읽어오기 , 문자는 음수가 없으므로 에러
				int ch = fr.read();
				if (ch == -1)break;
				System.out.print((char)ch);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
