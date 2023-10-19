/*
 * 알파벳 A부터 Z까지 출력
 * 단, 대문자와 소문자를 아래 형식으로 출력
 * A - a
 * B - b
 * C - c
 * ...
 * Z - z
 * 
 */
public class E02_Quest {
	public static void main(String[] args) {
		
		System.out.println('A' - 'a');
		
		char ch = 65;
		char ch2 = 97;
		
		do {
			System.out.println(ch+" - "+ ch2);
		ch++; ch2++;
		} while(ch < 91);
		
		System.out.println("=================");
		
		for(char ch3 = 'A'; ch3 <= 'Z'; ch3++) {
			System.out.println(ch3 + " - "+ (char)(ch3+32));
		}
		
		
	}
}
