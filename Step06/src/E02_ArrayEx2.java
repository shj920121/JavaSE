public class E02_ArrayEx2 {
	public static void main(String[] args) {
		//배열 생성과 동시에 초기화 하는 방법 - 1
		int[] arr1 = {1,2,3,4,5};
		//arr1의 내용을 전부 출력
		for(int i=0; i<arr1.length; i++) {
			System.out.print("["+arr1[i]+"]");
		}
		
		System.out.println();
		System.out.println("===================");
		
		//배열 생성과 동시에 초기화 하는 방법 -2
		int[] arr2 = new int[] {5,6,7,8,9,10};
		for(int i=0; i<arr2.length; i++) {
			System.out.print("["+arr2[i]+"]");
		}
		System.out.println();
		System.out.println("===================");
		
		//정수형 배열 길이가 7인 배열을 생성 후 바로 출력
		//new로 만들면 자동으로 초기화 되어있음 0
		int[] arr3 = new int[7];
		for(int i=0; i<arr3.length; i++) {
			System.out.print("["+arr3[i]+"]");
		}
	}
}
