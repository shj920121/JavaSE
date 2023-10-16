/*
 * 정수형 배열 길이가 6인 배열을 생성
 * 로또번호 1세트를 완성성해서 출력
 * 로또번호 1~45, 중복된 번호 나오면 X
 * 
 * 반복문 중첩이 들어감
 */

import java.util.Arrays;
import java.util.Scanner;

public class E17_Quest9 {
	public static void main(String[] args) {
/*
 * 1. 배열 선언
 * 2. 반복문
 * 	2-1 랜덤으로 숫자를 뽑음
 * 	2-2 배열에 랜덤으로 뽑은 숫자가 있는지 체크
 * 	2-3	숫자가 중복되지 않았으면 배열에 저장
 * 	2-4 중복되었으면 저장하지 않음	
 * 3. 출력
 */		
		int[] arr = new int[6];
		
	    for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 45) +1;
			//중복체크
			for(int j = 0; j < i; j++) {
				//맨처음 값부터 마지막에 저장된 값 기준으로 중복된 값이 있는지 체크
				if (arr[i] == arr[j]) { //true일 경우 중복이 있다.
					i--;
					break;
				}
			}
	
		}
			
			System.out.println(Arrays.toString(arr));
			
	
			 
		
		 
		
	}
}
