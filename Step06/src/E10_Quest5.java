/*
 * 
 * 문자형 배열에 저장된 내용을 전부 거꾸로 뒤집어서 저장한 후에
 * 배열을 문자열로 만든 다음에 결과를 출력
 * 
 * Hello World -> dlroW olleH 
 * 01234 56789    98765 43210
 */

import java.util.Iterator;

public class E10_Quest5 {
	public static void main(String[] args) {
		String str = "Hello World";
		char[] arr = str.toCharArray();
		
		for(int i=0; i < arr.length / 2; i++) {
			System.out.print(arr[arr.length-1-i]);
//			char temp = arr[i];
//			arr[i] = arr[arr.length-1-i];
//			arr[arr.length-1-i] = temp;
			
						
//			System.out.print(arr[i]);
//			System.out.print(arr[arr.length-1-i]);
		}
			System.out.println();
			System.out.println("===========");
			
			str = new String(arr);
			System.out.println(str);
			
			System.out.println();
			System.out.println("===========");
		
			for(int i=0; i < arr.length / 2; i++) {
				
				System.out.print(arr[arr.length-1-i]);		
			
			}
		
		
		
	}
}
