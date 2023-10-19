import java.util.Scanner;

public class E06_Quest3 {
	public static void main(String[] args) {
/*
 * 정수형 배열 길이가 10인 배열을 생성한 후에
 * 정수를 입력받아서 배열의 각 요소에 전부 입력한 후
 * 배열에 저장된 값들 중 최대값, 최소값, 총합을 출력
 */
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int min,max,total;
		min = max = total = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			System.out.print("정수 입력 > ");
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		for(int i=1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			if(max<arr[i]) 				
				max = arr[i];
			if(min>arr[i]) 				
				min = arr[i];
		} 
		System.out.println();
		System.out.println("총합 : " + total);
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
	
	}
}
