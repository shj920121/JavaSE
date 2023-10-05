package section08;

public class RecursionEx {
	
	public static void printNumber(int n) {
		
		while(n > 0) {
			System.out.println(n);
			n--;
		}
		
	}
	
	//재귀 메서드
	/*
	 * recursionPrintNumber(10) -> 10
	 * recursionPrintNumber(9); -> 9
	 * 	recursionPrintNumber(8); -> 8
	 * 		recursionPrintNumber(7); -> 7
	 * 			recursionPrintNumber(6); -> 6
	 * 					...
	 * 				recursionPrintNumber(1); -> 1
	 * 
	 */
	public static void recursionPrintNumber(int n) {
		if(n > 0) {
			System.out.println(n);
			recursionPrintNumber(--n); // (--n) = (n-1)   // (n--) n이 먼저 연산되고 뒤에 -는 연산이 안된다 -> 오류
		}
	}
	
	
	
	
	public static void main(String[] args) {
		
		
			// 매개변수 10 -> 10~1 까지 출력하기
//			printNumber(10);
		recursionPrintNumber(10);
			
		}
		
}
	
	
	
	

