
public class E25_BubbleSort {
	public static void main(String[] args) {
		int[] arr = {5, 7, 9, 3, 1};
		//기준값이랑 두 ㅣ에값이랑 비교햇 ㅓ큰값을 뒤로 , 작은 값을 앞으로 저장(데이터 교환)
		// 열 -1 번만큼 비교 , 4pass까지
		
		//한줄 출력
		for(int i = 0; i < arr.length-1; i++) {
			for(int j=0; j < arr.length -1 -i; j++) { // -i 한칸씩 줄어드니까
				if(arr[j] < arr[j+1]) { // arr[j] > arr[j+1] 오름차순
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
			
		
			for(int n : arr) {
				System.out.printf("%2d ",n);		
			}
		System.out.println();
	}
}
