import java.util.Arrays;

public class E03_ArrayEx3 {
	public static void main(String[] args) {
//		정수형, 문자형, 실수형, 논리형, 문자열 배열을 
//		길이가 4인 배열을 생성 후 전부 출력
		int[] arr1 = new int[4];
		char[] arr2 = new char[4];
		double[] arr3 = new double[4];
		boolean[] arr4 = new boolean[4];
		String[] arr5 = new String[4];
		
		for(int i=0; i<arr1.length; i++) {
			System.out.print("["+arr1[i]+"]");
		}
		System.out.println();
		System.out.println("===================");
		for(int i=0; i<arr2.length; i++) {
			System.out.print("["+arr2[i]+"]");
		}
		System.out.println();
		System.out.println("===================");
		for(int i=0; i<arr3.length; i++) {
			System.out.print("["+arr3[i]+"]");
		}
		System.out.println();
		System.out.println("===================");
		for(int i=0; i<arr4.length; i++) {
			System.out.print("["+arr4[i]+"]");
		}
		System.out.println();
		System.out.println("===================");
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		// 기본적으로 0으로 저장된다
	
	}
}
