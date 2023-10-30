package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWriterMain2 {
	public static void main(String[] args) {
	
		try (FileWriter fw = new FileWriter("Hello.txt");
		PrintWriter pw = new PrintWriter("안녕하세요");)	{

			pw.println("Hello World");
			pw.println("안녕하세요");
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
