import java.util.Scanner;

public class E04_Quest1 {
	public static void main(String[] args) {
//		정수형 배열 길이가 7인 배열을 생성한 뒤에
//		배열에 숫자를 전부 사용자로부터 입력을 받아서 저장한 후에
//		배열에 있는 모든 값을 출력
/*	
 * 		예시>
 * 		0번째 숫자 입력 : 3
 * 		1번째 숫자 입력 : 4
 * 		...
 * 		6번째 숫자 입력 : 5
 * 
 * 		3 4 ... 5
 * 
 * 		Arrays.toString은 사용하지 않는다.
 */
		Scanner sc = new Scanner(System.in);
		int[] arr1 = new int[7];
		
		//	데이터 세팅
		for (int i = 1; i<arr1.length; i++) {			
			System.out.print(i + "번호 입력 > ");
			arr1[i] = sc.nextInt();	
		}
		//	결과 출력
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
			
		
		
	}
}
