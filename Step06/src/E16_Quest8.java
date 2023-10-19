/*
 * 정수형 배열 길이 10인 배열을 생성한 뒤에
 * 입력한 숫자가 짝수면 맨뒤에서부터 채움
 * 입력한 숫자가 홀수면 맨앞에서부터 채움
 * 
 * 입력이 끝나면 전체 내용을 출력
 * 숫자 입력 : 1
 * [1,0,0,0,0,0,0,0,0,0]
 * 숫자 입력 : 4
 * [1,0,0,0,0,0,4]
 * 숫자 입력 : 3
 * [1,3,0,0,0,0,0,4]
 */

import java.util.Arrays;
import java.util.Scanner;

public class E16_Quest8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int left = 0, right = arr.length-1; // right = 9 직접 수 쓰는것 -> 하드코딩
//		for (int i = 0; i < arr.length; i++) {
		while(left <= right) { //left 와 right가 교차되는 지점에서 종료
			System.out.print("숫자 입력 > ");
			int n = sc.nextInt();
			
			if (n % 2 == 1)
				arr[left++] = n;
			else
				arr[right--] = n;
		}
		System.out.println(Arrays.toString(arr));
	}
}
