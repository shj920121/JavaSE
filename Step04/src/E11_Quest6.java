import java.util.Scanner;

public class E11_Quest6 {
	/*
	 * 	정수 하나를 입력 받은 후에
	 *  입력 받은 정수의 약수와 약수의 개수를 출력
	 *  
	 *  실행 예시>
	 *  숫자 입력 : 6
	 *  1 2 3 6
	 *  약수의 개수 : 4
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int n = sc.nextInt();
		
		int count = 0;
		
		for(int i=1;i<=n;i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n약수의 개수 : " + count);
	}	

}











