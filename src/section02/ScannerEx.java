package section02;

import java.util.Scanner;

/*
 * Scanner 클래스
 *  사용자로부터 데이터를 읽기 위해 사용되는 클래스
 *  Scanner 클래스를 사용하면 키보드로 입력한 텍스트나 숫자를 읽을 수 있다.
 *  
 */
public class ScannerEx {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // new 메모리에 올린다. (사용하겠다) // System 운영체제같은것 // in 입력
		
		String name, address; // 문자열 값을 담는 변수
		int age; // 정수 값을 담는 변수
		double weight; // 실수 값을 담는 변수
		
		/*
		 * alt + ctrl + 방향키 : 줄복사
		 * ctrl + D : 줄삭제
		 */
		System.out.println("이름, 주소, 나이, 체중을 빈칸으로 구분하여 순서대로 입력하세요.");
		name = scanner.next();			// name = "신현진"
		address = scanner.next();		// address = "서울"
		age = scanner.nextInt();		// age = 32
		weight = scanner.nextDouble();	// weight = 77
		
		System.out.printf("당신의 이름은 %s입니다.\n", name);
		System.out.printf("당신의 주소는 %s입니다.\n", address);
		System.out.printf("당신의 나이는 %d입니다.\n", age);
		System.out.printf("당신의 체중은 %.1fkg입니다.\n", weight); // .1 소수점 첫째자리까지만 입력
		
	}
}
