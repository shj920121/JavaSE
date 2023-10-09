package Step02;

import java.util.Scanner;

public class Quest5 {
/*
 * 숫자 두개를 입력 받은 다음 두수의 뺄셈 결과를 무조건 양수로 출력
 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		
		System.out.print("숫자 두개를 입력하세요 : ");
		
		int num1, num2;
		num1 = sc.nextInt();
		num2 = sc.nextInt();		
		int result = num1 - num2;
		int result2 = result >= 0 ? result :  result * -1;
		
		System.out.println(" 결과값은 " + "[" + result2 + "]" + " 입니다.");
				
		
	}
}
