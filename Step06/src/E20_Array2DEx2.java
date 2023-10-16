
public class E20_Array2DEx2 {
	public static void main(String[] args) {
		int[][] arr = new int[][] {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12}
		};
		
//		전체 출력
		for(int i=0; i<arr.length; i++) { // 행번호 제어
		for(int j=0; j < arr[i].length; j++) { // 열번호 제어
			System.out.print(arr[i][j] + " ");
		}
		System.out.println();
		}
	}
}
