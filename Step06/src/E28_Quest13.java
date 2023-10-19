/*
 * 길이가 10인 정수형 배열을 선언해서
 * 숫자를 랜덤으로 1~30까지의 숫자를 생성해서 배열에 저장 (중복 가능)
 * 배열에 저장된 내용을 정렬해서 출력(내림/올림은  선택)
 */

import java.util.Arrays;

public class E28_Quest13 {
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = (int)(Math.random() * 30) + 1;
		}
		//버블정렬
		for(int i = 0; i < arr1.length - 1; i++) {
			for(int j = 0; j < arr1.length - 1 - i; j++) {
				if(arr1[j] > arr1[j+1]) {
					int temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		
		//삽입정렬
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = (int)(Math.random() * 30) + 1;
			
			for (int j = i; j > 0 && arr2[j] < arr2[j-1]; j--) {
				int temp = arr2[j];
				arr2[j] = arr2[j-1];
				arr2[j-1] = temp;
			}
			
		}
	
		
		System.out.println(Arrays.toString(arr2));
	}
}
