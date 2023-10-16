import java.util.Scanner;

public class E02_IfQuest {
/*
 * 	숫자하나를 입력 받아서
 * 	해당 숫자가 짝수인지 홀수인지 0인지 구분해서 출력
 * 
 * 	실행 예시> 
 * 	숫자 입력 : 5
 * 	홀수입니다.
 * 
 * 	숫자 입력 : 0
 * 	0입니다.
 * 	
 * 	숫자 입력 : 10
 * 	짝수입니다.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		
		if (num == 0) {
			System.out.println("0입니다.");
		}
		if (num % 2 == 1) {
			System.out.println("홀수입니다.");
		}
		if (num % 2 == 0 && num != 0) {
			System.out.println("짝수입니다.");
		}
// if만 쓰면 작업량이 많아진다.
		
		
		}
		
}


